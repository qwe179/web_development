package java03_scanner;

//java.util.Scanner�� ��Ű���� �����ϰ� Scanner��� ����� �� �ֵ��� ���ִ� �ڵ�
import java.util.Scanner;
public class ScannerEX_01 {

	public static void main(String[] args) {
		
		//class Scanner
		//��ĳ�� Ŭ����
		//Ű������ �Է��� �޾��ִ� ���
		int num; //���� ����
		num = 123; //������ ����
		
		// -----------------------------------------------------------------------------------
//		java.util.Scanner input;
		
		Scanner input; //��ü ���� ����
		input= new Scanner(System.in); //�Է� ��ü ����
		
		int data; //������ ���� ����
		
		//Ű����� �Է��� �������� data ������ ����(����)�Ѵ�
		data = input.nextInt();
		
		//�Էµ� ������(������) ���
		input.close();
		System.out.println("�Է��� �� : " +data);
		
		
		
	}

}
