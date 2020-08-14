package java03_scanner;


public class FormmattedDouble {

	public static void main(String[] args) {

		//소수점 셋째자리에서 반올림하여 출력
		
		//방법1.
		//System.out.printf()를 사용한다.
		//printf : print formmatted
		System.out.printf("%.2f", 12345.67890);
		
		//%.2f 서식문자
		//f : floating point number ( 부동소수점, 실수)
		// .2 : 자릿수, 소수점이하 2번째까지만 출력
		
		//%5d 서식문자
		//d : decimal number(10진수 정수)
		// 5 : 자릿수, 5칸을 확보하고 출력
		
		
		//방법2
		double avg = 34.56778899;
		
		//Math.round(숫자) : 숫자의 소수점이하를 반올림해주는 메소드(기능)
		double result = Math.round(avg*100);
		System.out.println(result);
		//avg : 34.56778899
		System.out.println(avg);
		System.out.println(avg * 100);
		System.out.println(Math.round(avg*100));
		System.out.println(Math.round(avg*100)/(double)100);
		//avg * 100 : 3456.778899
		//Math.round(avg*100) : 3457.0
		//Math.round(avg*100)/(double)100 : 34.57
	}
}
