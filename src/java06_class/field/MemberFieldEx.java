package java06_class.field;

//import java.util.Scanner;

public class MemberFieldEx {
//	static Scanner sc =new Scanner(System.in);
	int num = 10; //�ν��Ͻ� ����, main�� static�̶� ��� ����
	public static void main(String[] args) {
//		String a = MemberFieldEx.sc.nextLine();
//		System.out.println(a);
		MemberField_01 mf01 = new MemberField_01();
		MemberField_01 mf02 = new MemberField_01();
		MemberField_01 mf03 = null;
		
//		System.out.println(mf01.num);
		
//		mf01.printNum();
		System.out.println(mf01.getNum());
		mf02.setNum(777);
		
		System.out.println(mf02.getNum());
		
		MemberField_01 mf09 = new MemberField_01();
		System.out.println(mf09.getNum());
		//NullPointerException �߻�
		//null �������� �̿��Ͽ� ����� ������ �� �߻��Ѵ�
		//��û��û ���� ���̴� ����!! - �� ����� ��
		//System.out.println(mf03.getNum());
		System.out.println();
		System.out.println("-----Ŭ�������� �׽�Ʈ ----");
		
		MemberField_02 mf04 = new MemberField_02();
		MemberField_02 mf05 = new MemberField_02();
		
		System.out.println(mf04.city);
		System.out.println(mf05.city);
		
		mf04.city = "Busan";
		
		System.out.println("---Busan ����---");
		System.out.println(mf04.city);
		System.out.println(mf05.city);
		
		MemberField_02.city = "Incheon";
		System.out.println(MemberField_02.city);
		System.out.println(mf04.city);
		System.out.println(mf05.city);
		
		System.out.println(MemberField_02.city);
		
		//���� �޼ҵ� ȣ��
//		System.out.println(MemberField_02.getCity());
	}
}
