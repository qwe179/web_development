package java07_inherit;

class Parent{
	String name;
	int num;
	
	public void display() {
		System.out.println("부모 클래스의 메소드");

	}	
}

class Child extends Parent{
	int score;
	
	public void print() {
		System.out.println("자식 클래스의 메소드");
	}
	@Override //어노테이션, Annotation (오버라이딩 어노테이션)
	public void display() {
		System.out.println("상속받은 메소드 재정의");//기존에부모한테있던기능없어짐(override)
	}
	//@Override - 오버라이딩 어노테이션
	//메소드 위에 적용해주면 해당 메소드가 상속받은 메소드를
	//재정의하는 올바른 코드인지 검증한다(아니면 에러남)
}



public class InheritEx_01 {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.name = "Alice";
		p.num = 123;
		p.display();
		
		System.out.println("-----------");
		
		Child c = new Child();
		//상속받은 멤버들
		c.name = "bob";
		c.num = 123;
		c.display();
		
		//자식클래스의 고유한 멤버들
		c.score=9999;
		c.print();
			
	}
}
