package java05_array.array2D;

public class Array2D_03 {
	public static void main(String[] args) {
		
		int[][] arr; //2���� �迭 ����
		
		arr = new int[3][];
		
		arr[0] = new int[3]; ///////�̷��Ծ����ֶ�
		arr[1] = new int[2]; ///////�̷��Ծ����ֶ�
		arr[2] = new int[8]; ///////�̷��Ծ����ֶ�
		
		//---------------------------------------------------------
		
		System.out.println(arr.length); //���� ����
		System.out.println("---");
		System.out.println(arr[0].length); //0���� �� ����
		System.out.println(arr[1].length); //1���� �� ����
		System.out.println(arr[2].length); //2���� �� ����
		
		
		System.out.println("---------------");
		//�ึ�� ���� ���̰� �������� ���� 2���� �迭�� ��ü ���
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0; j<arr[i].length;j++) { //j��, 0~2, 0~1, 0~7
				System.out.print(arr[i][j]+ " ");
			}
			
			System.out.println();
			
		}
	}
}
