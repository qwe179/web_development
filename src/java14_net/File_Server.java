package java14_net.quiz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class File_Server {
	public static void main(String[] args) {
		
		ServerSocket servSock = null; // ���� ���� ����
		Socket sock = null; // ���� ��� ����
		
		InputStream in = null; // ���� �Է� ��Ʈ��
		
		FileOutputStream out = null; // ��� ��Ʈ��

		// ��� ��� ����
		File file = new File("./src/java14_net/quiz", "receive.txt");
		
		try {
			servSock = new ServerSocket(5000);
			System.out.println("+ + + ���� ���� ���� + + +");
			
			// ���� �� ��� �ݺ�
			while(true) {
				try {
					System.out.println("----- ���� ����� -----");
					System.out.println("Linsten Port : "
							+ servSock.getLocalPort() );
					System.out.println("--------------------");
					sock = servSock.accept(); // Listen
					
					// ----- BLOCK -----
					
					System.out.println("Ŭ���̾�Ʈ ����!!");
					// Remote ���� Ȯ��
					InetAddress ip = sock.getInetAddress();
					System.out.println("\t>>Ŭ���̾�Ʈ IP : "
							+ ip.getHostAddress()); //IP
					System.out.println("\t>>Ŭ���̾�Ʈ Port : "
							+ sock.getPort() ); //Port
							
					// �Է� ��Ʈ�� ����
					in = sock.getInputStream();
					
					// ��� ��Ʈ�� ����
					out = new FileOutputStream(file);

					// ----- ������ ��� -----
					int len = -1;
					byte[] buf = new byte[1024];
					
					while( (len = in.read(buf)) != -1 ) {
						String msg = new String(buf, 0, len);
						System.out.println(" �����޽���>> " + msg);
						out.write(msg.getBytes());
					}
					// --------------------
		
					System.out.println("+ + + Ŭ���̾�Ʈ ���� ���� + + +");
					
				} catch (IOException e) {
					System.out.println("+ + + Ŭ���̾�Ʈ ���� ���� + + +");
				} finally {
					try {
						if(in!=null)	in.close();
						if(out!=null)	out.close();
						if(sock!=null)	sock.close();
					} catch (IOException e) {
						System.out.println("[ERROR] �ڿ����� ����");
					}
				} // try end - Ŭ���̾�Ʈ ���� �� ���
				
			}	// while end - ���� ���� �ݺ�
			
		} catch (IOException e) {
			System.out.println("[ERROR] ���� ���� ����");
		} finally {
			try {
				if(servSock!=null)	servSock.close();
			} catch (IOException e) {
				System.out.println("[ERROR] �ڿ����� ����");
			}
		}
		
	}	
}
