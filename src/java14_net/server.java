package java14_net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
public static void main(String[] args) {

		ServerSocket servSock = null; //���� ���� ����(���� ��� ����)
		Socket sock = null; //��� ����
		BufferedReader in = null;
		PrintWriter out = null; //��½�Ʈ��
		
		try {
				//---------���� ���� ���� Ȱ��ȭ ----------------
				servSock = new ServerSocket(3000); //���� ���� ����
				System.out.println("+ + + ���� ���� ���� ���� + + +");
				
				System.out.println();
				System.out.println("----���� ����� ----");
				System.out.println(" Listen Port : " + servSock.getLocalPort());
				sock = servSock.accept(); //Listen, Ŭ���̾�Ʈ ���� ���
		
				//----------������ Ŭ���̾�Ʈ ���� Ȯ�� ------------
				System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�!");
				//Ŭ���̾�Ʈ IP���� ��������
				InetAddress clientIP = sock.getInetAddress();
				System.out.println(">>Ŭ���̾�Ʈ IP : " + clientIP.getHostAddress());
				System.out.println(">>Ŭ���̾�Ʈ Port : " + sock.getPort());
				//--------------------------------------------------
				sock.getInputStream();
				while(true) {
					in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
					String msg =in.readLine();
					System.out.println(">> ���� ������ : " + msg);
					if(msg.equals("exit")) {
						break;
				}
			}
			//------------------------------------
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//��� ��Ʈ�� �ݱ� //���ܻ��� ���ο� ó������
			try {
				in.close();
				sock.close(); //��� ���� �ݱ�
				servSock.close();//���� ���� �ݱ�
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}

	

	}
}
