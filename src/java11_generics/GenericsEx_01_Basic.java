package java11_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx_01_Basic {
	public static void main(String[] args) {
	
		List list = new ArrayList();
		
		list.add(123);
		list.add(3.14);
		list.add("Hello");
		
		//Ÿ���Ķ���͸� ������� ������ Object�� �����ȴ� //�ڵ����� wrapper�Ǽ�����
		
		//--------------------------------------------------
		List<String> list2 = new ArrayList<String>(); //List�� ArrayList�� ���׸��� ���� Ÿ������ ä�������
		
		//list2.add(123);//����
		list2.add("Apple");
		//--------------------------------------------------
		
		//�⺻ ������Ÿ������ ���� �Ұ� ->Wrapper Ŭ���� �̿��Ѵ�
//		List<int> list3 = new ArrayList<int>();
		List<Integer> list3 = new ArrayList<Integer>();  //wrapper�����
		list3.add(111111);
		
		//------------------------------------------------
		
		//��ü ������ �� Ÿ���Ķ���ʹ� ���� ���� -> JDK 1.7���� ����
		List<String> list4 = new ArrayList<>(); 
		
		//--------------------------------------------------------------------
		
		List<String> list5 = new ArrayList<String>();
		
		//list5.add(true); //Ÿ�Թ̽���ġ�� ���������� �����ش�
		list5.add("�ȳ�");

		
		//���� : Ÿ�� �������� �����Ѵ�
		
		List list6 = new ArrayList();
		list6.add("�ȳ�");
		list6.add(123);
		list6.add(true);
		
		String str1 = (String) list6.get(0); //���ʿ��� ����ȯ�� ������Ѵ�
		String str2 = list5.get(0);

	}
}
