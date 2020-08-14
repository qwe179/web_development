package java04_control.switchEx;

import java.util.Scanner;

public class SwitchQuiz_Menu {

	
	
	
	public static void main(String[] args) {
		
		//메뉴 선택 번호 상수
		final int HELLO_MENU = 1;
		final int NAME_MENU = 2;
		final int GENDER_MENU = 3;
		final int EXIT_MENU = 4;
		
		
		
		
		
		
		
		
//	-메뉴 만들기
//	===========================
//	Menu
//	===============================
//	1.Hello World 출력
//	2.이름 출력
//	3.성별 출력
//	4.종료
//	============================
//	>> _
//	-> 각 메뉴를 입력하면 메뉴에 알맞게 동작하도록 작성
		

		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		int input=0; //메뉴 선택 변수
		String name;
		char gender;
		
		System.out.println("=====================");
		System.out.println("M  e  n  u");
		System.out.println("1.Hello World 출력");
		System.out.println("2.이름 출력");
		System.out.println("3.성별 출력");
		System.out.println("4.종료");
		System.out.println("=====================");
		System.out.println("\n\t>>");
		
		
		System.out.print("숫자를 입력해주세요(1:helloworld,2:이름,3:성별,4:종료) : ");
		while(input!=4) {
			input = scan.nextInt();
			switch(input) {
			case 1: 
				System.out.println("1번메뉴를 선택하셨습니다.");
				System.out.println("Hello World");
				System.out.print("숫자를 입력해주세요(1:helloworld,2:이름,3:성별,4:종료) : ");
				break;
			case 2:	
				System.out.println("2번메뉴를 선택하셨습니다.");
				System.out.print("이름을 입력하시오 : ");
				name = scan2.nextLine();
				
				System.out.println("이름 : " + name);
				System.out.print("숫자를 입력해주세요(1:helloworld,2:이름,3:성별,4:종료) : ");
				break;
			case 3:
				System.out.println("3번메뉴를 선택하셨습니다.");
				System.out.print("성별을 입력하시오 : ");
				gender = scan2.nextLine().charAt(0);
				System.out.println("성별 : " + gender);
				
				System.out.print("숫자를 입력해주세요(1:helloworld,2:이름,3:성별,4:종료) : ");
				break;
			case 4: 
				System.out.println("종료됩니다...");
				break;
			default: System.out.print("잘못된 숫자를 입력하셨습니다. 다시 입력해주세요(1:helloworld,2:이름,3:성별,4:종료) : ");
			
			
			
			}
		
		}
		
		
		System.out.println("====================구별====================");
		int select; //메뉴 선택 변수
		Scanner sc = new Scanner(System.in);
		select = sc.nextInt();
		System.out.println("=====================");
		System.out.println("M  e  n  u");
		System.out.println("1.Hello World 출력");
		System.out.println("2.이름 출력");
		System.out.println("3.성별 출력");
		System.out.println("4.종료");
		System.out.println("=====================");
		System.out.println("\n\t>>");
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
		}
		
		
		
		
		
		
		
		
	}
}
