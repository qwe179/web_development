package java04_control.loop;


public class For_07 {
	public static void main(String[] args) {
		
		//첫날에 10원을 예금하고,
		int money = 10; //예금 : money 
		int account=0; //저축액 : account
		
		//반복 : 14일
		
		//반복 한번에 수행해야할 작업(코드)
		//매일 해야하는 일
		//	a. 예금액 두배로 늘리기
		//	b. 총 금액에 예금액을 더하기
		for(int i=0; i<15; i++) { //i, 0~14, 15번(15일동안)
			//전날의2배를예금 (예금액)
			account+=money; //예금액을 총 금액에 더하기
			money*=2; //예금액 2배로 증가시키기
		}
		System.out.println("저축한 총 금액 : " + account + "원");
		
		
		
		//다음날에는 전날의 2배를 예금하는 방식으로
		//보름(15일) 동안 저축한 금액은?

		
	}
}
