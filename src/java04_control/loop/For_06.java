package java04_control.loop;

public class For_06 {
	public static void main(String[] args) {
		
		//������ 2���� ����ϱ�
		
		//��� ����)
		//2 x 1 = 2
		
		//2 x 2 = 4
		//....... 2 x 9 = 18

		//�ݺ�Ƚ�� : x9
		//�ݺ����� : 1~9
		
		//�ʱ�� : int i = 1;
		//���ǽ� : i <= 9;
		//������ : i++; (1�� ����)
		
		int N = 1;
		
		for(int j=0; j<8; j++) {
			N++;
			for(int i=1; i<10; i++) {		
			
				System.out.println(N + " x "+ i + " = " + N*i);
			}
		}

		
	}
}
