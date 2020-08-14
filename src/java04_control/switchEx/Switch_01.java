package java04_control.switchEx;

public class Switch_01 {

	public static void main(String[] args) {
		
//		//swith문, 선택문
//		//	switch-case문
//		switch(비교대상) {
//		
//		case 값1:
//		case 값2:
//		case 값3:
//			...
//		default:
//		
//			
//		}
		
		
		int num = 50;
		
		switch(num) {  //해당위치로부터 내려가면서 출력 

		case 20:
			System.out.println("num은 20입니다");
			break;
		
		case 10:
			System.out.println("num은 10입니다");
			break;
		
		case 30:
			System.out.println("num은 30입니다");
			break;
			
		default:
			System.out.println("num가 10, 20, 30 다 아닙니다");

		}
		
		//비교대상에 활용된 값과  case에 지정된 값이 같으면
		//해당 case구문의 위치부터 코드가 실행된다
		//다음 case구문까지도 실행되므로 break로 중단시켜준다
		
		//case에 지정된 값이 없으면 default로 간다
		
		//default: 는 생략 가능하다
		
		
		
	}
}
