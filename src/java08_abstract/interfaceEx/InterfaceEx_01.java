package java08_abstract.interfaceEx;
//�������̽�
interface TestInterface{
	public static final int NUM =888;//public static final �����ص��Ǵµ� �Ĳ��� ���ִ°�
	int NUMBER = 100; //����� �������
	//---------------------------------------------
	public abstract void display();
	//�޼ҵ忡 abstract Ű���尡 ��� �߻� �޼ҵ�� ���ǵȴ�
	public void out();
		
}
//�������̽��� ���(����)�ϰ� �ִ� Ŭ����
//->�������̽��� ���ǵ� �߻�޼ҵ带 �ݵ�� �����ؾ��Ѵ�(�������̵�)
class Test implements TestInterface{
	public static final int NUM = 888;//���
	
	@Override
	public void display() {
	
	}
	@Override
	public void out() {
	
		
	}
	
}





//�߻�Ŭ����
abstract class TestClass{
	public static final int MAX =999;//���
	
	public abstract void method(); //�߻�޼ҵ�
}






public class InterfaceEx_01 {
	public static void main(String[] args) {
		TestClass tc1;//��ü ���� ����
//		tc1 = new TestClass(); //����,�߻�Ŭ������ ��ü ���� �ȵ�
		System.out.println(TestClass.MAX);
		System.out.println("--------------");
		System.out.println(TestInterface.NUM);
	}
}
