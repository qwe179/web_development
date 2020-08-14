package java04_control.loop;
import java.util.Scanner;

public class Quize {

	//문자열 값 입력
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char ch = sc.nextLine().charAt(0);
		int count =0;
		int len =input.length();
		
		
		for(int i=0; i<len; i++) {
			char tmp = input.charAt(i);
			if(Character.isDigit(tmp)==true) {
				
				System.out.println("문자가 아닌 항목이 들어갔습니다");
				break;
				
			}
			
			else if (input.charAt(i)==ch ) {
				count+=1;
				
			} 
		
		}
			
		System.out.println("포함된 갯수는" +count +"개 입니다");

	}

}
