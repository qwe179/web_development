package java03_scanner;

//java.util.Scanner를 패키지를 제외하고 Scanner라고만 사용할 수 있도록 해주는 코드
import java.util.Scanner;
public class ScannerEX_01 {

	public static void main(String[] args) {
		
		//class Scanner
		//스캐너 클래스
		//키보드의 입력을 받아주는 기능
		int num; //변수 선언
		num = 123; //변수값 대입
		
		// -----------------------------------------------------------------------------------
//		java.util.Scanner input;
		
		Scanner input; //객체 변수 선언
		input= new Scanner(System.in); //입력 객체 생성
		
		int data; //정수형 변수 선언
		
		//키보드로 입력한 정수값을 data 변수에 대입(저장)한다
		data = input.nextInt();
		
		//입력된 데이터(변수값) 출력
		input.close();
		System.out.println("입력한 값 : " +data);
		
		
		
	}

}
