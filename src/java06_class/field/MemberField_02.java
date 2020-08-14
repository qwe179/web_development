package java06_class.field;

public class MemberField_02 {
	//클래스 변수, 정적 변수, static 변수
//	private static String city ="Seoul";
	public static String city ="Seoul";
	
//	public String getCity() {  //쓸모없는코드, private static되있으면 접근못함
//		return city;
//	}
	//정적 메소드, static 메소드  //객체생성안해도 곧바로 쓸수있는 메소드
	public static String getCity() {
		return city;
	}
////class영역에 있는거 초기화시키면 ..인스턴스변수로 
//참조하는 것이 다 바뀜..

//정적객체 모든 객체들의 공용 자원으로 사용(읽기전용)
	//--------------------------------------
	
	private int num; //인스턴스 변수
	public static void test() {//정적 메소드
//		System.out.println(num);//에러
		
	}
	//정적메소드에서 인스턴스변수 사용 불가
	//--------------------------------------
	private int num2; //정적 변수, 클래스 변수
	
	public void test2() {//일반 메소드
		System.out.println(num2);
	}
	//일반 메소드에서 정적 변수 사용하는 것은 문제없음
	
}




