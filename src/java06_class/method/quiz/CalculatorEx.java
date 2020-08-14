package java06_class.method.quiz;

import java.util.Scanner;

public class CalculatorEx {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();

		Scanner sc = new Scanner(System.in);
	
		System.out.print("ù��° ���� �Է� : ");
		int num1=sc.nextInt();
		System.out.println("--------------------");
		System.out.print("������ �Է� : ");
		sc.nextLine();
		char operator=sc.nextLine().charAt(0);	
		System.out.println("--------------------");
		System.out.print("�ι�° ���� �Է� : ");
		int num2=sc.nextInt();
		System.out.println("--------------------");
		
		switch(operator) {
		case '+':
			System.out.println(num1 + "+" + num2 + "=" + cal.sum(num1, num2));
			break;	
		case '-':
			System.out.println(num1 + "-" + num2 + "=" + cal.sub(num1, num2));
			break;
		case '*':
			System.out.println(num1 + "*" + num2 + "=" + cal.mul(num1, num2));
			break;
		case '/':
			System.out.printf(num1 + "/" + num2 + "=" + "%.2f",cal.div(num1, num2));
			break;
		
		}
	}
}
