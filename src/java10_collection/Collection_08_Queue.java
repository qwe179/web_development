package java10_collection;

import java.util.LinkedList;
import java.util.Queue;

public class Collection_08_Queue {
	public static void main(String[] args) {
		Queue queue = new LinkedList();
		
		//Enqueue, ��ť - ť�� ������ ����ֱ�
		
		queue.offer("Apple");
		queue.offer("Banana");
		queue.offer("Cherry");
		
		System.out.println(queue);
		System.out.println("-----------");
		
		//Dequeue, ��ũ - ť���� ������ ������
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println(queue);
		
		
	}
}
