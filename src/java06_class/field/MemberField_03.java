package java06_class.field;

public class MemberField_03 {
	
	private int num = 777;//�ν��Ͻ� ����
	private static int num2 = 555; //Ŭ���� ����,���� ����
	
	//�Ϲ� �޼ҵ�
	public void method(int var) { //var -> �Ű�����,��������
		
		System.out.println(num);
		System.out.println(num2);
		
		//---------------------------
		
		int num = 101;//��������
		int num2 = 202;//��������
		
		System.out.println(num);
		System.out.println(num2);
		
		//------------------------------
		System.out.println(this.num);//����ʵ� ���
		System.out.println(this.num2);//����ʵ� ���
		
		//���� ������ ���� ������ Ŭ������. ���� �ϴ°� ����
		System.out.println(MemberField_03.num2);
		
	}
	
	//���� �޼ҵ�
	public static void method2() {
//		System.out.println(num); //�ν��Ͻ� ����,�Ұ�
		System.out.println(num2);//���� ����, ����
		
	}
	
	
	
}




