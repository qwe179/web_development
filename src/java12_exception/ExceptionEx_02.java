package java12_exception;

public class ExceptionEx_02 {
	public static void main(String[] args) {
		int[]arr = new int[5];
		
		int i=0;
		
		try {//try-catch
		
			while(true) {     
				
				arr[i] = i+1; //�迭�� �� ����
				System.out.println(arr[i]);
				
				i++;
				
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("[EXCEPTION] �ε��� ���!");
			
			//���� ��Ȳ ��� �޼ҵ�
			e.printStackTrace(); //�޼ҵ� ȣ�� ����. �޼ҵ尡 ��� ȣ��ǰ� �����޼ҵ�� ����.. ������Ȳ�� ����ؼ� �����־��
			
		}
		
		System.out.println("+ + + ���α׷� ���� ���� + + +");
		
		
		
	}
}
