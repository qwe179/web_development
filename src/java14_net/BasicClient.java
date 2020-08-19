package java14_net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class BasicClient {
	public static void main(String[] args) {
		String serverIp = "127.0.0.1";
		int port = 3000;
		
		Socket sock = null; //Ŭ���̾�Ʈ ����(����, ���)
		
		BufferedReader in = null; //���� �Է� ��Ʈ�� , �����Է½�Ʈ������ ���ȭ�Ⱦ�
		
		try {
			System.out.println("+ + + Ŭ���̾�Ʈ ���� + + +");
			sock = new Socket(serverIp, 3000); //���� ����
			
			//------������ ��� ----
			//��ż����� sock��ü�κ��� ����½�Ʈ���� ���ͼ�
			//��ſ� ����Ѵ�
//			sock.getOutputStream();
			//�Է� ��Ʈ�� ����(���� - > Ŭ���̾�Ʈ)
			
			sock.getInputStream();
			
			in = new BufferedReader(new InputStreamReader(sock.getInputStream())); 
			//InputStreamReader : ���ڽ�Ʈ�� -> ����Ʈ��Ʈ�� �ٲ��ִ¾�
			
			String msg =in.readLine();
			System.out.println(">> ���� ������ : " + msg);
			//-------------------------------------
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close(); //��Ʈ�� �ݱ�
				sock.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //���� �ݱ�
			
		}
		
	}
}
