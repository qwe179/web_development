package java03_scanner;

import java.util.Scanner;

public class ScannerEX_05 {

	public static void main(String[] args) {

		
		//���ڿ� �Է� ó�� �޼ҵ�(���)
		// nextLine(), next()
		
		//�Է� ��ü ����
		
		Scanner sc = new Scanner(System.in);
		
		String str1;
		String str2;
		
		//���ڿ� �Է�
		System.out.println("Input String : ");
		
//		str1 = sc.nextLine();
//		str2 = sc.nextLine();
		
		str1 = sc.next();
		str2 = sc.next();
		
		System.out.print('\n'); //�ٹٲ� �ڵ�, ���� �ڵ�
		System.out.println(); //�ٹٲ� �ڵ�, ���� �ڵ�
		
		System.out.println("--- ��� ---");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		//-----------------------------------------------------------------------
		
		//nextLine()
		//���๮��(���Ͱ�)�� �������� �ϳ��� ���ڿ��� �Ǵ��Ѵ�
		
		//next()
		//���鹮�ڸ� �������� �ϳ��� ���ڿ��� �Ǵ��Ѵ�.

	} 

}

	