package java06_class.field;

public class MemberField_02 {
	//Ŭ���� ����, ���� ����, static ����
//	private static String city ="Seoul";
	public static String city ="Seoul";
	
//	public String getCity() {  //��������ڵ�, private static�������� ���ٸ���
//		return city;
//	}
	//���� �޼ҵ�, static �޼ҵ�  //��ü�������ص� ��ٷ� �����ִ� �޼ҵ�
	public static String getCity() {
		return city;
	}
////class������ �ִ°� �ʱ�ȭ��Ű�� ..�ν��Ͻ������� 
//�����ϴ� ���� �� �ٲ�..

//������ü ��� ��ü���� ���� �ڿ����� ���(�б�����)
	//--------------------------------------
	
	private int num; //�ν��Ͻ� ����
	public static void test() {//���� �޼ҵ�
//		System.out.println(num);//����
		
	}
	//�����޼ҵ忡�� �ν��Ͻ����� ��� �Ұ�
	//--------------------------------------
	private int num2; //���� ����, Ŭ���� ����
	
	public void test2() {//�Ϲ� �޼ҵ�
		System.out.println(num2);
	}
	//�Ϲ� �޼ҵ忡�� ���� ���� ����ϴ� ���� ��������
	
}




