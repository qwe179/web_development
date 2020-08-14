package java06_class.field;

//import java.util.Scanner;

public class MemberFieldEx {
//	static Scanner sc =new Scanner(System.in);
	int num = 10; //인스턴스 변수, main은 static이라 사용 못함
	public static void main(String[] args) {
//		String a = MemberFieldEx.sc.nextLine();
//		System.out.println(a);
		MemberField_01 mf01 = new MemberField_01();
		MemberField_01 mf02 = new MemberField_01();
		MemberField_01 mf03 = null;
		
//		System.out.println(mf01.num);
		
//		mf01.printNum();
		System.out.println(mf01.getNum());
		mf02.setNum(777);
		
		System.out.println(mf02.getNum());
		
		MemberField_01 mf09 = new MemberField_01();
		System.out.println(mf09.getNum());
		//NullPointerException 발생
		//null 참조값을 이용하여 멤버에 접근할 때 발생한다
		//엄청엄청 자주 보이는 예외!! - 꼭 기억할 것
		//System.out.println(mf03.getNum());
		System.out.println();
		System.out.println("-----클래스변수 테스트 ----");
		
		MemberField_02 mf04 = new MemberField_02();
		MemberField_02 mf05 = new MemberField_02();
		
		System.out.println(mf04.city);
		System.out.println(mf05.city);
		
		mf04.city = "Busan";
		
		System.out.println("---Busan 대입---");
		System.out.println(mf04.city);
		System.out.println(mf05.city);
		
		MemberField_02.city = "Incheon";
		System.out.println(MemberField_02.city);
		System.out.println(mf04.city);
		System.out.println(mf05.city);
		
		System.out.println(MemberField_02.city);
		
		//정적 메소드 호출
//		System.out.println(MemberField_02.getCity());
	}
}
