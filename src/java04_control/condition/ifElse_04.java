package java04_control.condition;

public class ifElse_04 {

	public static void main(String[] args) {
		
		//if ~ else if ~ else
		
//		if(조건식1) {
//			조건식1이 참일 때 수행하는 코드 영역
//			
//			**중간에 else가 껴져있으면 if문 코드가 끝나버림
//			
//		} else if(조건식2) {
//			조건식1이 거짓이고
//			조건식2가 참일 때 수행하는 코드 영역
//		} else if(조건식3) {
//			조건식1이 거짓이고
//			조건식2가 거짓이고
//			조건식3이 참일 때 수행하는 코드 영역
//			
//		} else {
//			조건식1,2,3 모두 거짓일 때 수행하는 코드 영역
//		}
		
		//** else, else if 구문은 필수가 아니다(없어도 됨)
		//------------------------------------------------------------
		
		int num = 30;
		
		if( num==10) {
			System.out.println("10입니다");
			
		} else if (num ==20) {
			System.out.println("20입니다");
		} else if (num ==30) {
			System.out.println("30입니다");
		} else {
			System.out.println("10,20,30이 아닙니다");
			
		}
		
	}
}
