package java06_class.method;

import java.util.Arrays;

public class MethodEx {

	public static void main(String[] args) {
		
//		int n=10;
//		if(n==10) {
//			return;
//		}
		
		
		
		Method_01 m01 = new Method_01();
		
		int num1=15, num2=10;
		int sum =m01.add(num1, num2);
		
		System.out.println(sum);
		System.out.println("----------------");
		
		Method_02 m02 = new Method_02();
		
		m02.method01();//ȣ��
		System.out.println("----------------");
		m02.method02((int)123.45);
		System.out.println("----------------");
		//�����ϴ� ������ - ��������, �����μ�, ����, �μ�
		//argument
		System.out.println("��ȯ�� : " + m02.returnNum());
		System.out.println("----------------");
		System.out.println("���� ��� : " +m02.plus(10, 20));
		
		System.out.println("----------------");
		Method_03 m03 = new Method_03();
		
		int[] arr = new int[5]; //int�� �迭
		arr[2] = 100;
		
		System.out.println(Arrays.toString(arr));
		
		m03.arrayTest01(arr);//������������ �������ڷ� ���
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("---------");
		
		int num = 50;
		System.out.println(num);
		m03.arrayTest02(num); //�⺻�������� �������ڷ� ���
		System.out.println(num);
		
		
		
		
	}
}
