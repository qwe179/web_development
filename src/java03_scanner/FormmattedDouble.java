package java03_scanner;


public class FormmattedDouble {

	public static void main(String[] args) {

		//�Ҽ��� ��°�ڸ����� �ݿø��Ͽ� ���
		
		//���1.
		//System.out.printf()�� ����Ѵ�.
		//printf : print formmatted
		System.out.printf("%.2f", 12345.67890);
		
		//%.2f ���Ĺ���
		//f : floating point number ( �ε��Ҽ���, �Ǽ�)
		// .2 : �ڸ���, �Ҽ������� 2��°������ ���
		
		//%5d ���Ĺ���
		//d : decimal number(10���� ����)
		// 5 : �ڸ���, 5ĭ�� Ȯ���ϰ� ���
		
		
		//���2
		double avg = 34.56778899;
		
		//Math.round(����) : ������ �Ҽ������ϸ� �ݿø����ִ� �޼ҵ�(���)
		double result = Math.round(avg*100);
		System.out.println(result);
		//avg : 34.56778899
		System.out.println(avg);
		System.out.println(avg * 100);
		System.out.println(Math.round(avg*100));
		System.out.println(Math.round(avg*100)/(double)100);
		//avg * 100 : 3456.778899
		//Math.round(avg*100) : 3457.0
		//Math.round(avg*100)/(double)100 : 34.57
	}
}
