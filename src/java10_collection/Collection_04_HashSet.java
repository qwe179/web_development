package java10_collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection_04_HashSet {
	public static void main(String[] args) {
//		Set set = new HashSet(); //�ؽ��ڵ带 �̿��� �⺻ Set
//		Set set = new LinkedHashSet(); //������ ���� ���� Set
		Set set = new TreeSet(); //���ı�� Set
		//---------------------------------------------------

		
		set.add(50);
		set.add(10);
		set.add(30);
		System.out.println(set);
		System.out.println("--------------");
		
		//��ü ��� - iterator
		
		Iterator iter = set.iterator();//Iterator ����
		while(iter.hasNext()) {
			
			System.out.println(iter.next());
			
		}
		System.out.println("--------------");
		System.out.println("ũ�� : " + set.size());
		System.out.println("����°�? " + set.isEmpty());
		System.out.println("30�� ����? " + set.contains(30));
		System.out.println("30�� ���� " + set.remove(30));
		
		System.out.println(set);
		set.clear(); //��� ��� ����
		System.out.println("����°�? " + set.isEmpty());
		System.out.println(set);
		
	}
}
