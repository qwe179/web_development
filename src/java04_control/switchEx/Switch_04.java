package java04_control.switchEx;

public class Switch_04 {

	public static void main(String[] args) {
		int num = 20;
		
		if(num==0) {
			
		} else if(num ==10) {
			System.out.println("num�� 10");
		} else if(num==20) {
			System.out.println("num�� 20");
		} else if(num==30) {
			System.out.println("num�� 30");
		} else {
			System.out.println("num�� 10,20,30 �� �ƴ�");
		}
		System.out.println("----------------------------");
		
		
		switch(num) {
		case 10:
			System.out.println("num�� 10");
			break;
		case 20:
			System.out.println("num�� 20");
			break;	
		case 30:
			System.out.println("num�� 30");
			break;
		default:
			System.out.println("num�� 10,20,30 �� �ƴ�");
		}
		
		System.out.println("------------------------------------");
		
		
		int score = 88;
		if(score>=90) {
			System.out.println("A���");
		} else if(score>=80) {
			System.out.println("B���");
		}
		System.out.println("-----------");
		
		//switch�� �����񱳸� �� �� ���� - > if ���� �ȴ�
		
	//	switch(score) {
	//	
	//	case >=90:
	//	case >=80:
	//	}
		
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("A");
		case 8:
			System.out.println("B");
		}

	}
}
