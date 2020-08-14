package java06_class.overloading;

public class OverloadingEx {
	public static void main(String[] args) {
		System.out.println(); //오버로딩 같은이름으로 다양한데이터타입 처리
	
	Overloading_01 o101=new Overloading_01();
	
	System.out.println("---display() ---");
	o101.display();
	
	System.out.println("---display(11,22) ---");
	o101.display(11,22);
	System.out.println("---display() ---");
	o101.display();
	}
}
