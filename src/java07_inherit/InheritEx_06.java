package java07_inherit;
class Parent6{
	public void display() {//final - �� �̻� �������̵� �Ұ�
		System.out.println("�θ� �޼ҵ�");
	}
}
//final class Child6 extends Parent6 { //����� �� �� ���� Ŭ����
class Child6 extends Parent6{
	@Override
	public final void display() {
		System.out.println("�ڽ� Ŭ���� �������̵� �޼ҵ�");

	}
}

class GrandChild extends Child6{
//	@Override
//	public void display() {
//		System.out.println("2�� �����ǵ� �޼ҵ�");
//	}
	
}

public class InheritEx_06 {
	public static void main(String[] args) {
		GrandChild gc = new GrandChild();
		gc.display();
	}
}
