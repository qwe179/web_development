package java04_control.condition;

public class ifElse_04 {

	public static void main(String[] args) {
		
		//if ~ else if ~ else
		
//		if(���ǽ�1) {
//			���ǽ�1�� ���� �� �����ϴ� �ڵ� ����
//			
//			**�߰��� else�� ���������� if�� �ڵ尡 ��������
//			
//		} else if(���ǽ�2) {
//			���ǽ�1�� �����̰�
//			���ǽ�2�� ���� �� �����ϴ� �ڵ� ����
//		} else if(���ǽ�3) {
//			���ǽ�1�� �����̰�
//			���ǽ�2�� �����̰�
//			���ǽ�3�� ���� �� �����ϴ� �ڵ� ����
//			
//		} else {
//			���ǽ�1,2,3 ��� ������ �� �����ϴ� �ڵ� ����
//		}
		
		//** else, else if ������ �ʼ��� �ƴϴ�(��� ��)
		//------------------------------------------------------------
		
		int num = 30;
		
		if( num==10) {
			System.out.println("10�Դϴ�");
			
		} else if (num ==20) {
			System.out.println("20�Դϴ�");
		} else if (num ==30) {
			System.out.println("30�Դϴ�");
		} else {
			System.out.println("10,20,30�� �ƴմϴ�");
			
		}
		
	}
}
