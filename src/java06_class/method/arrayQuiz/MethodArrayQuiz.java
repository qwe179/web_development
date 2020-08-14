package java06_class.method.arrayQuiz;

public class MethodArrayQuiz{
	
	public void mul10(int[] arr) {	//1.배열의 모든 요소 10배
		
		for(int i =0; i<arr.length; i++) {
			arr[i] *=10;
		}
	}
	
	public void print(int[] arr) {  //2.배열의 모든 요소 출력
		
		for(int i =0; i<arr.length; i++){
			
			
			System.out.print(arr[i] + " ");
		}
	}
}