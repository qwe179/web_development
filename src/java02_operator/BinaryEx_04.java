package java02_operator;

public class BinaryEx_04 {
	public static void main(String[] args) {
		
		//���׿����� - ��
		//&&  ||  !
		//AND OR NOT
		
		// ! �����ڴ� ���� ������
		
		// AND ������ �ǿ����� ��� true�� �� ����� true
		// OR ������ �ǿ����� �� �ϳ��� true�� �� ����� true
		// NOT ������ �ǿ����ڸ� ����(�ݴ�� �ٲ�)
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("true&&false : " + (b1&&b2));
		System.out.println("true||false : " + (b1||b2));
		System.out.println("-----------");
		
		int num = 88;
		System.out.println(num >=1); // true
		System.out.println(num <=100); // true
		
		
		//num�� ������ ���� 1~100������ �����ΰ�
		
		System.out.println( num>=1 && num<=100); // true
//		System.out.println( 88>=1 && 88 <=100); 
//		System.out.println( true && 88 <=100); 
//		System.out.println( true && true); 
		
		//-------------------------------------------------------------------
//		System.out.println( 1 <= num <= 100);  
//		System.out.println( 1 <= 88 <= 100);  
//		System.out.println( true <= 100); ----->���⼭ ������ 
		//-------------------------------------------------------------------
		
		System.out.println((num >=1)&& (num<=100));
		System.out.println(!((num >=1)&& (num<=100)));
//		System.out.println(!(num >=1)!&& !(num<=100));
//		System.out.println(!(num <1)!&& !(num >100));     /////��
		
		
		
	}
}

