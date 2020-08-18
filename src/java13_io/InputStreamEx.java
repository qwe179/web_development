package java13_io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {
	public static void main(String[] args) {
		
		InputStream is = System.in; //Ű���� ǥ�� �Է� ��Ʈ��
		byte[] buf = new byte[1024]; //�Է� �������� �ӽ� ����� 1024..
		
		int len = -1; //�Է¹��� �������� ����
		
		StringBuilder sb = new StringBuilder(); //��ü ������ ����
		System.out.println("<<�Է� ����� >>");
		try {
			//�Է� ��Ʈ���� �Է¹��� �����Ͱ� �����ϴ� ���� �ݺ�
			while((len = is.read(buf)) != -1){      //EOF �ȸ����� ��Ʈ��+z�� EOF����
//				System.out.print(new String(buf, 0 , len));
				sb.append(new String(buf,0,len));
			
			}
//			is.read(buf);
//			System.out.println(new String(buf)); //new String �ѹ��� ��� ���ڷιٲ㼭���
//			is.read(buf);
//			System.out.println(new String(buf)); //new String �ѹ��� ��� ���ڷιٲ㼭���
//	
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close(); // ��Ʈ�� �ݱ�
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("<< �Էµ� ������ >>"); 
		System.out.println(sb);
		
		
	}
}
