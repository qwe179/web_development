package java04_control.switchEx;

public class Switch_03 {

	public static void main(String[] args) {


		//���� �����͸� switch�� ����� �� ����
//		
//		boolean b = true;
//		
//		
//		switch( b) {
//		
//		case true:
//		case false:
//		}
//		
//		//-------------------------------------------
//		
//		//�Ǽ��� �����͸� switch�� ����� �� ����
//		double d = 3.14;
//	
//		swith(d){
//			
//		}
		//-------------------------------------------
		//switch���� char �� �ٷ��
		
		char alpha = 'B';
		
		switch(alpha) {
		case 'A':
			System.out.println("A�Դϴ�");
			break;
		case 66: //'B'
			System.out.println("B�Դϴ�");
			break;
		case 'C':
			System.out.println("C�Դϴ�");
			break;
		default:
			System.out.println("A,B,C �� �ƴմϴ�");
		}
		
		
	}
}
