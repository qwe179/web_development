package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_01 {

	public static void main(String[] args) {
		
		String name;
		char gender;
		int age, scoreEng,scoreMath,scoreKor;
		double average;

		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		System.out.print("������ �Է��ϼ���(M/F) : ");
		sc.nextLine();
		gender = sc.nextLine().charAt(0);
		System.out.print("���������� �Է��ϼ��� : ");
		scoreKor = sc.nextInt();
		System.out.print("���������� �Է��ϼ��� : ");
		scoreEng = sc.nextInt();
		System.out.print("���������� �Է��ϼ��� : ");
		scoreMath = sc.nextInt();

		int total=scoreEng + scoreMath + scoreKor;
		average = total/(double)3;
		
		
		
		System.out.println("�̸�\t����\t����\t����\t����\t����\t����\t���");
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
		
		
		Scanner in = new Scanner(System.in); //ǥ���Է°�ü
		
	}
}
