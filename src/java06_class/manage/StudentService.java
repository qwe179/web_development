package java06_class.manage;
import java.util.Scanner;

import java06_class.manage.Student;
public class StudentService {

		private Student stu;
		private Scanner input;
		
		public StudentService() {
			stu = new Student();
			input = new Scanner(System.in);
		}
		
		//이름과 나이 입력		
		public void insertInfo() {
			System.out.print("이름을 입력하세요 : ");
			stu.setName(input.nextLine());
			System.out.print("나이를 입력하세요 : ");
			stu.setAge(input.nextInt());
		}
		
		//국영수 점수 입력
		public void insertScore() {
			System.out.print("국어점수를 입력하세요 : ");
			stu.setKor(input.nextInt());
			System.out.print("영어점수를 입력하세요 : ");
			stu.setEng(input.nextInt());
			System.out.print("수학점수를 입력하세요 : ");
			stu.setMath(input.nextInt());
			calcSum(); //총점 계산  //명확하게 this.을 붙여서 사용해도 됨
			calcAvg(); //평균 계산
		}
		
		//총합
		private void calcSum() {
			stu.setSum(stu.getKor()+stu.getMath()+stu.getEng()); 
			
		}
		
		//평균
		private void calcAvg() {
			stu.setAvg(stu.getSum()/(double)3);
		}
		
		//학생 정보 출력
		public void printStu() {
			System.out.println("=====================학생정보=======================");
			System.out.println("이름\t나이\t국어\t영어\t수학\t총점\t평균");
			System.out.print(stu.getName() + "\t");
			System.out.print(stu.getAge() + "\t");
			System.out.print(stu.getKor() + "\t");
			System.out.print(stu.getEng() + "\t");
			System.out.print(stu.getMath() + "\t");
			System.out.print(stu.getSum() + "\t");
			System.out.printf("%.2f\n",stu.getAvg());
			System.out.println();
			System.out.println("====================================================");
			

		}
		
	
}
