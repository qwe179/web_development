package java04_control.switchEx;

public class star {
	public static void main(String[] args) {
		
//		//Q1
//		
//		for(int i =0; i<5;i++) {
//			System.out.print("*");
//
//		}
//		//Q2
//		System.out.println();
//		System.out.println("=========");
//		for(int i =0; i<5;i++) {
//			System.out.println("*");
//		}
//		System.out.println("=========");
//		//Q3
//		for(int i =0; i<5;i++) {
//			for(int j =0; j<5; j++) {
//			
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println("=========");
//		//Q4
//		for(int i =0; i<5; i++) {
//			for(int j =0; j<5; j++) {
//				
//				
//				System.out.print(i+1);
//			}
//			System.out.println();
//			
//		}
//		System.out.println("=========");
//		//Q5
//		for(int i=1;i<6;i++) {
//			for(int j=1;j<6;j++) {
//				System.out.print(j);
//
//			}
//			System.out.println();
//		}
//		System.out.println("=========");
//		//Q6
//		int num =0;
//		for(int i=1;i<6;i++) {
//			for(int j=1;j<6;j++) {
//				
//				System.out.print(j+num);
//			}
//			System.out.println();
//			num++;
//		}
//		System.out.println("=========");
//		//Q7
//		int num2 =0;
//		for(int i=1;i<6;i++) {
//			for(int j=5;j<10;j++) {
//				
//				System.out.print(j -num2);
//			}
//			System.out.println();
//			num2++;
//		}
//		System.out.println("=========");
//		
//		//Q8
//		
//		char star = '*';
//		int k = 1;
//		for(int i=0; i<5; i++) {
//			
//			for (int j=0;j<k;j++) {
//				System.out.print(star);	
//			}
//			System.out.println();
//			k++;
//		}
//		System.out.println("=========");
//
//		//Q9
//		char star2 = '*';
//		int k2 = 5;
//		for(int i=0; i<5; i++) {
//			
//			for (int j=0;j<k2;j++) {
//				System.out.print(star);	
//			}
//			System.out.println();
//			k2--;
//		}
//		
//		System.out.println("=========");
//		//Q10
		
		


		int k3 = 5;
		int l = 0;
		for(int i=0; i<5; i++) {
			
			
			for(int m=0; m<l; m++) {
				
				System.out.print(" ");
			}
			
			for (int j=0;j<k3;j++) {
				System.out.print("*");
				
			}
			System.out.println();
			k3--;
			l++;
		}
		
		System.out.println("=========");
		//Q11
		


		int k4 = 1;
		int l2 = 4;
		for(int i=0; i<5; i++) {
			
			
			for(int m=0; m<l2; m++) {
				
				System.out.print(" ");
			}
			
			for (int j=0;j<k4;j++) {
				System.out.print("*");
				
			}
			System.out.println();
			k4++;
			l2--;
		}
			
		System.out.println("===12======");
		//Q12
		int h = 1;
		int flag=0;
		for(int i =0; i<10; i++) {
	
			
			for(int j =0; j<h; j++) {
				System.out.print("*");	
			}
			System.out.println();
			h++;
			if(h>=6) {
				
				flag=1;
				h-=2;
				
			}else if(flag==1) {
				h-=2;
			
			}
			
		}
	
		System.out.println("=========");
		//Q13
		int h2 = 5;
		int flag2=0;
		for(int i =0; i<9; i++) {
	
			
			for(int j =0; j<h2; j++) {
				System.out.print("*");	
			}
			System.out.println();
			h2--;
			if(h2<1) {
				
				flag2=1;
				h2+=2;
				
			}else if(flag2==1) {
				h2+=2;
			}
			
		}

	}
	
	
	
}
