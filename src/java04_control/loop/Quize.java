package java04_control.loop;
import java.util.Scanner;

public class Quize {

	//���ڿ� �� �Է�
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char ch = sc.nextLine().charAt(0);
		int count =0;
		int len =input.length();
		
		
		for(int i=0; i<len; i++) {
			char tmp = input.charAt(i);
			if(Character.isDigit(tmp)==true) {
				
				System.out.println("���ڰ� �ƴ� �׸��� �����ϴ�");
				break;
				
			}
			
			else if (input.charAt(i)==ch ) {
				count+=1;
				
			} 
		
		}
			
		System.out.println("���Ե� ������" +count +"�� �Դϴ�");

	}

}
