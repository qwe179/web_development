package java09_api.quiz;

import java.util.Random;
import java.util.Scanner;

public class updown {
	public static void main(String[] args) {
		Random ran = new Random();
		int randomNum = ran.nextInt(50)+1;
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		int count=0;
//		System.out.println(randomNum); //정답 디버깅
		
		
		System.out.println("-----------------------");
		System.out.println("업 다운 게임을 시작합니다");
		System.out.println("-----------------------");
		
		for(int i=0; i<7; i++) {
			System.out.print("숫자를 입력하세요 : ");
			input=sc.nextInt();
			if(input==randomNum) {
				
				System.out.println("승리하셨습니다! 정답 : "+randomNum);
				System.out.println("시도 횟수 : "+ (count+1));
				System.out.println("-----------------------");
				break;
			}else if(input>randomNum) {
				System.out.println("-----------------------");
				System.out.println("[다운]");
				System.out.println("-----------------------");
			}else if (input<randomNum) {
				System.out.println("-----------------------");
				System.out.println("[업]");
				System.out.println("-----------------------");
			}
			count+=1;
			if(count>6) {
				
				System.out.println("너의 패배");
				System.out.println("시도 횟수 : " + count);
				break;
			}
			
		}
		
		
		
		
	}
}
