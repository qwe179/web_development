package java08_abstract;

abstract class Person{//부모클래스
	protected String name; //이름
	
	
	public Person(String name) {
		this.name =name;
	}
	//추상 메소드
	public abstract void display();
}


class Professor extends Person{//자식클래스
	private String major;//전공
	
	public Professor(String name, String major) {
		super(name);
		this.major = major;
		
	}
	@Override
	public void display() {
		System.out.println("[교수]"+name+","+major+"전공");
	}
}
class Student extends Person{//자식클래스
	private String subject;//수강과목
	
	public Student(String name, String major) {
		super(name);
		this.subject = major;
		
	}
	
	@Override
	public void display() {
		System.out.println("[학생]"+name+","+subject+"수강과목");
		
	}
}


public class AbstractEx {
	public static void main(String[] args) {
		
		Student s = new Student("Alice", "자바");
		Professor p = new Professor("Bob", "컴퓨터공학");
		s.display();
		p.display();
		
		System.out.println("------------");
		
		Person p1 = new Student("Clare", "자료구조");
		Person p2 = new Professor("Dave", "컴퓨터과학");
		p1.display();
		p2.display();
		System.out.println("------------");
		
		Person[] arr=null; //Person 배열 선언
		arr = new Person[3];//Person 배열 생성, Person 객체 생성 안됨
		
		arr[0] = new Professor("Apple", "Banana");
		arr[1] = new Student("Cherry", "Durian");
		
		for(int i=0;i<arr.length && arr[i]!=null;i++) {
				arr[i].display();
			
		}
		System.out.println("------------");
		arr[2] = new Student("E","Fruit");
		
		//foreach 구문
		
//		for([자료형] [변수] : [배열변수]) {
//			//반복코드
//			
//			//배열의 요소들을 인덱스 순서대로
//			//하나씩 변수에 대입하면서 반복한다
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
