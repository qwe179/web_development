package java06_class.method;

public class Method_02 {

	//�Ű�����
	//��ȯ������(return)
	
	//------------------------------------------------
	
	//�Ű����� X, ����Ÿ�� X
	public void method01() {
		System.out.println("Hello");	
	}
	
	
	//------------------------------------------------
	
	//�Ű����� 0, ����Ÿ�� x
	public void method02(int parameter) {// �Ű����� == parameter
		System.out.println("���޵� �� : " + parameter);
	}
	//------------------------------------------------
	
	//�Ű����� X, ����Ÿ�� o
	public int returnNum() {
		return 777;
	}
	//------------------------------------------------
	//�Ű����� o, ����Ÿ�� o
	public int plus(int n1, int n2) {
		return n1+n2;
		
		
	}
	
	
}
