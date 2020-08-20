package java14_net;

import java.util.LinkedList;
import java.util.List;

public class test {
	public static void main(String[] args) {
	
		List list = new LinkedList();
		list.add("hi");
		list.add("hi");
		System.out.println(list);
		list.set(1, "50");
		System.out.println(list.size());
		list.get(1);
		System.out.println(list.get(1));
		System.out.println(list);
		System.out.println(list.contains("hi"));;
	}

}
