package java06_class.overloading;

public class OverloadingEx {
	public static void main(String[] args) {
		System.out.println(); //�����ε� �����̸����� �پ��ѵ�����Ÿ�� ó��
	
	Overloading_01 o101=new Overloading_01();
	
	System.out.println("---display() ---");
	o101.display();
	
	System.out.println("---display(11,22) ---");
	o101.display(11,22);
	System.out.println("---display() ---");
	o101.display();
	}
}
