package java05_array.array2D;
import java.util.Scanner;
public class Array2D_05 {
	public static void main(String[] args) {
		
		//new
		// ���� �Ҵ� ������
		
		//** �����Ҵ�
		//** �����Ҵ�

		// �Ҵ� : ���� ���� ����(������� ����)
		
		//����(static) : ����Ǳ� ����,Compile-Time
		//����(dynamic) : ���� ��, ���� ��, Run-Time 
		//------------------------------------------------
		int num; //int�� ���� ���� ->���� �Ҵ�
		int[] arr; //int[]�� ���� ���� -> ���� �Ҵ�
		
		//-> ���� �޼ҵ忡�� �����Ҵ��� ������ stack�� ����ȴ�
		
		arr = new int[5]; //int[5] �迭 ���� ���� -> ���� �Ҵ�
		
		// -> �����Ҵ��� ���� ������ Heap�� ���������
		//�ڵ带 �о�� ������ ����
		
		//--------------------------------------------------
		
		//int[] arr2 = new int[-5];
		//static       dynamic           �������ҽ� ���� �ȳ�
		//�迭 ���� ������ �����Ҵ�
		//�迭 ���� ���� ����(new)�� �����Ҵ�
		
		// -> �������� ���� �������� �𸣰� �����غ��� �˰� �ȴ�
		// -> �ڹ� �����Ϸ��� �������� �Ǵ����� ���Ѵ�
		
		//------------------------------------------------------
		int[][] arr3 = new int[3][];
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i< arr3.length; i++) {
			System.out.println(i + "�� �迭�� ũ���?");
			int len = sc.nextInt();
			
			arr3[i] = new int[len];
		}
		for(int i=0; i<arr3.length; i++) {
			for(int j=0;j<arr3[i].length;j++) {
				
				System.out.print(arr3[i][j]+" ");
			}
			
		}
		sc.close();  //close�������ص���..�����ϰԲ��ܳ���
	}
}
