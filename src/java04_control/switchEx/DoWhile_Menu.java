package java04_control.switchEx;

import java.util.Scanner;

public class DoWhile_Menu {
	public static void main(String[] args) {
		
		
		final int HELLO_MENU = 1;
		final int NAME_MENU = 2;
		final int GENDER_MENU = 3;
		final int EXIT_MENU = 4;

		

		int select; //메뉴 선택 변수
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====================");
		System.out.println("M  e  n  u");
		System.out.println("1.Hello World 출력");
		System.out.println("2.이름 출력");
		System.out.println("3.성별 출력");
		System.out.println("4.종료");
		System.out.println("=====================");
		System.out.println("\n\t>>");
		
		
		do {
			select = sc.nextInt();
			switch(select) {
			case HELLO_MENU: //Hello World 출력
				System.out.println("Hello World");
				break;
			case NAME_MENU: //이름 출력
				System.out.println("Alice");
				break;
			case GENDER_MENU: //성별 출력
				System.out.println("Male");
				break;
			case EXIT_MENU: //종료
				System.out.println("Good Bye~");
				break;
			default:
				System.out.println("잘못된 메뉴를 입력하셨습니다");
				break;
			}//switch end
		}while( select != EXIT_MENU); //do-while end
		
		
	
	}//main()end
}
