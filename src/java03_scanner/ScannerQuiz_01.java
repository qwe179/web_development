package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_01 {

	public static void main(String[] args) {
		
		String name;
		char gender;
		int age, scoreEng,scoreMath,scoreKor;
		double average;

		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.print("성별을 입력하세요(M/F) : ");
		sc.nextLine();
		gender = sc.nextLine().charAt(0);
		System.out.print("국어점수를 입력하세요 : ");
		scoreKor = sc.nextInt();
		System.out.print("영어점수를 입력하세요 : ");
		scoreEng = sc.nextInt();
		System.out.print("수학점수를 입력하세요 : ");
		scoreMath = sc.nextInt();

		int total=scoreEng + scoreMath + scoreKor;
		average = total/(double)3;
		
		
		
		System.out.println("이름\t나이\t성별\t국어\t영어\t수학\t총점\t평균");
		System.out.println(
				name+"\t"+
				age+"\t"+
				gender+"\t"+
				scoreKor+"\t"+
				scoreEng+"\t"+
				scoreMath+"\t"+
				total+"\t"
				);
		System.out.printf("%.2f",average);
		
		
		Scanner in = new Scanner(System.in); //표준입력객체
		
	}
}
