package java07_inherit;

class Parent2{
	public int num;
	
	public void display() {
		System.out.println("부모 메소드");
		System.out.println(num);
	}
	
}

class Child2 extends Parent2{
	private int num;
	
	@Override
	public void display() {
		num = 100;
		System.out.println("오버라이딩 메소드");
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
		//ClassCastException 발생
		// 부모클래스타입을 자식클래스타입으로 형변환 할 수 없다
		// 대입도 불가
//		Child2 cp = (Child2) new Parent2(); //Child2 <-Parent2
		
		System.out.println("-----------");
		//부모클래스타입에 자식클래스타입을 대입할 수 있다.
		Parent2 pc = new Child2(); //Parent2 <-Child2
		pc.display(); //생성된 인스턴스의 타입으로 메소드가 호출됨
		
		
		
	}
}
