package java01_variables;

public class VariablesEx_07 {

	public static void main(String[] args) {
		
		//�ڹ��� �⺻��
		// 8���� �⺻������Ÿ��(Primitive Type)
		// ������ ������Ÿ��(Reference, class)
		
		
		//---------------------------------------
		//String Ÿ��
		// ���ڿ�
		// ������ ������Ÿ�� �� �ϳ�
		// " " �� ���� ���� ���ڸ� ���μ� ǥ��
		
		String fruit; //���ڿ� ���� ����
		fruit = "Apple"; //���ڿ� "Apple" �� ����(����)
		System.out.println(fruit);
		
		fruit ="Banana";
		System.out.println(fruit);
		
		
		
		
		
		
		
		
		String name = "jenny";
		int age = 26;
		char gender = '��';
		double height = 160.66;
		
		System.out.println("�̸� :" + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + gender);	
		System.out.println("Ű : " + height);	
		
		
//		������ �˸��� Ÿ�� ã��
//		int(���� - �Ҽ��� ���� ���� ����)
//		double(�Ǽ� - �Ҽ��� ���� �ִ� ����)
//		char(���� �� �� - ''�� ǥ��, ��ҹ��� ,����, �ѱ�, ��ȣ ��)
//		boolean(true/false)
//		String(���ڿ�, ���� ���� ���� �ѹ��� - ""�� ǥ��)
//		�̸� - String
//		���� - int
//		���� - String, char
//		Ű - double
		
//		2.���� ����
		String name2;//�̸� ���� ����
		int age2;//���� ���� ����
		char gender2;//���� ���� ����
		double height2;//Ű ���� ����
		
//		3.�� ����
		name2 = "ȫ�浿";
		age2 = 55;
		gender2 = '��';
		height2 = 222.22;
		
//		4. ��� �����͸� ���
		System.out.println("�̸� :" + name2);
		System.out.println("���� : " + age2);
		System.out.println("���� : " + gender2);	
		System.out.println("Ű : " + height2);	
				
	}
	
	
	
}
