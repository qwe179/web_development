package java05_array.copy;

public class ArrayCopy_03 {
	public static void main(String[] args) {
		
		//�迭 �����ϱ� - ���� ����
		int[] arr1 = {10,20,30}; //����, Source
		int[] arr2; //�纻, Destination
		
		//���� ����(deep copy)
		//���� ����� ���빰(���� ������)�� ���ο� ������ �����ϴ� ��
		
		//������ �и��� ������ ������
		
		//---------------------------------------------------------------------
		
		//1.����� ���� Ȯ��(����) - Destination
		arr2 = new int[arr1.length];
		//2.������ ����(System Ŭ������ �迭 ���� �޼ҵ�(���) ���)
		//System.arraycopy(src, srcIdx, dest, destIdx, length)
		System.arraycopy(arr1,0,arr2,1,2);
		//arr1[1]=10;
		//----------------------------------------------------------------------
		System.out.println("- - - ������ ���� �� - - -");
		for(int i =0; i<arr1.length; i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
	}
}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		