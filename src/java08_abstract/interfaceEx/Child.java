package java08_abstract.interfaceEx;

public class Child extends Parent implements Inter_01,Inter_02{
	
	@Override
	public void out() {
		System.out.println("�ڽ�Ŭ����");
	}
	
}

//**�ڹٴ� ���߻���� �����ϰ� �ִ�

//class Parent1 {
//	public void out() {
//		
//	}
//}
//class Parent2 {
//	public void out() {
//		
//	}
//}
//class Children extends Parent1,Parent2{
//	//� �θ�Ŭ������ out()�޼ҵ带 ��ӹ޾ƾ� �ϴ��� ��ȣ������
//	//out()�޼ҵ带 ȣ���� ������ ���������� ��ȣ�� ��Ȳ�� �ȴ�.
//	//->�ڹٴ� extends�� ����� �� �ִ� �θ� Ŭ������ �Ѱ��� �����Ѵ�
//}