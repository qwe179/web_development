package java04_control.loop;
import java.util.Scanner;
public class ForQuiz {
	public static void main(String[] args) {
//		//������
//		Scanner scan = new Scanner(System.in);
//		int Dan = scan.nextInt(); //�������Է�
//		
//		for (int i = 1; i<10; i++) {
//			System.out.println(Dan + " x " +i+ " = " + Dan*i);
//
//		}
//		
//		System.out.println("--------------------");
//		
//		
//		//����� ��� ���ϴ� ���α׷�
//		
//		int num1 = scan.nextInt();
//		
//		System.out.print(num1+"�� ��� : ");
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
//		System.out.println("4�� ����� 6���� ����� �������� 1�μ��� �� : "+sum);
//		
//		System.out.println("--------------------");
//		
//		num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		
//		
//		//�ּҰ����
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
//		System.out.println("�ִ����� : " + large);
//		
//		
//		System.out.println("---------------");
		
		//�Ҽ�ã�� 1�� �ڱ��ڽ����θ� ����������¼���
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();

		
		for(int i =1; i<=num1; i++) {

			for(int j = 2; j<=i; j++) {

				if(i%j==0) {
				
					if(i!=j) {
						break;
		
					} else if(i==j) {
						System.out.println("�Ҽ�  : " + i);
	
					}
				}

			}

		}

		
	}

}
