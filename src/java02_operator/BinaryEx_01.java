package java02_operator;

public class BinaryEx_01 {

	public static void main(String[] args) {
		
		//���׿����� - ���
		// + - * / %
		
		int num1 = 17, num2 = 4;
		
		int result; //��� ���� ����
		
		result = num1 + num2;
//		result = 17+4; //���� Ȱ��
//		result = 21; //���� ����
		
		System.out.println("���� ��� :" + result);
		System.out.println(num1 + "��" + num2 + "�� �հ� :" + result);
		System.out.println("---------");
		//%
		//������ ������
		//modular operator
		//mod
		
		
		result = num1 % num2; // num1�� num2�� ���� ������
		System.out.println("������ ���� ��� : " + result);

		//-----------------------------------------------------------------------------------------------------
		System.out.println("---��� ������ ---");
		System.out.println("num1 + num2 = " + (num1 + num2));//���ϱ�
		System.out.println("num1 - num2 = " + (num1 - num2));//����
		System.out.println("num1 * num2 = " + (num1 * num2));//���ϱ�
		System.out.println("num1 / num2 = " + (num1 / num2));//������
		System.out.println("num1 % num2 = " + (num1 % num2));//������
		
		//��������� �ݵ�� �ǿ����ڵ��� ���� ������ Ÿ���� ���� ���� ����
		//��������� ����� �ǿ����ڵ��� ������Ÿ������ ���´�.
		System.out.println("---------");
		
		System.out.println(num1 / num2); // int/int
		System.out.println((double)num1 / (double)num2); // double/double
		
		
		System.out.println("---------");
		System.out.println(num1 / (double)num2); // int/double
		System.out.println(17 / (double)4); // int / (double)int
		System.out.println(17 / 4.0); //int / double
		System.out.println(17.0 / 4.0); //double / double (�ڵ�����ȯ)
		System.out.println(4.25); //double
		System.out.println("---------");
		
		double d = 3.14;
		System.out.println("d/2 = " + (d/2));
		System.out.println("d%2 = " + (d%2));
		
		
		
	}
	
	
}
