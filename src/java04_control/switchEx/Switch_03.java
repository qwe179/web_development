package java04_control.switchEx;

public class Switch_03 {

	public static void main(String[] args) {


		//논리형 데이터를 switch에 사용할 수 없음
//		
//		boolean b = true;
//		
//		
//		switch( b) {
//		
//		case true:
//		case false:
//		}
//		
//		//-------------------------------------------
//		
//		//실수형 데이터를 switch에 사용할 수 없음
//		double d = 3.14;
//	
//		swith(d){
//			
//		}
		//-------------------------------------------
		//switch에서 char 형 다루기
		
		char alpha = 'B';
		
		switch(alpha) {
		case 'A':
			System.out.println("A입니다");
			break;
		case 66: //'B'
			System.out.println("B입니다");
			break;
		case 'C':
			System.out.println("C입니다");
			break;
		default:
			System.out.println("A,B,C 다 아닙니다");
		}
		
		
	}
}
