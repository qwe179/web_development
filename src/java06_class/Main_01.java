package java06_class;

//���� Ŭ���� - ���� �޼ҵ尡 ���ǵǾ� �ִ� Ŭ����
public class Main_01 {  //MainEx(Executor)����
	public static void main(String[] args) {
		
		//Class_01 Ŭ����Ÿ���� ��ü ���� c01 ����
		Class_01 c01;
		
		//Class_01 Ŭ����Ÿ���� ��ü ����(�ν��Ͻ� ����) - �ν��Ͻ�ȭ
//		new Class_01(); ///������ ���⶧���� �������÷��Ͱ� ��������
		
		c01 = new Class_01();
		
		//����ʵ忡 �� ����
		c01.num = 100;
		c01.data = "Apple";
	
		//c01 ��ü�� ����ʵ� num,data ���
		System.out.println(c01.num);
		System.out.println(c01.data);
		
		//c01 ��ü ���
		System.out.println(c01);
		
		//c01 ��ü�� ��� �޼ҵ� display() ȣ��(call)
		c01.display();//�޼ҵ�� ���� () ��ȣ�� ���δ�.
		
		//-----------------------------------------------------
		
		Class_01 c02 = new Class_01();
		Class_01 c03 = new Class_01();
		Class_01 c04 = new Class_01();
		Class_01 c05 = new Class_01();

		c02.num = 100;
		c03.num = 200;
		c04.num = 300;
		c05.num = 400;
		
		
		
	}
}
