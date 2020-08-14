package java07_inherit;

class Parent4{
//	public int num = 111;
//	private int num = 111;
	protected int num = 111;
	public Parent4() {
		System.out.println("부모 디폴트 생성자");
	
	//this - 자기 참조 객체
		System.out.println(this.num);
	
	}
	
}

class Child4 extends Parent4{
	private int num = 222;
	
	public Child4() {
		System.out.println("자식 디폴트 생성자");
		System.out.println("this.num : " + this.num);//자기 객체 참조
		System.out.println("this.num : " + super.num);//자기 객체 참조
	}
}

public class InheritEx_04{
	public static void main(String[] args) {
	
		Parent4 p = new Parent4();
		System.out.println("--------");
		Child4 c = new Child4();
		//부모 생성자 호출하고
		//자식 생성자를 호출한다
		
		
	}
		
}