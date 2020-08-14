package java06_class.method;

import java.util.Arrays;

public class MethodEx {

	public static void main(String[] args) {
		
//		int n=10;
//		if(n==10) {
//			return;
//		}
		
		
		
		Method_01 m01 = new Method_01();
		
		int num1=15, num2=10;
		int sum =m01.add(num1, num2);
		
		System.out.println(sum);
		System.out.println("----------------");
		
		Method_02 m02 = new Method_02();
		
		m02.method01();//호출
		System.out.println("----------------");
		m02.method02((int)123.45);
		System.out.println("----------------");
		//전달하는 데이터 - 전달인자, 전달인수, 인자, 인수
		//argument
		System.out.println("반환값 : " + m02.returnNum());
		System.out.println("----------------");
		System.out.println("덧셈 결과 : " +m02.plus(10, 20));
		
		System.out.println("----------------");
		Method_03 m03 = new Method_03();
		
		int[] arr = new int[5]; //int형 배열
		arr[2] = 100;
		
		System.out.println(Arrays.toString(arr));
		
		m03.arrayTest01(arr);//참조형변수를 전달인자로 사용
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("---------");
		
		int num = 50;
		System.out.println(num);
		m03.arrayTest02(num); //기본형변수를 전달인자로 사용
		System.out.println(num);
		
		
		
		
	}
}
