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
		
		Socket sock = null; //클라이언트 소켓(접속, 통신)
		PrintWriter out = null;
		BufferedReader in = null; //소켓 입력 스트림 , 문자입력스트림에서 고급화된애
		Scanner sc = new Scanner(System.in);
		String message;
		try {
				System.out.println("+ + + 클라이언트 실행 + + +");
				sock = new Socket(serverIp, port); //서버 접속
				
				//------데이터 통신 ----
	
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
				 //스트림 닫기
				sock.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //소켓 닫기
			
		}
		
	}
}
