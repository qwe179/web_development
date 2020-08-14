package java06_class.constructor;

class Constructor_01{
	private int num1;
	private int num2 = 999;

	//�Ű������� ���� ������ - ����Ʈ ������(�Ű�������������)
	public Constructor_01() {  //default ������	
		System.out.println("����Ʈ ������ ȣ��");
		
		//����ʵ� �ʱ�ȭ
		// ��ü�� �����Ǹ� ����ʵ�(�ν��Ͻ�����)�� �ʱⰪ�� ������
		num1 = 500;
		num2 = 600;
		
	}
	
	//�Ű������� �ִ� ������
	public Constructor_01(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("�Ű����� �ִ� ������ ȣ��");
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
}

public class ConstructorEx_01 {
	public static void main(String[] args) {
	
	
		Constructor_01 c01; //��ü ���� ����
		c01 = new Constructor_01(); //��ü ���� - ������ ȣ��
		
		System.out.println(c01.getNum1());
		System.out.println(c01.getNum2());
		
		
		//-----------------------------------------------------------------------------------
		Constructor_01 c02; //��ü ���� ����
		c02 = new Constructor_01(111,222); //��ü ���� - ������ ȣ��
		System.out.println("c02.getNum1() : "+c02.getNum1());
		System.out.println("c02.getNum1() : "+c02.getNum2());
	}
}

