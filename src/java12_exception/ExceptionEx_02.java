package java12_exception;

public class ExceptionEx_02 {
	public static void main(String[] args) {
		int[]arr = new int[5];
		
		int i=0;
		
		try {//try-catch
		
			while(true) {     
				
				arr[i] = i+1; //배열에 값 대입
				System.out.println(arr[i]);
				
				i++;
				
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("[EXCEPTION] 인덱스 벗어남!");
			
			//예외 상황 출력 메소드
			e.printStackTrace(); //메소드 호출 스택. 메소드가 어디서 호출되고 다음메소드는 뭐고.. 추적상황을 출력해서 보여주어라
			
		}
		
		System.out.println("+ + + 프로그램 정상 종료 + + +");
		
		
		
	}
}
