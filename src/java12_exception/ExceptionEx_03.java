package java12_exception;

public class ExceptionEx_03 {
	public static void main(String[] args) {
		
		try {
			//try 블록
			
			//예외 발생이 예측되는 코드
			
		}catch (NullPointerException e) { 
			//NullPointerException 처리 코드
			
		}catch (ArrayIndexOutOfBoundsException e) {
			//ArrayIndexOutOfBoundsException 처리 코드
		}catch (Exception e) { ///예외사항 예외처리하는건데 무슨에러인지 모르면 안됨.. Exception안쓰는게 좋음
			//catch 블록
			
			//NullPointerException과
			//ArrayIndexOutOfBoundsException 둘을 제외한 예외 처리
			
			//!!Exception(부모)은 제일 하단... 순서대로 처리
		} finally {
			//사용하지 않아도 괜찮은 finally 블록
			
			//try블록에서 예외가 발생해도, 발생하지 않아도
			//finally 블록은 반드시 실행된다
			
		}
		
		//--------------------------------------------------
		
		//multi catch 구문
		try {
			
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) { ////   |로 exception 여러개처리
			// NullPointerException과
			// ArrayIndexOutOfBoundsException을 동시에 처리하기
		} catch (Exception e) {	
			// 남은 예외 처리하기	
		}
		
		
	}
}
