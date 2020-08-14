package java05_array.sort;

public class Swap {
	public static void main(String[] args) {
		
		//스왑,swap,자리바꾸기,교환
		
		int num1 = 11;
		int num2 = 22;
		
		System.out.println("[전]" + num1 + " : " + num2);
		
		//스왑 코드
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
		
		System.out.println("[후]" + num1 + " : " + num2);
		
		
	}

}
