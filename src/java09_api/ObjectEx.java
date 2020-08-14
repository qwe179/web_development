package java09_api;
class Point implements Cloneable{  ///point class Clone�ǰ� ���ּ��� �ϴ� �������̽�
	int x;//x��ǥ
	int y;//y��ǥ
	
	public Point(int x, int y){
		this.x=x;
		this.y=y;

	}
	@Override
	public boolean equals(Object obj) {
		//p2.equals(p3);
		//p2->this
		//p3->obj
		if(this.x ==((Point)obj).x
				&&this.y ==((Point)obj).y) {
			return true; //������
		}
		return false; //�������� ����
		
//		return super.equals(obj);
	}
	
	
//	@Override
//	public String toString() {
////      return super.toString();
//		return "point [x="+x+","+"y="+y+"]";
//		
//	}
	@Override
	//	protected Object clone() throws CloneNotSupportedException { //���������� protected Ǯ���ֱ����� Override��
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
}




public class ObjectEx{
	public static void main(String[] args) {////p_ori.clone(); xxxxxxxx ���������ڴ� Ŭ�������ǰ�����		
		Object obj = new Object();            ////����� �θ� ���Ƶ� ���� ����������� ����������.. Ŭ�������̾�׷��̶� �ٸ�
		Point p1 = new Point(10,20);
		System.out.println(obj);
		System.out.println(p1);
		System.out.println(p1.toString());
		System.out.println("\n----equals()-------");
		Point p2 = new Point(11,22);		
		Point p3 = new Point(11,22);
		Point p4 = p2;
		System.out.println("p2 :" + p2);
		System.out.println("p3 :" + p3);
		System.out.println("p4 :" + p4);
		
		//p2 - p3 : ����( ���� ���� ������ �ִ�, equality)
		//p2 - p4 : ����( ���� ��ü,identitys)
		
		//���ϼ� �� - ���� ��ü���� Ȯ���Ѵ�, == ������ �̿�
		System.out.println("p2==p3 : " + (p2==p3));
		System.out.println("p2==p4 : " + (p2==p4));
		
		//��� �� - ���� ���� ������ �ִ��� Ȯ���Ѵ�, equals() ���
		System.out.println("p2.equals(p3) :" + (p2.equals(p3)));
		System.out.println("p2.equals(p4) :" + (p2.equals(p4)));
		
		
		
		System.out.println("\n-----hashCode()-----");
		System.out.println("p2 : " +p2.hashCode());
		System.out.println("p3 : " +p3.hashCode());
		System.out.println("p4 : " +p4.hashCode());
		
		System.out.println("-----------------------");
		
		String s1 = new String("Apple");
		String s2 = new String("Apple");
		String s3 = new String("Banana");
		String s4 = s1;
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		System.out.println("s3 : " + s3.hashCode());
		System.out.println("s4 : " + s4.hashCode());
		System.out.println("\n----clone()---------");
		
		Point p_ori = new Point(33,44);
		
		Point p_clone1=p_ori; //���� ����
		
		//�����ڸ� �̿��� ���� ����
		Point p_clone2 = new Point(p_ori.x,p_ori.y);
		//-------------------------------------
		//clone()�� �̿��� ���� ����
//		Point p_clone3 = p_ori.clone(); ///��ȯ���˾Ƽ� �ٲ㼭 ����� object��� �θ�Ŭ������ objectŸ���� ��(��� Ÿ���� ����ϱ�����)
										//�θ�Ŭ������ �ڽ�Ŭ������ �����Ϸ��� �ϴ� ����
		Point p_clone3 = null;
		try {
			p_clone3 = (Point)p_ori.clone();
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}///CloneNotSupportedException ����ó������ �Ƚ�ٰ� ���� ����
		
		System.out.println(p_clone3);
		System.out.println("p_ori.equals(p_clone3) : " 
				+p_ori.equals(p_clone3) );
		System.out.println("p_ori==p_clone3 : " 
				+(p_ori==p_clone3) );
	}

}
