package java09_api;

public class WrapperEx {
	public static void main(String[] args) {
		
		int i1 =10;
		Integer iVal1 = new Integer(i1);//박싱,Boxing
		Integer iVal2 = new Integer("123");
		Integer iVal3 = new Integer(4567);
		
		System.out.println(iVal1);
		System.out.println(iVal2);
		System.out.println(iVal3);
		
		System.out.println("-----------");
		
		int i2 = iVal2.intValue(); //언박싱, Unboxing
		Integer iVal4 = 1234;//오토박싱, Auto Boxing
		Double dVal1 = 3245.1234;
		
		int i4 = iVal4; //오토 언박싱,Auto Unboxing
		double d1 = dVal1;
		System.out.println("-----------");
		System.out.println("BYTES : "+ Integer.BYTES);
		System.out.println("SIZE : "+Integer.SIZE);
		System.out.println("MIN_VALUE : "+Integer.MIN_VALUE);
		System.out.println("MAX_VALUE : "+Integer.MAX_VALUE);
		
		int num1=Integer.parseInt("1234");
		System.out.println(num1);
		//숫자형식(Number Format)만 가능하다
		//int num2 = Integer.parseInt("1234ABD");
		
	}

}
