package java05_array.array2D;

public class Array2D_03 {
	public static void main(String[] args) {
		
		int[][] arr; //2차원 배열 변수
		
		arr = new int[3][];
		
		arr[0] = new int[3]; ///////이렇게쓸수있땅
		arr[1] = new int[2]; ///////이렇게쓸수있땅
		arr[2] = new int[8]; ///////이렇게쓸수있땅
		
		//---------------------------------------------------------
		
		System.out.println(arr.length); //행의 길이
		System.out.println("---");
		System.out.println(arr[0].length); //0행의 열 길이
		System.out.println(arr[1].length); //1행의 열 길이
		System.out.println(arr[2].length); //2행의 열 길이
		
		
		System.out.println("---------------");
		//행마다 열의 길이가 일정하지 않은 2차원 배열의 전체 출력
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0; j<arr[i].length;j++) { //j열, 0~2, 0~1, 0~7
				System.out.print(arr[i][j]+ " ");
			}
			
			System.out.println();
			
		}
	}
}
