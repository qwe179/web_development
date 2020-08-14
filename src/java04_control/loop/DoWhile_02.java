package java04_control.loop;

import java.util.Scanner;

public class DoWhile_02 {
public static void main(String[] args) {
	

	Scanner sc =new Scanner(System.in);
	
	int intput3;
	intput3 = sc.nextInt();
	
	do {
		System.out.println("Input Number : ");
		intput3 = sc.nextInt();
		
		System.out.println("입력한 값 : " + intput3);
		System.out.println();
	} while(intput3 !=99);
		
		
		
}
		
	
}
