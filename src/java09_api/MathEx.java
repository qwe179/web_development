package java09_api;

import java.util.Arrays;
import java.util.Random;

public class MathEx {
	public static void main(String[] args) {
	
	double result;
	//원주율 출력
	result=Math.PI;
	System.out.println(result);
	//-10의 절대값
	//abs, absolute
	System.out.println(Math.abs(-10));
	//3.7의 올림값
	result = Math.ceil(3.7);//ceil, ceiling
	System.out.println(result);
	//3.7의 내림값
	result = Math.floor(3.7);//floor, flooring
	System.out.println(result);
	//-3.7의 반올림값
	result = Math.round(-3.7);// round, rounding
	System.out.println(result);
	//2.1의 3제곱값
	result= Math.pow(2.1, 3);//pow, power
	System.out.println(result);
	//3.14와 3.141592 중 큰 값
	result =Math.max(3.14, 3.14592);//max
	System.out.println(result);
	
	System.out.println("-----------------");
	//0.0(포함) ~ 1.0(제외) 사이의 난수(랜덤)
	System.out.println(Math.random());
	System.out.println(Math.random()*5); //0.0(포함)~5.0(제외)
	System.out.println((int)Math.random()*5); //0~4
	System.out.println((int)(Math.random()*5)+1); //1~5
	Random ran =new Random();
	int a= ran.nextInt(100);

	//각 데이터타입으로 표현 가능한 범위의 랜덤 발생
	System.out.println(ran.nextInt()); // -21억 ~ 21억
	System.out.println(ran.nextBoolean()); // true || false
	System.out.println(ran.nextDouble()); //0.0~ 1.0
	
	System.out.println("---------------");
	
	System.out.println(ran.nextInt(100)); //0~99
	System.out.println(ran.nextInt(100)+1); //0~99
	System.out.println("--------------");
	int[] arr = new int[6];
	
	//전체 6개 랜덤 생성하기 - 로또 숫자 만들기
	for(int i = 0; i<arr.length; i++) {
		int num = ran.nextInt(45)+1; //1~45

		//이미 들어있는 값 중에 중복값이 있으면 다시 랜덤 추출

		
		arr[i] = ran.nextInt(45) + 1; //1~45
		
		for(int j = 0; j<arr.length; j++) {
			if(arr[j] ==num) {
				arr[i]=0;
				
				i--;
				
				
			}
		}

	}
	
	System.out.println(Arrays.toString(arr));

	Arrays.sort(arr);//배열 정렬
	System.out.println(Arrays.toString(arr));
	
	
	
	}
	

	
	
}
