package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_02 {

	public static void main(String[] args) {
		int height ,base;
		//계산이 완료된 값 : 넓이
		double area;
	Scanner sc = new Scanner(System.in); //키보드 입력 객체
	
	System.out.print("밑변의 길이를 입력하세요 : ");
	
	base= sc.nextInt();
	System.out.print("높이를 입력하세요 : ");
	height= sc.nextInt();
	
	System.out.println("[TEST] base : " + base );
	System.out.println("[TEST] height : " + height);

	area= (base * (double)height)/2;
	
	
	
	System.out.println("넓이 : "+ area);
	//////////계산,넓이,결과 출력
	}
}
