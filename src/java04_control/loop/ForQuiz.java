package java04_control.loop;
import java.util.Scanner;
public class ForQuiz {
	public static void main(String[] args) {
//		//구구단
//		Scanner scan = new Scanner(System.in);
//		int Dan = scan.nextInt(); //구구단입력
//		
//		for (int i = 1; i<10; i++) {
//			System.out.println(Dan + " x " +i+ " = " + Dan*i);
//
//		}
//		
//		System.out.println("--------------------");
//		
//		
//		//어떤수의 약수 구하는 프로그램
//		
//		int num1 = scan.nextInt();
//		
//		System.out.print(num1+"의 약수 : ");
//		for(int i=1;i<=num1; i++) {
//			
//			if (num1%i ==0) {
//				
//				System.out.println(i);
//			}
//		}
//		
//		System.out.println("--------------------");
//
//		int sum=0;
//		
//		for(int i =1; i<1001; i++) {
//			
//			if(i%4==1 && i%6==1) {
//				
//				
//				sum+=i;
//				
//			}
//			
//			
//		}
//		System.out.println("4로 나누어도 6으로 나누어도 나머지가 1인수의 합 : "+sum);
//		
//		System.out.println("--------------------");
//		
//		num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		
//		
//		//최소공배수
//		int small =0;
//		int large=0;
//		
//		
//		loop2:
//		for(int i=1; i<=num2; i++) {
//	System.out.println(i);
//			for(int j=1;j<=num1;j++) {
//				
//				if(num1*i==num2*j) {
//					System.out.println("num1*i = "+num1*i);
//					System.out.println("num2*j = "+num2*j);
//					
//					small=num1*i;
//					break loop2;
//
//				}
//				
//			}
//
//		}
//		System.out.println(small);
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		loop:
//		for(int i =num1; i>=1; i--) {
//			if (num1%i==0) {
//				
//		//		System.out.println("i ="+i);
//				
//			
//			
//				for(int j =num2; j>=1; j--) {
//					
//				
//					if(num2%j==0) {
//					
//							
//						if(i==j) {
//						large = i;
//			//			System.out.println("large ="+large);
//						break loop;
//						}
//		
//					}
//	
//				}
//			}
//		
//		}
//		System.out.println("최대공약수 : " + large);
//		
//		
//		System.out.println("---------------");
		
		//소수찾기 1과 자기자신으로만 나누어떨어지는숫자
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();

		
		for(int i =1; i<=num1; i++) {

			for(int j = 2; j<=i; j++) {

				if(i%j==0) {
				
					if(i!=j) {
						break;
		
					} else if(i==j) {
						System.out.println("소수  : " + i);
	
					}
				}

			}

		}

		
	}

}
