package java04_control.switchEx;

public class Switch_01 {

	public static void main(String[] args) {
		
//		//swith��, ���ù�
//		//	switch-case��
//		switch(�񱳴��) {
//		
//		case ��1:
//		case ��2:
//		case ��3:
//			...
//		default:
//		
//			
//		}
		
		
		int num = 50;
		
		switch(num) {  //�ش���ġ�κ��� �������鼭 ��� 

		case 20:
			System.out.println("num�� 20�Դϴ�");
			break;
		
		case 10:
			System.out.println("num�� 10�Դϴ�");
			break;
		
		case 30:
			System.out.println("num�� 30�Դϴ�");
			break;
			
		default:
			System.out.println("num�� 10, 20, 30 �� �ƴմϴ�");

		}
		
		//�񱳴�� Ȱ��� ����  case�� ������ ���� ������
		//�ش� case������ ��ġ���� �ڵ尡 ����ȴ�
		//���� case���������� ����ǹǷ� break�� �ߴܽ����ش�
		
		//case�� ������ ���� ������ default�� ����
		
		//default: �� ���� �����ϴ�
		
		
		
	}
}
