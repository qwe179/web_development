package java12_exception;

import javax.crypto.NullCipher;

public class ExceptionEx_04 {
	public static void main(String[] args) {
		String str = null;
		
		//-----------------------------------------------------
//		if(str == null) { //���ܻ�Ȳ
//			throw new NullPointerException();			
//		}
		//-----------------------------------------------------
		
		NullPointerException e = new NullPointerException(); //���� ��ü ����
		if( str == null) {
			throw e; //���� �߻� ����
		}
		
		//���� ��ü�� ����(new)�Ѵٰ� �ؼ�
		//���ܰ� �߻�(throw) �Ǵ� ���� �ƴϴ�
		
	}
}


class ArrayIndex5Exception extends Exception{
	
}