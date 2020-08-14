package java03_scanner;

import java.util.Scanner;

public class ScannerEX_04 {


	public static void main(String[] args) {

		//Scanner 객체 사용할 때 입력 버퍼 문제 조심할 것
		// nextLine()을 사용하기 직전에 nextLine()이 아닌
		// 다른 메소드를 사용했다면 그 중간에 nextLine()을
		// 한번 더 사용해주어야 한다.
		
		
		
		
		Scanner sc = new Scanner(System.in); //입력 객체
		
		System.out.println("---입력----");
		System.out.println("Input Number : ");
		int num = sc.nextInt();
		
		sc.nextLine();    ///////////nextInt 같은 메소드가 nextLine이전에 들어가면 중간에 nextLine한번더써줘야함... 입력버퍼 문제 해결책 
		/////////그이유는 입력버퍼때문에 nextLine에서 newxInt가 사용한 버퍼에 남아있던 \n을 인식해버려서 넘어가져버림
		
		System.out.println("Input String : ");
		String str = sc.nextLine();
		
		System.out.println(); //줄바꿈
		System.out.println("--- 출력 ---");
		System.out.println("숫자 : " + num);
		System.out.println("문자열 : " + str);
		
	} 

}

