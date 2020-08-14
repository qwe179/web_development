package java06_class.manage;

public class StudentEx {
	public static void main(String[] args) {
		
		StudentService ss;
		ss = new StudentService();
		
		ss.insertInfo(); //이름과 나이 입력
		
		ss.insertScore(); //국영수 점수 입력
		
		ss.printStu(); //학생 정보 출력
		
		StudentService ss2 = new StudentService();
		ss2.insertInfo(); //이름과 나이 입력
		
		ss2.insertScore(); //국영수 점수 입력
		
		ss2.printStu(); //학생 정보 출력
	
	}
}



