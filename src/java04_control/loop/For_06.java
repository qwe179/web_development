package java04_control.loop;

public class For_06 {
	public static void main(String[] args) {
		
		//구구단 2단을 출력하기
		
		//출력 예시)
		//2 x 1 = 2
		
		//2 x 2 = 4
		//....... 2 x 9 = 18

		//반복횟수 : x9
		//반복구간 : 1~9
		
		//초기식 : int i = 1;
		//조건식 : i <= 9;
		//증감식 : i++; (1씩 증가)
		
		int N = 1;
		
		for(int j=0; j<8; j++) {
			N++;
			for(int i=1; i<10; i++) {		
			
				System.out.println(N + " x "+ i + " = " + N*i);
			}
		}

		
	}
}
