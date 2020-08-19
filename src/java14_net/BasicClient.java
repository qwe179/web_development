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
		
		Socket sock = null; //클라이언트 소켓(접속, 통신)
		
		BufferedReader in = null; //소켓 입력 스트림 , 문자입력스트림에서 고급화된애
		
		try {
			System.out.println("+ + + 클라이언트 실행 + + +");
			sock = new Socket(serverIp, 3000); //서버 접속
			
			//------데이터 통신 ----
			//통신소켓인 sock객체로부터 입출력스트림을 얻어와서
			//통신에 사용한다
//			sock.getOutputStream();
			//입력 스트림 제어(서버 - > 클라이언트)
			
			sock.getInputStream();
			
			in = new BufferedReader(new InputStreamReader(sock.getInputStream())); 
			//InputStreamReader : 문자스트림 -> 바이트스트림 바꿔주는애
			
			String msg =in.readLine();
			System.out.println(">> 전송 데이터 : " + msg);
			//-------------------------------------
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close(); //스트림 닫기
				sock.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //소켓 닫기
			
		}
		
	}
}
