package java07_inherit;

class Parent4{
//	public int num = 111;
//	private int num = 111;
	protected int num = 111;
	public Parent4() {
		System.out.println("�θ� ����Ʈ ������");
	
	//this - �ڱ� ���� ��ü
		System.out.println(this.num);
	
	}
	
}

class Child4 extends Parent4{
	private int num = 222;
	
	public Child4() {
		System.out.println("�ڽ� ����Ʈ ������");
		System.out.println("this.num : " + this.num);//�ڱ� ��ü ����
		System.out.println("this.num : " + super.num);//�ڱ� ��ü ����
	}
}

public class InheritEx_04{
	public static void main(String[] args) {
	
		Parent4 p = new Parent4();
		System.out.println("--------");
		Child4 c = new Child4();
		//�θ� ������ ȣ���ϰ�
		//�ڽ� �����ڸ� ȣ���Ѵ�
		
		
	}
		
}