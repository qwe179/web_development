package java12_exception;

class ThrowsTest{
	
	public void method() throws Exception { ///예외가 발생하면 내가호출한 얘한테 떠넘기겠다
	
			throw new Exception();
	
	}
}


public class ExceptionEx_05 {
	public static void main(String[] args) { //throws Exception 메인에 하지 말기
		
		ThrowsTest tt = new ThrowsTest();
		
		
		try {
			tt.method();//예외가 발생하는 메소드 호출
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
