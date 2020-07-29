//소스코드가 포함된 패키지 나타냄
package java01_variables;
import java.util.Scanner;

//클래스 (프로그램의 기본 구성요소, 객체지향에서 자세히 다룸)
public class VariablesEx_01 {

	//들여쓰기
	
	//메인 메소드 -프로그램의 시작점
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		System.out.println("입력 : " +message);
		
		System.out.println(123); //int형 데이터          /
		System.out.println(3.14); //double형 데이터
		System.out.println(true); //boolean형 데이터
		System.out.println('Q'); //char형 데이터`

	}//메인 메소드 정의 끝
	
	
	
} //클래스 정의 끝
