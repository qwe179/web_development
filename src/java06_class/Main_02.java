package java06_class;


public class Main_02 {
	private int num;
	
	public static void main(String[] args) {
		
		Class_02 cl = null; //��ü ���� ���� . ����Ű�´���� �����ϴ�.
		cl = new Class_02(); //��ü ����, �ν��Ͻ�ȭ
		System.out.println(cl.num4); //public
		
		System.out.println(cl.num3); //protected
		
		System.out.println(cl.num2); //default
		
		//System.out.println(cl.num1); //private
	
		
		
	}
}
