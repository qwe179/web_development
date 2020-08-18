package java09_api;

public class StringBuilderEx {
	
	public static void info(StringBuilder s) {//�������� �������ߵ�
		System.out.println("Length : " + s.length());//����
		System.out.println("capacity : " + s.capacity()); //�뷮
	}
	
	public static void main(String[] args) {
		System.out.println("---StringBuilder ���� ---");
		StringBuilder sb = new StringBuilder();

		info(sb);
		System.out.println("---Apple �߰� -----");
		sb.append("Apple");
		System.out.println(sb);
		info(sb);
		
		System.out.println("---Banana �߰� -----");
		sb.append("BananaBanana");
		System.out.println(sb);
		info(sb);
		
		System.out.println("---Orange insert -----");
		sb.insert(5,"Orange"); //5��° �ε����� �����ֱ�(����)
		sb.deleteCharAt(3);//3��° �ε��� ���� ����
		System.out.println(sb);
		System.out.println("----trimtoSize-----"); //length��ŭ capacity�� ���δ�
		sb.trimToSize(); //capa ���߱� �������Ҷ� ���
		info(sb);
		
		//���빰�� ������ �����´�
		System.out.println("--reverse---");
		sb.reverse();
		System.out.println(sb);
		
	}

}
