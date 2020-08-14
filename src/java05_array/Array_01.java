package java05_array;

public class Array_01 {
	public static void main(String[] args) {
		
		
		int num;//int형 변수 선언
		num = 123;//변수에 값 대입
		
		//------------------
		int[] arr;//int형 배열 변수 선언 (참조형)
		arr = new int[5]; //int형 배열 생성 //new -> 생성하라는 연산자 , 이라인에서 배열 공간이 만들어짐;
		//배열 생성 시 변수공간묶음이 만들어진다
		//-----------------------------------------------------------------------
		int[] arrr = {1,2,3,4}; 
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
//		arr[5] = 60;// java.lang.ArrayIndexOutOfBoundsException: 5
		
		//----------------------------------------------------------------------
		
		//반복문을 이용한 배열값 대입
		for(int i=0; i<5; i++) { //i, 0~4, 5번
			arr[i] = (i+1)*100;
		}
		
		//반복문을 이용한 배열값 출력
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}		
		
		
		System.out.println("------------------");
		
		//배열의 이름을 출력하기
		System.out.println(arr);
		
		//[I @ 2a139a55 참조형을 출력하면 나오는것, Int at  2a139a55 - 참조값,Reference
		
		//참조값 : 데이터가 저장되어있는 메모리의 주소
		
		//참조형 데이터타입 : 참조값을 저장할 수 있는 변수

	}
}