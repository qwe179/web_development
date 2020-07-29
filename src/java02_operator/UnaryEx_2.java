package java02_operator;

public class UnaryEx_2 {
	public static void main(String[] args) {
		
		//단한연산자 - 증감
		// ++ : 증가연산자
		// -- : 감소연산자 둘이 합쳐서 증감연산자
		
		//피연산자로 적용된 변수의 값을 1 증가(감소)시킨다.
		
		int num;
		num = 15;//15로 초기화
		System.out.println(num); //원본값
		System.out.println(num--); //활용, 후위 감소, 후치 감소
		System.out.println(num); //연산 후
		
		System.out.println("--------------------");
		num = 15;//15로 초기화
		System.out.println(num); //원본값
		System.out.println(--num); //활용, 전치 감소, 전위 감소
		System.out.println(num); //연산 후
		
		System.out.println("--------------------");
		num = 13;//13로 초기화
		System.out.println(num++ - 10 + ++num); //18
		System.out.println("--------------------");
		num = 15;//15로 초기화
		System.out.println(num); //원본값
		System.out.println(++num); //활용
		System.out.println(num); //연산 후
		
		
		
		
	}
	
	
}
