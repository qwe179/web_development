package java05_array.array2D;
import java.util.Scanner;
public class Array2D_04 {
	public static void main(String[] args) {
		

		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		
		System.out.println("���� : " + arr.length);
		
		System.out.println("---------------------");
		arr= new int[3];
		System.out.println("���� : " + arr.length);
		//arr ������ int[3]�� ���� ������� �迭�� �����ϸ鼭
		//������ �����ϴ� int[5] �迭�� �ƹ��� �������� �ʴ´�
		
		//-> �ƹ��� �������� �ʴ� �����Ҵ������ GC�� �����Ѵ�
		//-> Garbage Collector
		//-> ������ �ݷ���
		//-> ������ �ݷ��ʹ� JVM�ȿ� ���ԵǾ����� 
	}
}
