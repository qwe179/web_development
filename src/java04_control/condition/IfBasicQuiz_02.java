package java04_control.condition;
import java.util.Scanner;
public class IfBasicQuiz_02 {

	public static void main(String[] args) {
		
	
		/*
//	 + ������ �Է� �޾� ���� ū ���� ����Ͻÿ�

		//1.���� ���� �Է�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���ڸ� 3�� �Է��ϼ���");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		//2.���� ū�� ���ؼ� ���
		
		if (num1 < num2) {
			if (num2 <num3) {
				
				System.out.println("num3�� ����Ů�ϴ� [" + num3 +"]");
				
			} else if (num2 > num3) {
				System.out.println("num2�� ����Ů�ϴ� [" + num2 +"]");
			} else
				System.out.println("num2, num3�� Ů�ϴ�[" +num2+","+num3+"]");
			
		}
		else if (num1 > num2) {
			if(num1 < num3) {
				System.out.println("num3�� ����Ů�ϴ� [" + num3 +"]");
				
			} else if (num1 > num3) {
				System.out.println("num1�� ����Ů�ϴ� [" + num1 +"]");
			} else {
				System.out.println("num1, num3�� Ů�ϴ�[" +num2+","+num3+"]");
			}
		}
			
		else if (num1 == num2) {
			if(num1 <num3) {
				System.out.println("num3�� ���� Ů�ϴ� [" + num3 + "]");
			} else if(num1 > num3){
				System.out.println("num1, num2�� ���� Ů�ϴ�[" + num1 +","+num2 +"]");
			}else {
				System.out.println("num1,num2,num3 ��� ���� �����Դϴ�["+num1+","+num2+","+num3+"]");
			}
			
		}
		
		
		
		System.out.println("-----------------------");
	
//	 + �μ��� �Է� �޾� ���� ¦���̰�
//	  3�� ������� �Ǻ��Ͻÿ�
//
		
		//����2�� �Է¹ޱ�
		System.out.println("��� �Ǻ��� ���ڸ� 2�� �Է��ϼ���");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num2 =num1+num2; //��
		//�� ¦��,3�ǹ�� �Ǻ�
		if((num2%2==0) && (num2%3==0)) {
			System.out.println("¦���̸鼭 Ȧ���Դϴ�~["+num2+"]");
			
		} else {
			System.out.println("�ƴմϴ�~["+num2+"]");
		}
		System.out.println("-----------------------");
		
//	 + �� ������ ������ �Է� �޾� �հ�� ����� ���ϰ�
//	  ����� 90�̻��̸� ��A��, 80�̻��̸� ��B��,
//	  70 �̻��̸� ��C��, 60 �̻��̸� ��D��,
//	  60�̸��̸� ��F���� ����Ͻÿ�.
			
		//�� ���� ���� �Է¹ޱ�
		System.out.println("���� 3������ �Է��ϼ���");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		//�հ�� ��� ���ϱ�
		int sum = num1+num2+num3;
		double average = sum/(double)3;

		//��հ������� �����ֱ�
		System.out.println("�����հ� : "+sum);
		System.out.printf("������� : %.3f \n",average);
		
		
		
		
		if (average >= 90) {
			System.out.println("����� A�Դϴ�");
		} 
		else if(average >=80) {
			System.out.println("����� B�Դϴ�");
		} 
		else if(average >=70) {
			System.out.println("����� C�Դϴ�");
		} 
		else if(average >=60)  {
			System.out.println("����� D�Դϴ�");
		} 
		else {
			System.out.println("����� F�Դϴ�");
		} 
		
		*/
		
		//--------------------------�������ڵ�--------------------
		
		Scanner sc = new Scanner(System.in);
//		
//		int n1= sc.nextInt();
//		int n2= sc.nextInt();
//		int n3= sc.nextInt();
//		int max; // ���� ū �� ����
//		
//		//n1�� n2 �� ū ���� max�� ����
//		if(n1 >=n2) {
//			max = n1;
//		} else {
//			max =n2;
//		}
//		//max���� n3�� Ŭ ��쿡�� max�� n3�� ����
//		if( n3>max) {
//			max = n3;
//		}
//		System.out.println("�� ���� �� ���� ū �� :" + max);
//		System.out.println("--------------------------------");
//		if( n1>=n2 && n1>=n3) {
//			System.out.println("n1�� ���� ũ��");
//		
//		} else if( n2>=n1 && n2>=n3) {
//			System.out.println("n2�� ���� ũ��");
//			
//		} else if( n3>n1 && n3>=n2) {
//			System.out.println("n3�� ���� ũ��");
//			
//		}
//		System.out.println("------------------------------");
		// +�� ���� �Է� �޾� ���� ¦���̰� 3�� ������� �Ǻ��Ͻÿ�
//		System.out.print("Input Number1 : ");
//		int num1 = sc.nextInt();
//		System.out.print("Input Number2 : ");
//		int num2 = sc.nextInt();
//		
//		int sum = num1 + num2; //�� ���� �հ�
//		System.out.println("[Test] sum : " + sum);
//		//���1.
//		if (sum%2 == 0 && sum%3==0) { }
//		//���2.
//		if(sum%2== 0) {
//			if(sum%3 == 0) {
//				
//			}
//		}
		
		//���3.
//		if( sum%6==0) {
//			System.out.println("�հ谡 2�� ����̸鼭 3�� ���");
//		} else {
//			System.out.println("�հ谡 2�� ����� �ƴϰų� 3�� ����� �ƴ�");
//		}
		
		//----------------------------------------------------------------------
		
//		if (sum%2 == 0 && sum%3==0) {
			//sum�� 2�� ����̸鼭 3�� ���
//		}
		
//		if (sum%2 == 0 && sum%3==0) {  <-��� ���� (��𸣰���Ģ�ε�)
//		if (sum%2!= 0 || sum%3!=0) {
//			System.out.println("�հ谡 2�� ����� �ƴϰų� 3�� ����� �ƴ�");
//		}
		//---------------------------------------------------------------------
		System.out.print("Input Score1 : ");
		int score1 = sc.nextInt();
		System.out.print("Input Score2 : ");
		int score2 = sc.nextInt();
		System.out.print("Input Score3 : ");
		int score3 = sc.nextInt();
		
		int sum = score1 + score2 + score3; //�հ�
		double avg = sum/(double)3; //���
		
		//System.out.println("[TEST sum : " + sum + ", avg : " + avg); 

		//��� ���(�Ǵ�)
		if( avg >=0 && avg <=100) {

			if(avg >= 90) {
				System.out.println("A");
			} else if (avg >= 80) {
				System.out.println("B");
			} else if (avg >= 70) {
				System.out.println("C");
			} else if (avg >= 60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}

		}else {
			System.out.println("�߸��� ������ �Է� �ϼ̽��ϴ�.");
		}


	}
}