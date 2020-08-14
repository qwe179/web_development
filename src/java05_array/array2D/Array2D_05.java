package java05_array.array2D;
import java.util.Scanner;
public class Array2D_05 {
	public static void main(String[] args) {
		
		//new
		// 동적 할당 연산자
		
		//** 정적할당
		//** 동적할당

		// 할당 : 변수 공간 생성(저장공간 생성)
		
		//정적(static) : 실행되기 직전,Compile-Time
		//동적(dynamic) : 실행 중, 동작 중, Run-Time 
		//------------------------------------------------
		int num; //int형 변수 선언 ->정적 할당
		int[] arr; //int[]형 변수 선언 -> 정적 할당
		
		//-> 메인 메소드에서 정적할당한 변수는 stack에 저장된다
		
		arr = new int[5]; //int[5] 배열 공간 생성 -> 동적 할당
		
		// -> 동적할당한 저장 공간은 Heap에 만들어진다
		//코드를 읽어야 공간을 만듬
		
		//--------------------------------------------------
		
		//int[] arr2 = new int[-5];
		//static       dynamic           컴파일할시 에러 안남
		//배열 변수 선언은 정적할당
		//배열 변수 공간 생성(new)은 동적할당
		
		// -> 컴파일할 때는 에러인지 모르고 실행해보고 알게 된다
		// -> 자바 컴파일러가 에러인지 판단하지 못한다
		
		//------------------------------------------------------
		int[][] arr3 = new int[3][];
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i< arr3.length; i++) {
			System.out.println(i + "행 배열의 크기는?");
			int len = sc.nextInt();
			
			arr3[i] = new int[len];
		}
		for(int i=0; i<arr3.length; i++) {
			for(int j=0;j<arr3[i].length;j++) {
				
				System.out.print(arr3[i][j]+" ");
			}
			
		}
		sc.close();  //close딱히안해도됨..안전하게끊겨나감
	}
}
