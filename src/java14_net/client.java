package java14_net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
//192.168.10.3
public class client {
	public static void main(String[] args) {
		String serverIp = "127.0.0.1";
		int port = 3000;
		
		Socket sock = null; //Ŭ���̾�Ʈ ����(����, ���)
		PrintWriter out = null;
		BufferedReader in = null; //���� �Է� ��Ʈ�� , �����Է½�Ʈ������ ���ȭ�Ⱦ�
		Scanner sc = new Scanner(System.in);
		String message;
		try {
				System.out.println("+ + + Ŭ���̾�Ʈ ���� + + +");
				sock = new Socket(serverIp, port); //���� ����
				
				//------������ ��� ----
	
				sock.getOutputStream();
				
				while(true) {
					message = sc.nextLine();
					out = new PrintWriter(sock.getOutputStream());
					out.println(message);
					out.flush();
				}
		
			//-------------------------------------
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			out.close();
			try {
				 //��Ʈ�� �ݱ�
				sock.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //���� �ݱ�
			
		}
		
	}
}
