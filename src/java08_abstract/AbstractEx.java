package java08_abstract;

abstract class Person{//�θ�Ŭ����
	protected String name; //�̸�
	
	
	public Person(String name) {
		this.name =name;
	}
	//�߻� �޼ҵ�
	public abstract void display();
}


class Professor extends Person{//�ڽ�Ŭ����
	private String major;//����
	
	public Professor(String name, String major) {
		super(name);
		this.major = major;
		
	}
	@Override
	public void display() {
		System.out.println("[����]"+name+","+major+"����");
	}
}
class Student extends Person{//�ڽ�Ŭ����
	private String subject;//��������
	
	public Student(String name, String major) {
		super(name);
		this.subject = major;
		
	}
	
	@Override
	public void display() {
		System.out.println("[�л�]"+name+","+subject+"��������");
		
	}
}


public class AbstractEx {
	public static void main(String[] args) {
		
		Student s = new Student("Alice", "�ڹ�");
		Professor p = new Professor("Bob", "��ǻ�Ͱ���");
		s.display();
		p.display();
		
		System.out.println("------------");
		
		Person p1 = new Student("Clare", "�ڷᱸ��");
		Person p2 = new Professor("Dave", "��ǻ�Ͱ���");
		p1.display();
		p2.display();
		System.out.println("------------");
		
		Person[] arr=null; //Person �迭 ����
		arr = new Person[3];//Person �迭 ����, Person ��ü ���� �ȵ�
		
		arr[0] = new Professor("Apple", "Banana");
		arr[1] = new Student("Cherry", "Durian");
		
		for(int i=0;i<arr.length && arr[i]!=null;i++) {
				arr[i].display();
			
		}
		System.out.println("------------");
		arr[2] = new Student("E","Fruit");
		
		//foreach ����
		
//		for([�ڷ���] [����] : [�迭����]) {
//			//�ݺ��ڵ�
//			
//			//�迭�� ��ҵ��� �ε��� �������
//			//�ϳ��� ������ �����ϸ鼭 �ݺ��Ѵ�
//		}
		for(Person data : arr) {
			data.display();
		}
		System.out.println("-----------");
		
		int[] intArr = {1,2,3,4,5,6,7,8,9,22,33,44,55,66,77};
		for(int n : intArr) {
			System.out.println(n);
			
		}
		
	}
}
