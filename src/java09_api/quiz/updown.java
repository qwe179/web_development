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
//		System.out.println(randomNum); //���� �����
		
		
		System.out.println("-----------------------");
		System.out.println("�� �ٿ� ������ �����մϴ�");
		System.out.println("-----------------------");
		
		for(int i=0; i<7; i++) {
			System.out.print("���ڸ� �Է��ϼ��� : ");
			input=sc.nextInt();
			if(input==randomNum) {
				
				System.out.println("�¸��ϼ̽��ϴ�! ���� : "+randomNum);
				System.out.println("�õ� Ƚ�� : "+ (count+1));
				System.out.println("-----------------------");
				break;
			}else if(input>randomNum) {
				System.out.println("-----------------------");
				System.out.println("[�ٿ�]");
				System.out.println("-----------------------");
			}else if (input<randomNum) {
				System.out.println("-----------------------");
				System.out.println("[��]");
				System.out.println("-----------------------");
			}
			count+=1;
			if(count>6) {
				
				System.out.println("���� �й�");
				System.out.println("�õ� Ƚ�� : " + count);
				break;
			}
			
		}
		
		
		
		
	}
}
