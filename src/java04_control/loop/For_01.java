package java04_control.loop;
import java.util.Scanner;

public class For_01 {
	public static void main(String[] args) {
		
		//�ݺ���, Loop
		//for��, while��, do-while��
		
		//for��, for Loop
		
//		for(�ʱ�� ;���ǽ� ;������ ) {
//			// ���ǽ��� true ��� �����ϴ� �ڵ�
//			// �ݺ������� �����Ѵ�
//		}
		
		int i;
		for( i=0; i<5; i++) {
		
			System.out.println("HI : " + i);
		}
		//�ʱ�� : i=0
		//���ǽ� : i<5
		//������ : i++
		
		//for�� �д� ���
		// i ������ 0���� �����ؼ� 5���� ���� ���ȿ� 1�� �����ϸ鼭 �ݺ��Ѵ�
		
		//for���� ���� ����
		//	1.�ʱ�� ����
		//	2.���ǽ� �Ǻ�
		//		2-1.true�� ��,
		//		2-2.false�� ��, for�� ����
		//	3.�ݺ��ڵ� 1ȸ ����
		//  4.������ ����
		//  5.2�� ����

		
		int k=1;
        int j;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(j=0;j <9; j++){
           
            
            
            System.out.println(N+" * "+k + "= "+ (N*k));
            k++;
        }
        
        
        
	}
	
}
