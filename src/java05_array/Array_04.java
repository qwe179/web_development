package java05_array;

public class Array_04 {
	public static void main(String[] args) {
		
		
		//���ڿ�, String
		//char������ ������ char[]�� ������ ����Ѵ�
		
		//������,char[]�� String�� ���� ������Ÿ���� �ƴϴ�
		
		String str = "Apple";
		char[] chArr = {'A','p','p','l','e'};
		
		System.out.println("���ڿ��� ���� : " + str.length());
		System.out.println("char�� �迭�� ���� : " + chArr.length);
		System.out.println("------------------");
		
		//System.out.println("���ڿ��� ����° ���� : " + str.charAt(10)); //StringIndexOutOfBoundsException
		System.out.println("�迭�� �׹�° ���� : " + chArr[3]);
		
		System.out.println("------------------");
		
		//toCharArray() : String -> char[] ��ȯ �޼ҵ�
		char[] converted = str.toCharArray();
		
		System.out.println(converted[3]);
		System.out.println(converted[4]);
	}
}
