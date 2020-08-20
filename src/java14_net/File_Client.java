package java14_net.quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class File_Client {
	public static void main(String[] args) {
	
		Socket sock = null; //Ŭ���̾�Ʈ ���� ��ü
		
		OutputStream out = null; //���� ��� ��Ʈ�� ��ü
		
		FileInputStream in = null; //�Է� ��Ʈ�� ��ü
		
		// �Է� ��� ����
		File file = new File("./src/java14_net/quiz", "data.txt");
		
		try {
			System.out.println("+ + + Ŭ���̾�Ʈ ���� + + +");
			
			// ���� ��û
			sock = new Socket("localhost", 5000);

			// ��� ��Ʈ�� ����
			out = sock.getOutputStream();

			// �Է� ��Ʈ�� ����
			in = new FileInputStream(file);
			
			// ----- ������ ��� -----
			int len = -1;
			byte[] buf = new byte[1024];
			
			while( (len = in.read(buf)) != -1 ) {
				String str = new String(buf, 0, len);
				out.write(str.getBytes());
			}
		
			System.out.println("+ + + ��� �Ϸ� + + +");
			// --------------------
			
		} catch (UnknownHostException e) {
			System.out.println("[ERROR] �� �� ���� ȣ��Ʈ�Դϴ�");
		} catch (IOException e) {
			System.out.println("[ERROR] ���� ���� ����, ������ ����� �� �����ϴ�");
		} finally {
			try {
				if(out!=null)	out.close();
				if(in!=null)	in.close();
				if(sock!=null)	sock.close();
			} catch (IOException e) {
				System.out.println("[ERROR] �ڿ� ���� ����");
			}
		}		

	}
}
