package java04_control.condition;
import java.util.Scanner;
public class IfBasicQuiz_02 {

	public static void main(String[] args) {
		
	
		/*
//	 + 세수를 입력 받아 가장 큰 수를 출력하시오

		//1.숫자 세개 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("비교할 숫자를 3개 입력하세요");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		//2.가장 큰수 비교해서 출력
		
		if (num1 < num2) {
			if (num2 <num3) {
				
				System.out.println("num3가 가장큽니다 [" + num3 +"]");
				
			} else if (num2 > num3) {
				System.out.println("num2가 가장큽니다 [" + num2 +"]");
			} else
				System.out.println("num2, num3가 큽니다[" +num2+","+num3+"]");
			
		}
		else if (num1 > num2) {
			if(num1 < num3) {
				System.out.println("num3가 가장큽니다 [" + num3 +"]");
				
			} else if (num1 > num3) {
				System.out.println("num1가 가장큽니다 [" + num1 +"]");
			} else {
				System.out.println("num1, num3가 큽니다[" +num2+","+num3+"]");
			}
		}
			
		else if (num1 == num2) {
			if(num1 <num3) {
				System.out.println("num3가 가장 큽니다 [" + num3 + "]");
			} else if(num1 > num3){
				System.out.println("num1, num2가 가장 큽니다[" + num1 +","+num2 +"]");
			}else {
				System.out.println("num1,num2,num3 모두 같은 숫자입니다["+num1+","+num2+","+num3+"]");
			}
			
		}
		
		
		
		System.out.println("-----------------------");
	
//	 + 두수를 입력 받아 합이 짝수이고
//	  3의 배수인지 판별하시오
//
		
		//숫자2개 입력받기
		System.out.println("배수 판별할 숫자를 2개 입력하세요");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num2 =num1+num2; //합
		//합 짝수,3의배수 판별
		if((num2%2==0) && (num2%3==0)) {
			System.out.println("짝수이면서 홀수입니다~["+num2+"]");
			
		} else {
			System.out.println("아닙니다~["+num2+"]");
		}
		System.out.println("-----------------------");
		
//	 + 세 과목의 성적을 입력 받아 합계와 평균을 구하고
//	  평균이 90이상이면 “A”, 80이상이면 “B”,
//	  70 이상이면 “C”, 60 이상이면 “D”,
//	  60미만이면 “F”를 출력하시오.
			
		//세 과목 성적 입력받기
		System.out.println("성적 3가지를 입력하세요");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		//합계와 평균 구하기
		int sum = num1+num2+num3;
		double average = sum/(double)3;

		//평균값에따라서 성적주기
		System.out.println("성적합계 : "+sum);
		System.out.printf("성적평균 : %.3f \n",average);
		
		
		
		
		if (average >= 90) {
			System.out.println("당신은 A입니다");
		} 
		else if(average >=80) {
			System.out.println("당신은 B입니다");
		} 
		else if(average >=70) {
			System.out.println("당신은 C입니다");
		} 
		else if(average >=60)  {
			System.out.println("당신은 D입니다");
		} 
		else {
			System.out.println("당신은 F입니다");
		} 
		
		*/
		
		//--------------------------선생님코드--------------------
		
		Scanner sc = new Scanner(System.in);
//		
//		int n1= sc.nextInt();
//		int n2= sc.nextInt();
//		int n3= sc.nextInt();
//		int max; // 가장 큰 값 저장
//		
//		//n1과 n2 중 큰 값을 max에 저장
//		if(n1 >=n2) {
//			max = n1;
//		} else {
//			max =n2;
//		}
//		//max보다 n3가 클 경우에만 max에 n3를 저장
//		if( n3>max) {
//			max = n3;
//		}
//		System.out.println("세 숫자 중 가장 큰 수 :" + max);
//		System.out.println("--------------------------------");
//		if( n1>=n2 && n1>=n3) {
//			System.out.println("n1이 가장 크다");
//		
//		} else if( n2>=n1 && n2>=n3) {
//			System.out.println("n2이 가장 크다");
//			
//		} else if( n3>n1 && n3>=n2) {
//			System.out.println("n3이 가장 크다");
//			
//		}
//		System.out.println("------------------------------");
		// +두 수를 입력 받아 합이 짝수이고 3의 배수인지 판별하시오
//		System.out.print("Input Number1 : ");
//		int num1 = sc.nextInt();
//		System.out.print("Input Number2 : ");
//		int num2 = sc.nextInt();
//		
//		int sum = num1 + num2; //두 수의 합계
//		System.out.println("[Test] sum : " + sum);
//		//방법1.
//		if (sum%2 == 0 && sum%3==0) { }
//		//방법2.
//		if(sum%2== 0) {
//			if(sum%3 == 0) {
//				
//			}
//		}
		
		//방법3.
//		if( sum%6==0) {
//			System.out.println("합계가 2의 배수이면서 3의 배수");
//		} else {
//			System.out.println("합계가 2의 배수가 아니거나 3의 배수가 아님");
//		}
		
		//----------------------------------------------------------------------
		
//		if (sum%2 == 0 && sum%3==0) {
			//sum은 2의 배수이면서 3의 배수
//		}
		
//		if (sum%2 == 0 && sum%3==0) {  <-요놈 부정 (드모르간법칙인듯)
//		if (sum%2!= 0 || sum%3!=0) {
//			System.out.println("합계가 2의 배수가 아니거나 3의 배수가 아님");
//		}
		//---------------------------------------------------------------------
		System.out.print("Input Score1 : ");
		int score1 = sc.nextInt();
		System.out.print("Input Score2 : ");
		int score2 = sc.nextInt();
		System.out.print("Input Score3 : ");
		int score3 = sc.nextInt();
		
		int sum = score1 + score2 + score3; //합계
		double avg = sum/(double)3; //평균
		
		//System.out.println("[TEST sum : " + sum + ", avg : " + avg); 

		//등급 계산(판단)
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
			System.out.println("잘못된 점수를 입력 하셨습니다.");
		}


	}
}