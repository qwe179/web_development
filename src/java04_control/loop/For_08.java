package java04_control.loop;

public class For_08 {

	
	public static void main(String[] args) {
		//��� ��ø ��Ű��
		
		//if��ø
		
		int num = 11;
		
		if(num>=1) {
			System.out.println("1���� ũ�ų� ����");
			if(num<=100) {
				System.out.println("1���� ũ�ų� ����");
				System.out.println("100���� �۰ų� ����");
				
				System.out.println("1~100 ������ ����");
			}
			
			System.out.println("1���� ũ�ų� ����");
			
		}
		//-------------------------------------------------------------------------------
		
		//for���� if�� ��ø
		for(int i=0; i<10; i++) { //i,0~9, 10��
			
			if(i%2==0) { //¦���� ��
				System.out.println("¦�� : " + i);
			}

			
		}
		
		for(int i = 0; i<10;i+=2) {
			System.out.println("¦�� : " + i);
			
		}
		
	}
}
