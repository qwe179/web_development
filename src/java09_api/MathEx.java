package java09_api;

import java.util.Arrays;
import java.util.Random;

public class MathEx {
	public static void main(String[] args) {
	
	double result;
	//������ ���
	result=Math.PI;
	System.out.println(result);
	//-10�� ���밪
	//abs, absolute
	System.out.println(Math.abs(-10));
	//3.7�� �ø���
	result = Math.ceil(3.7);//ceil, ceiling
	System.out.println(result);
	//3.7�� ������
	result = Math.floor(3.7);//floor, flooring
	System.out.println(result);
	//-3.7�� �ݿø���
	result = Math.round(-3.7);// round, rounding
	System.out.println(result);
	//2.1�� 3������
	result= Math.pow(2.1, 3);//pow, power
	System.out.println(result);
	//3.14�� 3.141592 �� ū ��
	result =Math.max(3.14, 3.14592);//max
	System.out.println(result);
	
	System.out.println("-----------------");
	//0.0(����) ~ 1.0(����) ������ ����(����)
	System.out.println(Math.random());
	System.out.println(Math.random()*5); //0.0(����)~5.0(����)
	System.out.println((int)Math.random()*5); //0~4
	System.out.println((int)(Math.random()*5)+1); //1~5
	Random ran =new Random();
	int a= ran.nextInt(100);

	//�� ������Ÿ������ ǥ�� ������ ������ ���� �߻�
	System.out.println(ran.nextInt()); // -21�� ~ 21��
	System.out.println(ran.nextBoolean()); // true || false
	System.out.println(ran.nextDouble()); //0.0~ 1.0
	
	System.out.println("---------------");
	
	System.out.println(ran.nextInt(100)); //0~99
	System.out.println(ran.nextInt(100)+1); //0~99
	System.out.println("--------------");
	int[] arr = new int[6];
	
	//��ü 6�� ���� �����ϱ� - �ζ� ���� �����
	for(int i = 0; i<arr.length; i++) {
		int num = ran.nextInt(45)+1; //1~45

		//�̹� ����ִ� �� �߿� �ߺ����� ������ �ٽ� ���� ����

		
		arr[i] = ran.nextInt(45) + 1; //1~45
		
		for(int j = 0; j<arr.length; j++) {
			if(arr[j] ==num) {
				arr[i]=0;
				
				i--;
				
				
			}
		}

	}
	
	System.out.println(Arrays.toString(arr));

	Arrays.sort(arr);//�迭 ����
	System.out.println(Arrays.toString(arr));
	
	
	
	}
	

	
	
}
