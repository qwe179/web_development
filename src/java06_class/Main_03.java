package java06_class;


public class Main_03 {
	public static void main(String[] args) {
		Class_03 cl = new Class_03();
		
//		cl.num = 123;
		cl.setNum(123);
		
		int n = cl.getNum();
		System.out.println(n);
		System.out.println(cl.getNum());
	}
}
