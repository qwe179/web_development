package java03_scanner;

//java.util.Scanner�� ��Ű���� �����ϰ� Scanner��� ����� �� �ֵ��� ���ִ� �ڵ�
import java.util.Scanner;
public class ScannerEX_03 {

	public static void main(String[] args) {

		
		//Scanner�� �̿��Ͽ� char�Է� ó���ϱ�
		// String�� char���� ���� ��Ƴ��� Ÿ��
		// String���� �Է��� �ް� �� ����(����)�� ����� -> char
		//----------------------------------------------------------------------
		
		Scanner sc = new Scanner(System.in); //�Է� ��ü
		
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine(); //���ڿ��� �Է¹޾� str��ü�� ����
		
		//�Է��� ���ڿ� Ȯ��
		System.out.println("�Էµ� ���ڿ� :" + str);
		
		char ch =str.charAt(0);
		
		System.out.println("0��° ���� ���� : " + ch);
		
		System.out.println("------------");
		System.out.println("������ �Է��ϼ��� : ");
		
		String genderString = sc.nextLine();
		char gender = genderString.charAt(0);
//		char gender = sc.nextLine().charAt(0); //���ɵ� �����ִ�.
		System.out.println("�Է��� ���� : " + gender);
	} // main method end

}

