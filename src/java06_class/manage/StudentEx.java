package java06_class.manage;

public class StudentEx {
	public static void main(String[] args) {
		
		StudentService ss;
		ss = new StudentService();
		
		ss.insertInfo(); //�̸��� ���� �Է�
		
		ss.insertScore(); //������ ���� �Է�
		
		ss.printStu(); //�л� ���� ���
		
		StudentService ss2 = new StudentService();
		ss2.insertInfo(); //�̸��� ���� �Է�
		
		ss2.insertScore(); //������ ���� �Է�
		
		ss2.printStu(); //�л� ���� ���
	
	}
}



