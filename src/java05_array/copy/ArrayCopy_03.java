package java05_array.copy;

public class ArrayCopy_03 {
	public static void main(String[] args) {
		
		//배열 복사하기 - 깊은 복사
		int[] arr1 = {10,20,30}; //원본, Source
		int[] arr2; //사본, Destination
		
		//깊은 복사(deep copy)
		//참조 대상의 내용물(실제 데이터)을 새로운 공간에 복사하는 것
		
		//원본과 분리된 공간을 가진다
		
		//---------------------------------------------------------------------
		
		//1.복사될 공간 확보(생성) - Destination
		arr2 = new int[arr1.length];
		//2.데이터 복사(System 클래스의 배열 복사 메소드(기능) 사용)
		//System.arraycopy(src, srcIdx, dest, destIdx, length)
		System.arraycopy(arr1,0,arr2,1,2);
		//arr1[1]=10;
		//----------------------------------------------------------------------
		System.out.println("- - - 데이터 수정 전 - - -");
		for(int i =0; i<arr1.length; i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
	}
}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		