package java05_array;

public class Array_03 {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50}; //���������� .�� �� �߰����� ��� ��� ����
		
		//�迭�� ��� ����, �迭�� ����, �迭�� ũ��
		System.out.println("�迭�� ���� : " + arr.length);
		
		//�迭�� ���̸� �̿��� �迭 ��ü ���
		for(int i =0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
		//-----------------------------------------------------------------------
		
		//arr�� �ε��� : 0~4, 0~length-1, 0~ ����-1
		
		//arr[5] = 99; //ArrayIndexOutOfBoundsException
		// 0���� �۰ų� arr.length���� ũ�ų� ���� �ε����� ������ �� �߻�
		
		//int[] arr2 = new int[-10];
		//NegativeArraySizeException
		//�迭�� ũ�⸦ ������ �����ؼ� ������ �� �߻��ϴ� ����
		
		//arr[-5] = 111;
		//ArrayIndexOutOfBoundsException
		//������ �ε����� �������� �� �߻��ϴ� ����
		
		
	}
}