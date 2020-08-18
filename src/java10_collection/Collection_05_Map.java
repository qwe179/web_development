package java10_collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection_05_Map {
	public static void main(String[] args) {
		
		Map map = new HashMap();
//		Map map = new Hashtable();
		
		//������ ����
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		
		System.out.println("map : " + map);
		System.out.println("\n---get(key)----");
		
		System.out.println(map.get(3));//3=Cherry
		System.out.println("\n---put(key,value)----");
		map.put("D", "Durian"); //D=Durian
		
		System.out.println("map : " + map);
		System.out.println("get(D) : " + map.get("D"));
		
		System.out.println("----------------");
		map.put(2,"Orange"); //������ �����ϴ� Key�� ����
		map.put(4, "Apple"); //Key�� ������ Value�� �����ϴ� ��
		System.out.println("map : " + map);
		System.out.println("\n----contains------");
		System.out.println("Key 5 : " + map.containsKey(5));
		
		//key 5�� �������� ���� ��쿡 ������ �����ϱ�
		if(!map.containsKey(5)) {
			map.put(5,"Grape");
		}
		System.out.println("Value \"Apple\" : "
				+ map.containsValue("Apple"));
		
		//key�� value�� ������ �� ����ؼ� ���� ����� ��!
		
//		if(map.containsValue(555)) {
		if(map.containsKey(555)) {
		String str = (String) map.get(555); //get() Obejct��ȯ�ؼ� (String)����ȯ����
		System.out.println(str.length());///555(����Ű)�����ؼ�;
		
		}
		System.out.println("\n---size()-----");
		System.out.println(map.size());
		System.out.println(map);
		System.out.println("\n---isEmpty()-----");
		System.out.println(map.isEmpty());
		
		System.out.println("\n ---remove()-----");
		map.remove(3); //key�� ã�Ƽ� Entry ����
		System.out.println(map);
		
		//key�� ã�Ƽ� value�� ��ġ�ϸ� Entry ����
		map.remove(2,"Apple");
		System.out.println(map);
		
		System.out.println("\n---null �� ó��------");
		
		map.put(null, "Bob"); //key���� null�� ��Ȳ�� ���� ����
		map.put(10, null);
		System.out.println(map);
		
		map.put(null, null);
		System.out.println(map);
		
		System.out.println("---------------");
		
		//map -> set ��ȯ
		Set entrySet = map.entrySet();//key-value���� Entry�� set����
		Set keySet = map.keySet(); //key�� Set����
		
		System.out.println(entrySet);
		System.out.println(keySet);
		
		System.out.println("\n-----keySet�� �̿��� map �ݺ� ------");
		Set keys = map.keySet();
		
		Iterator iter = keys.iterator();//Key Set�� ���� �ݺ���
		
		////map�� �ݺ��ڰ���� set���� ��ȯ �� iterator ��ȯ ����
		while( iter.hasNext()) {
			Object key = iter.next(); //key ����
			//key�� �̿��� value ��ȯ
			System.out.println(map.get(key));
		}
		
	}
}
