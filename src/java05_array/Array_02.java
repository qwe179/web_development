package java05_array;

public class Array_02 {
	public static void main(String[] args) {
		
		int num = 100; //������ ����� ���ÿ� �ʱ�ȭ
		//----------------------------------------------
		
		//�迭�� ����� ���ÿ� �ʱ�ȭ
		int[] arr = {1,2,3,4,5};
//		int[] arr;
//		arr = new int[5];
//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=3;
//		arr[3]=4;
//		arr[4]=5;

		//�迭 ���
		 for(int i=0; i<5; i++) {
			 
			 System.out.println(arr[i]);
		 }
		 
		 //--------------------------------------
		 
		 char[] chArr = {'a','p','p','l','e'};
		 
		 double[] dbArr = {1.1, 2.2 ,3.3 , 4.4,5.5};
		 
		 boolean[] bArr = {true,true,false,false,true};
		 for(int i=0; i<5; i++) {
					 
					 System.out.println(dbArr[i]);
				 }
	

	}
}