package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_02 {

	public static void main(String[] args) {
		int height ,base;
		//����� �Ϸ�� �� : ����
		double area;
	Scanner sc = new Scanner(System.in); //Ű���� �Է� ��ü
	
	System.out.print("�غ��� ���̸� �Է��ϼ��� : ");
	
	base= sc.nextInt();
	System.out.print("���̸� �Է��ϼ��� : ");
	height= sc.nextInt();
	
	System.out.println("[TEST] base : " + base );
	System.out.println("[TEST] height : " + height);

	area= (base * (double)height)/2;
	
	
	
	System.out.println("���� : "+ area);
	//////////���,����,��� ���
	}
}
