package java07_inherit;

class Parent5{
	protected int num;
	public Parent5() {
		System.out.println("�θ� ����Ʈ ������");
	}
	public Parent5(int num) {
		this.num = num;
		System.out.println("�θ� �Ű������ִ� ������");
		
	}
}
class Child5 extends Parent5{
	public Child5() {
		super(); //���� ������, �����Ǿ�����		
		
		System.out.println("�ڽ� ����Ʈ ������");
		
	}
	
	public Child5(int num) {
		//super();
		super(num);
//		this.num = num;
		//Child5���� ����ʵ�� num ������ ���
		//super����(��ӹ��� �ʵ�)���� num������ ã�´�
		
//		super.num = num;
		//super����(��ӹ��� �ʵ�)���� num������ ã�´�
		System.out.println("�ڽ� �Ű������ִ� ������");
		
	}
	
}

public class InheritEx_05 {
	public static void main(String[] args) {
		
		Parent5 p = new Parent5();
		System.out.println("---------");
		
		Child5 c = new Child5();
		Parent5 p2 = new Parent5(123);
		System.out.println("---------");
		Child5 c2 = new Child5(555);
	
		
		
	}
}
