package java01_variables;

public class VariablesEx_07 {

	public static void main(String[] args) {
		
		//자바의 기본형
		// 8가지 기본데이터타입(Primitive Type)
		// 참조형 데이터타입(Reference, class)
		
		
		//---------------------------------------
		//String 타입
		// 문자열
		// 참조형 데이터타입 중 하나
		// " " 로 여러 개의 문자를 감싸서 표현
		
		String fruit; //문자열 변수 선언
		fruit = "Apple"; //문자열 "Apple" 값 대입(저장)
		System.out.println(fruit);
		
		fruit ="Banana";
		System.out.println(fruit);
		
		
		
		
		
		
		
		
		String name = "jenny";
		int age = 26;
		char gender = '여';
		double height = 160.66;
		
		System.out.println("이름 :" + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);	
		System.out.println("키 : " + height);	
		
		
//		변수에 알맞은 타입 찾기
//		int(정수 - 소수점 이하 없는 숫자)
//		double(실수 - 소수점 이하 있는 숫자)
//		char(문자 한 개 - ''로 표현, 대소문자 ,숫자, 한글, 기호 등)
//		boolean(true/false)
//		String(문자열, 문자 여러 개를 한번에 - ""로 표현)
//		이름 - String
//		나이 - int
//		성별 - String, char
//		키 - double
		
//		2.변수 선언
		String name2;//이름 변수 선언
		int age2;//나이 변수 선언
		char gender2;//성별 변수 선언
		double height2;//키 변수 선언
		
//		3.값 대입
		name2 = "홍길동";
		age2 = 55;
		gender2 = '남';
		height2 = 222.22;
		
//		4. 모든 데이터를 출력
		System.out.println("이름 :" + name2);
		System.out.println("나이 : " + age2);
		System.out.println("성별 : " + gender2);	
		System.out.println("키 : " + height2);	
				
	}
	
	
	
}
