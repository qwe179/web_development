package java09_api;
class Point implements Cloneable{  ///point class Clone되게 해주세요 하는 인터페이스
	int x;//x좌표
	int y;//y좌표
	
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
			return true; //동등함
		}
		return false; //동등하지 않음
		
//		return super.equals(obj);
	}
	
	
//	@Override
//	public String toString() {
////      return super.toString();
//		return "point [x="+x+","+"y="+y+"]";
//		
//	}
	@Override
	//	protected Object clone() throws CloneNotSupportedException { //접근제한자 protected 풀어주기위해 Override함
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
}




public class ObjectEx{
	public static void main(String[] args) {////p_ori.clone(); xxxxxxxx 접근제한자는 클래스관의관계임		
		Object obj = new Object();            ////상속은 부모가 같아도 따로 생각해줘야함 접근제한자.. 클래스다이어그램이랑 다름
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
		
		//p2 - p3 : 동등( 같은 값을 가지고 있다, equality)
		//p2 - p4 : 동일( 같은 객체,identitys)
		
		//동일성 비교 - 같은 객체인지 확인한다, == 연산자 이용
		System.out.println("p2==p3 : " + (p2==p3));
		System.out.println("p2==p4 : " + (p2==p4));
		
		//동등성 비교 - 같은 값을 가지고 있는지 확인한다, equals() 사용
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
		
		Point p_clone1=p_ori; //얕은 복사
		
		//생성자를 이용한 깊은 복사
		Point p_clone2 = new Point(p_ori.x,p_ori.y);
		//-------------------------------------
		//clone()을 이용한 깊은 복사
//		Point p_clone3 = p_ori.clone(); ///반환값알아서 바꿔서 쓰라고 object라는 부모클래스의 object타입을 씀(모든 타입을 사용하기위함)
										//부모클래스를 자식클래스로 대입하려고 하는 행위
		Point p_clone3 = null;
		try {
			p_clone3 = (Point)p_ori.clone();
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}///CloneNotSupportedException 예외처리구문 안썼다고 나는 오류
		
		System.out.println(p_clone3);
		System.out.println("p_ori.equals(p_clone3) : " 
				+p_ori.equals(p_clone3) );
		System.out.println("p_ori==p_clone3 : " 
				+(p_ori==p_clone3) );
	}

}
