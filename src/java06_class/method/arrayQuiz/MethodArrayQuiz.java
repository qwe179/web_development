package java06_class.method.arrayQuiz;

public class MethodArrayQuiz{
	
	public void mul10(int[] arr) {	//1.�迭�� ��� ��� 10��
		
		for(int i =0; i<arr.length; i++) {
			arr[i] *=10;
		}
	}
	
	public void print(int[] arr) {  //2.�迭�� ��� ��� ���
		
		for(int i =0; i<arr.length; i++){
			
			
			System.out.print(arr[i] + " ");
		}
	}
}