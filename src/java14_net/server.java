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

		ServerSocket servSock = null; //서버 리슨 소켓(접속 대기 소켓)
		Socket sock = null; //통신 소켓
		BufferedReader in = null;
		PrintWriter out = null; //출력스트림
		
		try {
				//---------서버 리슨 소켓 활성화 ----------------
				servSock = new ServerSocket(3000); //리슨 소켓 생성
				System.out.println("+ + + 서버 리슨 소켓 생성 + + +");
				
				System.out.println();
				System.out.println("----접속 대기중 ----");
				System.out.println(" Listen Port : " + servSock.getLocalPort());
				sock = servSock.accept(); //Listen, 클라이언트 접속 대기
		
				//----------접속한 클라이언트 정보 확인 ------------
				System.out.println("클라이언트 접속 완료!");
				//클라이언트 IP정보 가져오기
				InetAddress clientIP = sock.getInetAddress();
				System.out.println(">>클라이언트 IP : " + clientIP.getHostAddress());
				System.out.println(">>클라이언트 Port : " + sock.getPort());
				//--------------------------------------------------
				sock.getInputStream();
				while(true) {
					in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
					String msg =in.readLine();
					System.out.println(">> 전송 데이터 : " + msg);
					if(msg.equals("exit")) {
						break;
				}
			}
			//------------------------------------
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//출력 스트림 닫기 //예외사항 내부에 처리해줌
			try {
				in.close();
				sock.close(); //통신 소켓 닫기
				servSock.close();//리슨 소켓 닫기
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}

	

	}
}
