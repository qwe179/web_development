package java10_collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection_03_Iterator {
	public static void main(String[] args) {
		
		//Iterator, �ݺ���
		// �÷����� ��� ��ҵ��� ���������� �ݺ��� ��
		// ����ϴ� ����� ǥ��ȭ�� ��
		
		//Arrays.asList()�� �̿��� ����Ʈ ����
		List list = Arrays.asList("a","b","c","d");
		//-----------------------------------------------
		Iterator iter; //�ݺ���
		iter = list.iterator(); //����Ʈ�� iterator ����       iter��     ����Ʈ�� ����Ŵ!!!! 
		//Iterator�� �ֿ� ���(�޼ҵ�)
		//boolean hasNext() : ���� ����� ���翩�� ��ȯ
		// E next() : ���� ����� ������ ��ȯ
		
		while(iter.hasNext()) {
			
			System.out.println(iter.next());
		}
		 
		
		
	}

}
