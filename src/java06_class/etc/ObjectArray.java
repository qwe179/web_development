package java06_class.etc;

class Student { 
	private String name;
	private int num;
	
	//����Ʈ ������
	public Student() { }
	
	//�Ű����� �ִ� ������
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
		Student[] stuArr; //Student Ÿ�� �迭 ����
		stuArr = new Student[3]; //Student Ÿ�� �迭 ����  //�̰��� �迭��ü�� �����!!!!!!!!�ε����ϳ��ϳ�Ÿ���� student�� ��ü��������
		//�迭�� �̿��� ��ü ����
		//�ʱ�ȭ ���� ��� �Ȱ��� ����� �� �ִ�
		
//		for(int i=0; i<stuArr.length;i++) {
//			stuArr[i] = new Student(); //������ ȣ��  //�����������ϱ⶧���� null����
//		}
		
		
		//������ ��ü�� ���� ����
			stuArr[0] = new Student("Bob",30); /////stuArr[i] ������ StudentŸ�� !!!!!!!!�ѹ����������
			stuArr[1] = new Student("Clare",40);
			stuArr[2] = new Student("Dave",50);
		
		
		
		
		
		
		stuArr[0].setName("Bob");
	}

}
