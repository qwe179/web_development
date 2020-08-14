package java07_inherit;

class Parent2{
	public int num;
	
	public void display() {
		System.out.println("�θ� �޼ҵ�");
		System.out.println(num);
	}
	
}

class Child2 extends Parent2{
	private int num;
	
	@Override
	public void display() {
		num = 100;
		System.out.println("�������̵� �޼ҵ�");
		System.out.println(num);
		System.out.println(super.num);
	}
}

public class InheritEx_02 {
	public static void main(String[] args) {
		Parent2 p = new Parent2();
		p.num = 333;
		p.display();
		
		System.out.println("------------");
		
		Child2 c = new Child2();
//		c.num = 444;
		c.display();
		
		
		System.out.println("----------");
		//ClassCastException �߻�
		// �θ�Ŭ����Ÿ���� �ڽ�Ŭ����Ÿ������ ����ȯ �� �� ����
		// ���Ե� �Ұ�
//		Child2 cp = (Child2) new Parent2(); //Child2 <-Parent2
		
		System.out.println("-----------");
		//�θ�Ŭ����Ÿ�Կ� �ڽ�Ŭ����Ÿ���� ������ �� �ִ�.
		Parent2 pc = new Child2(); //Parent2 <-Child2
		pc.display(); //������ �ν��Ͻ��� Ÿ������ �޼ҵ尡 ȣ���
		
		
		
	}
}
