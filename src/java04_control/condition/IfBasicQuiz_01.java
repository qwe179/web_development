package java04_control.condition;

import java.util.Scanner;

public class IfBasicQuiz_01 {
	public static void main(String[] args) {
	
//		 + 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
//			>> Input Number : -3
//			>> 음수입니다
		
		Scanner sc = new Scanner(System.in);
		/*System.out.print("양수인지 음수인지 판별할 숫자를 입력하세요! : ");
		
		int num1 = sc.nextInt();
		
		if(num1 <0 ) {
			System.out.println("음수입니다.");
		}
		else if (num1 > 0) {
			System.out.println("양수입니다."); 
		}
	
System.out.println("---------------");

//	 + 입력한 데이터가 3의 배수인지 판별하시오
//	  (% 연산자 사용)
//		>> Input Number : 7
//		>> 3의 배수가 아닙니다
		System.out.print("3의 배수일까? : ");
//		int num2 = sc.nextInt();
		if (num1%3 !=0) {
			
			System.out.println("3의배수가 아닙니다");
			
		}
		else  {
			System.out.println("3의 배수입니다!!");
		}
		
		System.out.println("---------------");
//	 + 두 수를 입력 받아 큰 수를 출력하시오
//		>> Input Number1 : 44
//		>> Input Number2 : 88
//		>> 88 이 더 큰 수
		
		int input1, input2;
		System.out.print("비교할 숫자를  입력하세요. 첫번째 숫자 : ");
		input1 =sc.nextInt();
		System.out.print("두번째 숫자 : ");
		input2 = sc.nextInt();
		
		if (input1<input2) {
			System.out.println("더큰숫자는" + input2+"입니다");
			
		}
		else if(input1 > input2){System.out.println("더 큰숫자는 " + input1 + "입니다");

	
		}
		else{

			System.out.println("숫자가같아서 판별 못해요~");
		}
		System.out.println("---------------");

		*/
		
		
		
		
		
		
		
		
		
		
		/*
		
		
		System.out.println("----------------선생님코드-------------");	
		//---------------변수 선언 --------------
		int num3, num4; //숫자 2개
		//---------1번 양수 음수 판별----------------------
//		+ 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
		
		// 숫자 하나 입력받기
		System.out.print("Input Number : ");
		num3 = sc.nextInt();
//		양수인지 음수인지 판별
		if(num3 > 0) { //양수일 때 처리할 코드
			System.out.println("num3는 양수입니다");

			
		}
		//음수일 때 처리할 코드
		if(num3 < 0) {
			
			System.out.println("num3은 음수입니다");
		}
		
		if (num3 ==0) { //0일 때
			System.out.println("num3은 0 입니다");
			
			
		}
		
		//------------2번 3의 배수 판별 ----------------
		// + 입력한 데이터가 3의 배수인지 판별하시오
//		(% 연산자 사용)
		
		//숫자 하나 입력받기
		System.out.print("Input Number : ");
		num3 = sc.nextInt();
		
		// **추가 : 0은 배수로 취급하지 않는다
		if(num3%3 == 0 && num3 !=0) {//3의 배수일 때
			System.out.println("num3["+num3+"] 은/는 3의 배수");
		}
		
		//3의 배수가 아닐 때
		if(num3%3 != 0 || num3 ==0) {//3의 배수일 때... 0들어가면??
			System.out.println("num3["+num3+"] 은/는 3의 배수가 아님");	
		}
		//----------------------------------------
		*/
		
		
		//----------3번 두 숫자 중 큰 수 ---------
//		+ 두 수를 입력받아 큰 수를 출력하시오
		
		
		
		//숫자 두 개 입력받기
		int num3, num4;
		
		System.out.println("Input Number3 : ");
		num3 = sc.nextInt();
		System.out.println("Input Number4 : ");
		num4 = sc.nextInt();
		
		//큰 수를 출력하기
		
		if(num3 > num4) { //num1이 클 때
			System.out.println("num3[" + num3+ "] 이/가 큽니다");
		}
		
		if(num3 < num4) { //num2이 클 때
			System.out.println("num4[" + num4+ "] 이/가 큽니다");
			
			
		}
		if (num3 ==num4) {
			
			System.out.println("두 수가 같다");
		}
		
		
		//-------------------------------------------
		
		
	}
}

