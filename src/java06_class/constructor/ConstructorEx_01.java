package java06_class.constructor;

class Constructor_01{
	private int num1;
	private int num2 = 999;

	//매개변수가 없는 생성자 - 디폴트 생성자(매개변수가없을때)
	public Constructor_01() {  //default 생성자	
		System.out.println("디폴트 생성자 호출");
		
		//멤버필드 초기화
		// 객체가 생성되면 멤버필드(인스턴스변수)의 초기값을 설정함
		num1 = 500;
		num2 = 600;
		
	}
	
	//매개변수가 있는 생성자
	public Constructor_01(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("매개변수 있는 생성자 호출");
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
}

public class ConstructorEx_01 {
	public static void main(String[] args) {
	
	
		Constructor_01 c01; //객체 변수 선언
		c01 = new Constructor_01(); //객체 생성 - 생성자 호출
		
		System.out.println(c01.getNum1());
		System.out.println(c01.getNum2());
		
		
		//-----------------------------------------------------------------------------------
		Constructor_01 c02; //객체 변수 선언
		c02 = new Constructor_01(111,222); //객체 생성 - 생성자 호출
		System.out.println("c02.getNum1() : "+c02.getNum1());
		System.out.println("c02.getNum1() : "+c02.getNum2());
	}
}

