package java03_scanner;

//java.util.Scanner�� ��Ű���� �����ϰ� Scanner��� ����� �� �ֵ��� ���ִ� �ڵ�
import java.util.Scanner;
public class ScannerEX_02 {

	public static void main(String[] args) {
		
		//���ڿ� �Է¹ޱ�
		//1.�Է°�ü ���� ���� (java.util.Scanner)
		Scanner in;
		in= new Scanner(System.in);
		//2.�Է°�ü ����(new)
		//3.���ڿ� �Է¹ޱ� (String)
		System.out.print("���ڿ� �Է��ϼ��� : ");
		String str = in.nextLine();
		
		//4. �Է¹��� ���ڿ� ����ϱ�
		System.out.println("�Է��� ���� : " + str);
		
		//--------------------------------------------------------
		int intNum = in.nextInt();
		double doubleNum = in.nextDouble();
		boolean bData = in.nextBoolean();
		
		
//		char ch = in.nextChar();//char �� ���� �Է� �޼ҵ�� ����
		
	}

}
