package java05_array.array2D;

import java.util.Scanner;

public class Array2D_07 {

	public static void main(String[] args) {
		
		//�л� ���� ���� ���α׷�
		
		//1~3�г�
		//2����
		//4���� �л�
		//3���� ����
		//����
		int [][][][]score = new int[3][2][4][3];
		
		int[][][] sco1 = new int[2][4][3];
		int[][][] sco2 = new int[2][4][3];
		int[][][] sco3 = new int[2][4][3];
		
		//---------------------------------------------------------------------------------
		
		//2���� ����,����,���� ������ �����ϴ� �迭
		int[][] sco = new int[2][3];
		
		int[] sum = new int[2]; //���� �迭
		double[] avg = new double[2]; //��� �迭
		

		//--------------2�� �л����� 3���� ���� �Է¹ޱ� --------------
		
		Scanner sc = new Scanner(System.in); //ǥ���Է°�ü
		
		//String[] subject = {"����", "����","����"};  ///switch�֛���?
		for(int i = 0; i<sco.length; i++) {
			System.out.println("----------------------------------------------");
			System.out.println((i+1)+"�� �л��� ������ �Է��ϼ��� ");
			
			for(int j = 0; j<sco[i].length; j++) {
				switch(j) {
				
				case 0:
				System.out.print("���� ������ �Է��ϼ��� : ");
				sco[i][j]=sc.nextInt();
				break;
				
				case 1:
				System.out.print("���� ������ �Է��ϼ��� : ");
				sco[i][j]=sc.nextInt();
				break;	
				
				case 2:
				System.out.print("���� ������ �Է��ϼ��� : ");
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
		
		
		//--------------���� ����ϱ� ---------------------------------
		for(int i = 0; i<sum.length; i++) {	//i��° �л�
			for(int j = 0; j<sco[i].length; j++) { //j��° ����
				sum[i]+=sco[i][j];
			}
		}
//		
//		//TEST
//		for(int i =0; i<sum.length;i++) {
//
//			System.out.print(sum[i] + " ");
//		}

		//--------------��� ����ϱ� ---------------------------------
		for(int i = 0; i<avg.length; i++) {
			
			avg[i] =sum[i] / (double)3;
			
		}	
		//-----------------���� ��� --------------------------------------
		
		//ex) ��ȣ  ���� ���� ���� ���� ���
		//    1��	xxx	xxx	xxx	xxx	xxx
		//	  2��	xxx	xxx	xxx	xxx	xxx
		System.out.println("----------------------------------------------");
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		System.out.println("----------------------------------------------");
		for(int i = 0; i<sco.length; i++) {
			System.out.print((i+1)+"��\t");
			for(int j = 0; j<sco[i].length; j++) {
				
				System.out.print(sco[i][j]+"\t");
				
			}
			System.out.print(sum[i] + "\t");
			System.out.printf("%.3f"+"\n",avg[i]);
		}
		System.out.println("----------------------------------------------");
		
	}
}