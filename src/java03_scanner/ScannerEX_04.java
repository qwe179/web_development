package java03_scanner;

import java.util.Scanner;

public class ScannerEX_04 {


	public static void main(String[] args) {

		//Scanner ��ü ����� �� �Է� ���� ���� ������ ��
		// nextLine()�� ����ϱ� ������ nextLine()�� �ƴ�
		// �ٸ� �޼ҵ带 ����ߴٸ� �� �߰��� nextLine()��
		// �ѹ� �� ������־�� �Ѵ�.
		
		
		
		
		Scanner sc = new Scanner(System.in); //�Է� ��ü
		
		System.out.println("---�Է�----");
		System.out.println("Input Number : ");
		int num = sc.nextInt();
		
		sc.nextLine();    ///////////nextInt ���� �޼ҵ尡 nextLine������ ���� �߰��� nextLine�ѹ����������... �Է¹��� ���� �ذ�å 
		/////////�������� �Է¹��۶����� nextLine���� newxInt�� ����� ���ۿ� �����ִ� \n�� �ν��ع����� �Ѿ������
		
		System.out.println("Input String : ");
		String str = sc.nextLine();
		
		System.out.println(); //�ٹٲ�
		System.out.println("--- ��� ---");
		System.out.println("���� : " + num);
		System.out.println("���ڿ� : " + str);
		
	} 

}

