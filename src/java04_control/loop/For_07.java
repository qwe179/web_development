package java04_control.loop;


public class For_07 {
	public static void main(String[] args) {
		
		//ù���� 10���� �����ϰ�,
		int money = 10; //���� : money 
		int account=0; //����� : account
		
		//�ݺ� : 14��
		
		//�ݺ� �ѹ��� �����ؾ��� �۾�(�ڵ�)
		//���� �ؾ��ϴ� ��
		//	a. ���ݾ� �ι�� �ø���
		//	b. �� �ݾ׿� ���ݾ��� ���ϱ�
		for(int i=0; i<15; i++) { //i, 0~14, 15��(15�ϵ���)
			//������2�踦���� (���ݾ�)
			account+=money; //���ݾ��� �� �ݾ׿� ���ϱ�
			money*=2; //���ݾ� 2��� ������Ű��
		}
		System.out.println("������ �� �ݾ� : " + account + "��");
		
		
		
		//���������� ������ 2�踦 �����ϴ� �������
		//����(15��) ���� ������ �ݾ���?

		
	}
}
