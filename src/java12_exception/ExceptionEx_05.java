package java12_exception;

class ThrowsTest{
	
	public void method() throws Exception { ///���ܰ� �߻��ϸ� ����ȣ���� ������ ���ѱ�ڴ�
	
			throw new Exception();
	
	}
}


public class ExceptionEx_05 {
	public static void main(String[] args) { //throws Exception ���ο� ���� ����
		
		ThrowsTest tt = new ThrowsTest();
		
		
		try {
			tt.method();//���ܰ� �߻��ϴ� �޼ҵ� ȣ��
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
