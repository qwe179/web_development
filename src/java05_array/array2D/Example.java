package java05_array.array2D;

public class Example {
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		
		int k = 1;
		
		
//		for (int i = 0; i < arr.length; i++) { //i��, 0~4
//			for (int j = 0; j <arr[i].length ; j++) { //j��, 0~4
//		
//				arr[i][j] = k++;
//				
//			}
//		}		
		
		

//System.out.println("---------2��---------------");
for (int i = 0; i < arr.length; i++) { //i��, 0~4
	for (int j = arr[i].length-1; j >=0 ; j--) { //j��, 0~4

		arr[i][j] = k++;
		
	}
}
//System.out.println("---------3��---------------");
////�Է� (���� ���ļ� �ذ��� ��!)
//for (int i = 0; i < arr.length; i++) { //i��, 0~4
//	for (int j = 0; j <arr[i].length ; j++) { //j��, 0~4
//
//		arr[j][i] = k++;
//		
//	}
//}		
		
//		System.out.println("---------4��---------------");
//		for (int i = 0; i < arr.length; i++) { //i��, 0~4
//			for (int j = arr[i].length-1; j >=0 ; j--) { //j��, 0~4
//	
//				arr[j][i] = k++;
//			
//			}
//		}	
//		
//		
		
		
		//��� (�״�� �� ��!)
		for (int i = 0; i < arr.length; i++) { //i��
			for (int j = 0; j < arr[i].length; j++) { //j��
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}