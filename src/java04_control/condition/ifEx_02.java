package java04_control.condition;

public class ifEx_02 {
	public static void main(String[] args) {
	
		int num = 10;
		
		if(num==15) {
			System.out.println("Hi");
			
		}
		System.out.println("Hello");
		
		System.out.println("------------------------");
		//{}�߰�ȣ�� �ڵ带 �����ִ� ������ �Ѵ�
		//���α׷� ���� ������ ������ ���� �ʴ´�
		{
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
		
		}
		System.out.println("------------------------");
		
		//����� ��� ������ ���� �� ���� ��ҿ��� ������ �ش�.
		if(false)
			System.out.println("if�� �ڵ� 1");  //�����̾ �߰�ȣ ���ִ°� ����
		System.out.println("if�� �ڵ� 2");
		
		System.out.println("------------------------");
		
		if(false);{  //�����ݷ�����
			System.out.println("HI");
			System.out.println("Hello");
			System.out.println("Hola");
			
		}
		
	}
}
