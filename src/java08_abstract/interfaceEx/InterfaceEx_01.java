package java08_abstract.interfaceEx;
//인터페이스
interface TestInterface{
	public static final int NUM =888;//public static final 생략해도되는데 꼼꼼히 써주는거
	int NUMBER = 100; //상수로 만들어짐
	//---------------------------------------------
	public abstract void display();
	//메소드에 abstract 키워드가 없어도 추상 메소드로 정의된다
	public void out();
		
}
//인터페이스를 상속(구현)하고 있는 클래스
//->인터페이스에 정의된 추상메소드를 반드시 구현해야한다(오버라이딩)
class Test implements TestInterface{
	public static final int NUM = 888;//상수
	
	@Override
	public void display() {
	
	}
	@Override
	public void out() {
	
		
	}
	
}





//추상클래스
abstract class TestClass{
	public static final int MAX =999;//상수
	
	public abstract void method(); //추상메소드
}






public class InterfaceEx_01 {
	public static void main(String[] args) {
		TestClass tc1;//객체 변수 선언
//		tc1 = new TestClass(); //에러,추상클래스는 객체 생성 안됨
		System.out.println(TestClass.MAX);
		System.out.println("--------------");
		System.out.println(TestInterface.NUM);
	}
}
