package java05_array.array2D;

import java.util.Scanner;

public class Array2D_07 {

	public static void main(String[] args) {
		
		//학생 성적 관리 프로그램
		
		//1~3학년
		//2개반
		//4명의 학생
		//3과목 점수
		//점수
		int [][][][]score = new int[3][2][4][3];
		
		int[][][] sco1 = new int[2][4][3];
		int[][][] sco2 = new int[2][4][3];
		int[][][] sco3 = new int[2][4][3];
		
		//---------------------------------------------------------------------------------
		
		//2명의 국어,영어,수학 점수를 저장하는 배열
		int[][] sco = new int[2][3];
		
		int[] sum = new int[2]; //총점 배열
		double[] avg = new double[2]; //평균 배열
		

		//--------------2명 학생들의 3과목 점수 입력받기 --------------
		
		Scanner sc = new Scanner(System.in); //표준입력객체
		
		//String[] subject = {"국어", "영어","수학"};  ///switch왜썻지?
		for(int i = 0; i<sco.length; i++) {
			System.out.println("----------------------------------------------");
			System.out.println((i+1)+"번 학생의 성적을 입력하세요 ");
			
			for(int j = 0; j<sco[i].length; j++) {
				switch(j) {
				
				case 0:
				System.out.print("국어 성적을 입력하세요 : ");
				sco[i][j]=sc.nextInt();
				break;
				
				case 1:
				System.out.print("영어 성적을 입력하세요 : ");
				sco[i][j]=sc.nextInt();
				break;	
				
				case 2:
				System.out.print("수학 성적을 입력하세요 : ");
				sco[i][j]=sc.nextInt();
				break;
				}
				
			}
		}
		
//		//TEST
//		for(int i =0; i<sco.length;i++) {
//			for(int j=0; j<sco[i].length;j++) {
//				System.out.print(sco[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
		//--------------총점 계산하기 ---------------------------------
		for(int i = 0; i<sum.length; i++) {	//i번째 학생
			for(int j = 0; j<sco[i].length; j++) { //j번째 과목
				sum[i]+=sco[i][j];
			}
		}
//		
//		//TEST
//		for(int i =0; i<sum.length;i++) {
//
//			System.out.print(sum[i] + " ");
//		}

		//--------------평균 계산하기 ---------------------------------
		for(int i = 0; i<avg.length; i++) {
			
			avg[i] =sum[i] / (double)3;
			
		}	
		//-----------------종합 출력 --------------------------------------
		
		//ex) 번호  국어 영어 수학 총점 평균
		//    1번	xxx	xxx	xxx	xxx	xxx
		//	  2번	xxx	xxx	xxx	xxx	xxx
		System.out.println("----------------------------------------------");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------");
		for(int i = 0; i<sco.length; i++) {
			System.out.print((i+1)+"번\t");
			for(int j = 0; j<sco[i].length; j++) {
				
				System.out.print(sco[i][j]+"\t");
				
			}
			System.out.print(sum[i] + "\t");
			System.out.printf("%.3f"+"\n",avg[i]);
		}
		System.out.println("----------------------------------------------");
		
	}
}