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
		
		//�̸��� ���� �Է�		
		public void insertInfo() {
			System.out.print("�̸��� �Է��ϼ��� : ");
			stu.setName(input.nextLine());
			System.out.print("���̸� �Է��ϼ��� : ");
			stu.setAge(input.nextInt());
		}
		
		//������ ���� �Է�
		public void insertScore() {
			System.out.print("���������� �Է��ϼ��� : ");
			stu.setKor(input.nextInt());
			System.out.print("���������� �Է��ϼ��� : ");
			stu.setEng(input.nextInt());
			System.out.print("���������� �Է��ϼ��� : ");
			stu.setMath(input.nextInt());
			calcSum(); //���� ���  //��Ȯ�ϰ� this.�� �ٿ��� ����ص� ��
			calcAvg(); //��� ���
		}
		
		//����
		private void calcSum() {
			stu.setSum(stu.getKor()+stu.getMath()+stu.getEng()); 
			
		}
		
		//���
		private void calcAvg() {
			stu.setAvg(stu.getSum()/(double)3);
		}
		
		//�л� ���� ���
		public void printStu() {
			System.out.println("=====================�л�����=======================");
			System.out.println("�̸�\t����\t����\t����\t����\t����\t���");
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
