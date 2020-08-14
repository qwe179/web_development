package java03_scanner;

//java.util.Scanner를 패키지를 제외하고 Scanner라고만 사용할 수 있도록 해주는 코드
import java.util.Scanner;
public class ScannerEX_03 {

	public static void main(String[] args) {

		
		//Scanner를 이용하여 char입력 처리하기
		// String은 char형을 여러 모아놓은 타입
		// String으로 입력을 받고 한 글자(문자)를 떼어낸다 -> char
		//----------------------------------------------------------------------
		
		Scanner sc = new Scanner(System.in); //입력 객체
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine(); //문자열을 입력받아 str객체에 저장
		
		//입력한 문자열 확인
		System.out.println("입력된 문자열 :" + str);
		
		char ch =str.charAt(0);
		
		System.out.println("0번째 단일 문자 : " + ch);
		
		System.out.println("------------");
		System.out.println("성별을 입력하세요 : ");
		
		String genderString = sc.nextLine();
		char gender = genderString.charAt(0);
//		char gender = sc.nextLine().charAt(0); //일케도 쓸수있다.
		System.out.println("입력한 성별 : " + gender);
	} // main method end

}

