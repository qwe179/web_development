package java04_control.condition;

public class IfElse_03 {

	public static void main(String[] args) {
		int num = 1000;
		if(num>0 && num<=100) {
			//num�� 1~100 ������ ����
		}
		
		if(num>0) { //���,positive
			System.out.println("0���� ũ��");
			
			if(num<=100) {
				System.out.println("100���� �۰ų� ����");
				
			}
			//-----------------------------------------------------
			
			
			
			
		} else {// !(num>0), num<0, //����� �ƴ� ����
			//�����ų�, 0�μ���
			System.out.println("0���� ũ�� �ʴ�");
			
			if(num==0) {
				System.out.println("0�Դϴ�");
			} else {
				System.out.println("�����Դϴ�");
			}
		}

			
//			if(num<0) {
//				System.out.println("�����Դϴ�");
//			}
//		}
		
		
	}
}
