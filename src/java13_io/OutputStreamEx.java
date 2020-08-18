package java13_io;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		
		OutputStream os = System.out; //ǥ�� ��� ��Ʈ��
		
		byte[] buf = new byte[1024]; //��� ������ ����
		
		int len = 0; //����� �ǹ��ִ� �������� ����
		
		buf[len++] = 'A';
		buf[len++] = 'P';
		buf[len++] = 'P';
		buf[len++] = 'L';
		buf[len++] = 'E';
		buf[len++] = '\n'; //���������־������
	
		
		try {
			os.write(buf,0,len); //���� �迭 ���
			os.flush(); // ���� ����(��� ��ġ���� ��������)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				os.close(); // ��Ʈ�� �ݱ�  // �����ڵ忡 flush�� ���ԵǾ�����
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}  //���θ޼ҵ尡 ���� �� ����½�Ʈ�� �˾Ƽ� ������
}
