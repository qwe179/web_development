package java03_scanner;

import java.util.Scanner;

public class ScannerEX_05 {

	public static void main(String[] args) {

		
		//문자열 입력 처리 메소드(기능)
		// nextLine(), next()
		
		//입력 객체 생성
		
		Scanner sc = new Scanner(System.in);
		
		String str1;
		String str2;
		
		//문자열 입력
		System.out.println("Input String : ");
		
//		str1 = sc.nextLine();
//		str2 = sc.nextLine();
		
		str1 = sc.next();
		str2 = sc.next();
		
		System.out.print('\n'); //줄바꿈 코드, 개행 코드
		System.out.println(); //줄바꿈 코드, 개행 코드
		
		System.out.println("--- 출력 ---");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		//-----------------------------------------------------------------------
		
		//nextLine()
		//개행문자(엔터값)을 기준으로 하나의 문자열을 판단한다
		
		//next()
		//공백문자를 기준으로 하나의 문자열을 판단한다.

	} 

}

	