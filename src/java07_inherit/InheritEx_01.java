package java07_inherit;

class Parent{
	String name;
	int num;
	
	public void display() {
		System.out.println("�θ� Ŭ������ �޼ҵ�");

	}	
}

class Child extends Parent{
	int score;
	
	public void print() {
		System.out.println("�ڽ� Ŭ������ �޼ҵ�");
	}
	@Override //������̼�, Annotation (�������̵� ������̼�)
	public void display() {
		System.out.println("��ӹ��� �޼ҵ� ������");//�������θ������ִ���ɾ�����(override)
	}
	//@Override - �������̵� ������̼�
	//�޼ҵ� ���� �������ָ� �ش� �޼ҵ尡 ��ӹ��� �޼ҵ带
	//�������ϴ� �ùٸ� �ڵ����� �����Ѵ�(�ƴϸ� ������)
}



public class InheritEx_01 {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.name = "Alice";
		p.num = 123;
		p.display();
		
		System.out.println("-----------");
		
		Child c = new Child();
		//��ӹ��� �����
		c.name = "bob";
		c.num = 123;
		c.display();
		
		//�ڽ�Ŭ������ ������ �����
		c.score=9999;
		c.print();
			
	}
}
