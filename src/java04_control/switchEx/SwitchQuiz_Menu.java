package java04_control.switchEx;

import java.util.Scanner;

public class SwitchQuiz_Menu {

	
	
	
	public static void main(String[] args) {
		
		//�޴� ���� ��ȣ ���
		final int HELLO_MENU = 1;
		final int NAME_MENU = 2;
		final int GENDER_MENU = 3;
		final int EXIT_MENU = 4;
		
		
		
		
		
		
		
		
//	-�޴� �����
//	===========================
//	Menu
//	===============================
//	1.Hello World ���
//	2.�̸� ���
//	3.���� ���
//	4.����
//	============================
//	>> _
//	-> �� �޴��� �Է��ϸ� �޴��� �˸°� �����ϵ��� �ۼ�
		

		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		int input=0; //�޴� ���� ����
		String name;
		char gender;
		
		System.out.println("=====================");
		System.out.println("M  e  n  u");
		System.out.println("1.Hello World ���");
		System.out.println("2.�̸� ���");
		System.out.println("3.���� ���");
		System.out.println("4.����");
		System.out.println("=====================");
		System.out.println("\n\t>>");
		
		
		System.out.print("���ڸ� �Է����ּ���(1:helloworld,2:�̸�,3:����,4:����) : ");
		while(input!=4) {
			input = scan.nextInt();
			switch(input) {
			case 1: 
				System.out.println("1���޴��� �����ϼ̽��ϴ�.");
				System.out.println("Hello World");
				System.out.print("���ڸ� �Է����ּ���(1:helloworld,2:�̸�,3:����,4:����) : ");
				break;
			case 2:	
				System.out.println("2���޴��� �����ϼ̽��ϴ�.");
				System.out.print("�̸��� �Է��Ͻÿ� : ");
				name = scan2.nextLine();
				
				System.out.println("�̸� : " + name);
				System.out.print("���ڸ� �Է����ּ���(1:helloworld,2:�̸�,3:����,4:����) : ");
				break;
			case 3:
				System.out.println("3���޴��� �����ϼ̽��ϴ�.");
				System.out.print("������ �Է��Ͻÿ� : ");
				gender = scan2.nextLine().charAt(0);
				System.out.println("���� : " + gender);
				
				System.out.print("���ڸ� �Է����ּ���(1:helloworld,2:�̸�,3:����,4:����) : ");
				break;
			case 4: 
				System.out.println("����˴ϴ�...");
				break;
			default: System.out.print("�߸��� ���ڸ� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���(1:helloworld,2:�̸�,3:����,4:����) : ");
			
			
			
			}
		
		}
		
		
		System.out.println("====================����====================");
		int select; //�޴� ���� ����
		Scanner sc = new Scanner(System.in);
		select = sc.nextInt();
		System.out.println("=====================");
		System.out.println("M  e  n  u");
		System.out.println("1.Hello World ���");
		System.out.println("2.�̸� ���");
		System.out.println("3.���� ���");
		System.out.println("4.����");
		System.out.println("=====================");
		System.out.println("\n\t>>");
		switch(select) {
		case HELLO_MENU: //Hello World ���
			System.out.println("Hello World");
			break;
		case NAME_MENU: //�̸� ���
			System.out.println("Alice");
			break;
		case GENDER_MENU: //���� ���
			System.out.println("Male");
			break;
		case EXIT_MENU: //����
			System.out.println("Good Bye~");
			break;
		default:
			System.out.println("�߸��� �޴��� �Է��ϼ̽��ϴ�");
			break;
		}
		
		
		
		
		
		
		
		
	}
}
