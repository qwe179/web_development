package java04_control.loop;

public class BreakContinue {

	
	public static void main(String[] args) {
		//break;
		
		//����� �ߴܽ�Ű�� ������ �����ϴ� �ڵ�
		//if���� �ߴܽ�Ű�� �ʴ´�
		// -> for, while, do-while, switch�� �ߴܽ�Ŵ
		//����� ��ø�Ǿ����� ��� ���� ����� ������ {} ����� ����
		// ��� �� ���� �ߴܽ�Ų��.
		
		
		//--------------------------------------------
		for( int i =0; i<100; i++) { //i, 0~99,100��
			System.out.println(i);
			if( i>=5) {
				
				break; //�ߴ��ڵ�
				
			}
			
		}
		
		
		
		//continue;
		//�ݺ������� ���Ǵ� ��Ÿ ���
		//���� �ݺ����� �ѱ��
		// for�������� continue�� ����Ǹ� ��� ���������� �Ѿ��.
		//while�������� continue�� ����Ǹ� ���ǹ����� �Ѿ��.
		
		for(int i=0; i<10; i++) {//i, 0~9, 10��
			if(i%2==0) { //¦��
				continue; //���� �ݺ����� �ѱ��
			}
			System.out.println(i);
			
		}
	}
}
