package java04_control.condition;

import java.util.Scanner;

public class IfBasicQuiz_01 {
	public static void main(String[] args) {
	
//		 + ���� �ϳ��� �Է¹޾� ������� �������� �Ǻ��Ͻÿ�
//			>> Input Number : -3
//			>> �����Դϴ�
		
		Scanner sc = new Scanner(System.in);
		/*System.out.print("������� �������� �Ǻ��� ���ڸ� �Է��ϼ���! : ");
		
		int num1 = sc.nextInt();
		
		if(num1 <0 ) {
			System.out.println("�����Դϴ�.");
		}
		else if (num1 > 0) {
			System.out.println("����Դϴ�."); 
		}
	
System.out.println("---------------");

//	 + �Է��� �����Ͱ� 3�� ������� �Ǻ��Ͻÿ�
//	  (% ������ ���)
//		>> Input Number : 7
//		>> 3�� ����� �ƴմϴ�
		System.out.print("3�� ����ϱ�? : ");
//		int num2 = sc.nextInt();
		if (num1%3 !=0) {
			
			System.out.println("3�ǹ���� �ƴմϴ�");
			
		}
		else  {
			System.out.println("3�� ����Դϴ�!!");
		}
		
		System.out.println("---------------");
//	 + �� ���� �Է� �޾� ū ���� ����Ͻÿ�
//		>> Input Number1 : 44
//		>> Input Number2 : 88
//		>> 88 �� �� ū ��
		
		int input1, input2;
		System.out.print("���� ���ڸ�  �Է��ϼ���. ù��° ���� : ");
		input1 =sc.nextInt();
		System.out.print("�ι�° ���� : ");
		input2 = sc.nextInt();
		
		if (input1<input2) {
			System.out.println("��ū���ڴ�" + input2+"�Դϴ�");
			
		}
		else if(input1 > input2){System.out.println("�� ū���ڴ� " + input1 + "�Դϴ�");

	
		}
		else{

			System.out.println("���ڰ����Ƽ� �Ǻ� ���ؿ�~");
		}
		System.out.println("---------------");

		*/
		
		
		
		
		
		
		
		
		
		
		/*
		
		
		System.out.println("----------------�������ڵ�-------------");	
		//---------------���� ���� --------------
		int num3, num4; //���� 2��
		//---------1�� ��� ���� �Ǻ�----------------------
//		+ ���� �ϳ��� �Է¹޾� ������� �������� �Ǻ��Ͻÿ�
		
		// ���� �ϳ� �Է¹ޱ�
		System.out.print("Input Number : ");
		num3 = sc.nextInt();
//		������� �������� �Ǻ�
		if(num3 > 0) { //����� �� ó���� �ڵ�
			System.out.println("num3�� ����Դϴ�");

			
		}
		//������ �� ó���� �ڵ�
		if(num3 < 0) {
			
			System.out.println("num3�� �����Դϴ�");
		}
		
		if (num3 ==0) { //0�� ��
			System.out.println("num3�� 0 �Դϴ�");
			
			
		}
		
		//------------2�� 3�� ��� �Ǻ� ----------------
		// + �Է��� �����Ͱ� 3�� ������� �Ǻ��Ͻÿ�
//		(% ������ ���)
		
		//���� �ϳ� �Է¹ޱ�
		System.out.print("Input Number : ");
		num3 = sc.nextInt();
		
		// **�߰� : 0�� ����� ������� �ʴ´�
		if(num3%3 == 0 && num3 !=0) {//3�� ����� ��
			System.out.println("num3["+num3+"] ��/�� 3�� ���");
		}
		
		//3�� ����� �ƴ� ��
		if(num3%3 != 0 || num3 ==0) {//3�� ����� ��... 0����??
			System.out.println("num3["+num3+"] ��/�� 3�� ����� �ƴ�");	
		}
		//----------------------------------------
		*/
		
		
		//----------3�� �� ���� �� ū �� ---------
//		+ �� ���� �Է¹޾� ū ���� ����Ͻÿ�
		
		
		
		//���� �� �� �Է¹ޱ�
		int num3, num4;
		
		System.out.println("Input Number3 : ");
		num3 = sc.nextInt();
		System.out.println("Input Number4 : ");
		num4 = sc.nextInt();
		
		//ū ���� ����ϱ�
		
		if(num3 > num4) { //num1�� Ŭ ��
			System.out.println("num3[" + num3+ "] ��/�� Ů�ϴ�");
		}
		
		if(num3 < num4) { //num2�� Ŭ ��
			System.out.println("num4[" + num4+ "] ��/�� Ů�ϴ�");
			
			
		}
		if (num3 ==num4) {
			
			System.out.println("�� ���� ����");
		}
		
		
		//-------------------------------------------
		
		
	}
}

