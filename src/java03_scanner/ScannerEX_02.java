package java03_scanner;

//java.util.Scanner를 패키지를 제외하고 Scanner라고만 사용할 수 있도록 해주는 코드
import java.util.Scanner;
public class ScannerEX_02 {

	public static void main(String[] args) {
		
		//문자열 입력받기
		//1.입력객체 변수 선언 (java.util.Scanner)
		Scanner in;
		in= new Scanner(System.in);
		//2.입력객체 생성(new)
		//3.문자열 입력받기 (String)
		System.out.print("문자열 입력하세요 : ");
		String str = in.nextLine();
		
		//4. 입력받은 문자열 출력하기
		System.out.println("입력한 내용 : " + str);
		
		//--------------------------------------------------------
		int intNum = in.nextInt();
		double doubleNum = in.nextDouble();
		boolean bData = in.nextBoolean();
		
		
//		char ch = in.nextChar();//char 형 전용 입력 메소드는 없음
		
	}

}
