package java06_class.method.quiz;

public class MethodQuiz {

	
	public void print100() {	//Q1. 1~100출력
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
	}
	
	public void printHello(int num) {	//Q2. 1~입력값까지출력
		for(int i=0;i<num;i++) {	
			System.out.println("Hello");		
		}
	}
	
	public void printText(int cnt, String text) {//Q3. 입력한 횟수만큼 입력한 텍스트 출력
		for(int i=0;i<cnt;i++) {
			System.out.println(text);
		}
	}
	
}
