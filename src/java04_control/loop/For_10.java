package java04_control.loop;

public class For_10 {

	public static void main(String[] args) {
		
		

		for(int i=2; i<10; i++) { //2~9단
			
			System.out.println(i+"단\n");
			for(int j =1; j<10; j++) { //1~9
				
				System.out.println(i + " X " + j + " = " + j*i);
			}
			
			System.out.println("-------------------");
			
			//9단까지 반복
			
			
		}

	}
}
