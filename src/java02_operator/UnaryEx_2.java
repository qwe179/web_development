package java02_operator;

public class UnaryEx_2 {
	public static void main(String[] args) {
		
		//���ѿ����� - ����
		// ++ : ����������
		// -- : ���ҿ����� ���� ���ļ� ����������
		
		//�ǿ����ڷ� ����� ������ ���� 1 ����(����)��Ų��.
		
		int num;
		num = 15;//15�� �ʱ�ȭ
		System.out.println(num); //������
		System.out.println(num--); //Ȱ��, ���� ����, ��ġ ����
		System.out.println(num); //���� ��
		
		System.out.println("--------------------");
		num = 15;//15�� �ʱ�ȭ
		System.out.println(num); //������
		System.out.println(--num); //Ȱ��, ��ġ ����, ���� ����
		System.out.println(num); //���� ��
		
		System.out.println("--------------------");
		num = 13;//13�� �ʱ�ȭ
		System.out.println(num++ - 10 + ++num); //18
		System.out.println("--------------------");
		num = 15;//15�� �ʱ�ȭ
		System.out.println(num); //������
		System.out.println(++num); //Ȱ��
		System.out.println(num); //���� ��
		
		
		
		
	}
	
	
}
