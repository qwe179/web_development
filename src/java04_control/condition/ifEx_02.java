package java04_control.condition;

public class ifEx_02 {
	public static void main(String[] args) {
	
		int num = 10;
		
		if(num==15) {
			System.out.println("Hi");
			
		}
		System.out.println("Hello");
		
		System.out.println("------------------------");
		//{}중괄호는 코드를 묶어주는 역할을 한다
		//프로그램 수행 순서에 영향을 주지 않는다
		{
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
		
		}
		System.out.println("------------------------");
		
		//제어문은 제어문 다음에 오는 한 개의 요소에만 영향을 준다.
		if(false)
			System.out.println("if문 코드 1");  //한줄이어도 중괄호 써주는게 나음
		System.out.println("if문 코드 2");
		
		System.out.println("------------------------");
		
		if(false);{  //세미콜론조심
			System.out.println("HI");
			System.out.println("Hello");
			System.out.println("Hola");
			
		}
		
	}
}
