package java14_net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class BasicServer {
public static void main(String[] args) {

		ServerSocket servSock = null; //���� ���� ����(���� ��� ����)
		Socket sock = null; //��� ����
		
		PrintWriter out = null; //��½�Ʈ��
		
		try {
			//---------���� ���� ���� Ȱ��ȭ ----------------
			servSock = new ServerSocket(3000); //���� ���� ����
			System.out.println("+ + + ���� ���� ���� ���� + + +");
			
			System.out.println();
			System.out.println("----���� ����� ----");
			System.out.println(" Listen Port : " + servSock.getLocalPort());
			sock = servSock.accept(); //Listen, Ŭ���̾�Ʈ ���� ���
			//------------------------------------------------
			
			//---------BLOCKED ----------
			
			
			//----------������ Ŭ���̾�Ʈ ���� Ȯ�� ------------
			System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�!");
			//Ŭ���̾�Ʈ IP���� ��������
			InetAddress clientIP = sock.getInetAddress();
			System.out.println(">>Ŭ���̾�Ʈ IP : " + clientIP.getHostAddress());
			System.out.println(">>Ŭ���̾�Ʈ Port : " + sock.getPort());
			//--------------------------------------------------
			//------������ ��� ----
			//��ż����� sock��ü�κ��� ����½�Ʈ���� ���ͼ�
			//��ſ� ����Ѵ�
//			sock.getInputStream();
			
			//��½�Ʈ�� ���� (���� -> Ŭ���̾�Ʈ)
			sock.getOutputStream();
			//------------------------------------
			//��ż��� -> OutputStream -> PrintWriter ��ȯ
			out = new PrintWriter(sock.getOutputStream());
			
			out.println("Hello");
			out.flush();
			//------------------------------------
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			out.close();//��� ��Ʈ�� �ݱ� //���ܻ��� ���ο� ó������
			try {
				sock.close(); //��� ���� �ݱ�
				servSock.close();//���� ���� �ݱ�
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}

	

	}
}
