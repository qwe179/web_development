package java06_class.etc;

class Student { 
	private String name;
	private int num;
	
	//디폴트 생성자
	public Student() { }
	
	//매개변수 있는 생성자
	public Student(String name, int num) {
		this.name = name;
		this.num = num;
	}
	//Getters And Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}



public class ObjectArray {
	public static void main(String[] args) {
		Student stu = new Student("Alice",50);
		
		//-----------------------------------------------------------------------
		Student[] stuArr; //Student 타입 배열 선언
		stuArr = new Student[3]; //Student 타입 배열 생성  //이것은 배열객체를 만드는!!!!!!!!인덱스하나하나타입이 student인 객체변수공간
		//배열을 이용한 객체 생성
		//초기화 값이 모두 똑같이 적용될 수 있다
		
//		for(int i=0; i<stuArr.length;i++) {
//			stuArr[i] = new Student(); //생성자 호출  //참조를참조하기때문에 null값됨
//		}
		
		
		//각각의 객체를 따로 생성
			stuArr[0] = new Student("Bob",30); /////stuArr[i] 각각은 Student타입 !!!!!!!!한번더해줘야해
			stuArr[1] = new Student("Clare",40);
			stuArr[2] = new Student("Dave",50);
		
		
		
		
		
		
		stuArr[0].setName("Bob");
	}

}
