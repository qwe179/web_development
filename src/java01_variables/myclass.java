package java01_variables;
import java.util.Scanner;


class Car{
	
	private int a=100;
	private int b=200;
	public int c=300;
	void CarMethod(){
		int d =a +10;
		System.out.println("��");
		
		System.out.println(a+b);
		System.out.println(d);
		
	}
	
	
	
	
}



public class myclass {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			String message;
			message = scan.nextLine();
			System.out.println(message);
			Car myCar = new Car();
			myCar.CarMethod();
			
			System.out.println("Car Ŭ���� ���� c :"+myCar.c);
			
		}
}
