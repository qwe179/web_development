package java05_array.copy;

public class ArrayCopy_02 {
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
		
		//2.������ ���� (for�� �̿��ϱ�)
		for(int i = 0; i< arr2.length; i++) {
			arr2[i] = arr1[i];//�纻 <- ����
		}
		
		//----------------------------------------------------------------------
		System.out.println("- - - ������ ���� �� - - -");
		for(int i =0; i<arr1.length; i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
	}
}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		