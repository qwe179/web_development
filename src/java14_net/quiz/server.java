package java14_net.quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
	public static void main(String[] args) {
		ServerSocket serv = null;
		Socket sock = null;
		
		InputStream in=null;
		
		File file = new File("./src/java14_net/quiz","test.txt");
		FileOutputStream out = null;
		
		byte[] buf = new byte[1024];
		int len = -1;
		StringBuilder sb = new StringBuilder();
		BufferedReader br = null;
		
		try {
		
			serv = new ServerSocket(3000);
			sock = serv.accept();
			System.out.println("서버:연결됐습니다");
			//-------------------------------
			InetAddress clientIP = sock.getInetAddress();
			System.out.println("IP정보 : " + clientIP.getHostAddress());
			System.out.println("Port정보 : " + sock.getPort());
			
			
			//4.in 생성
			in = sock.getInputStream(); 
			//5.out 생성
			out =new FileOutputStream(file);
			//6. 파일 받아서 저장
			while( (len = in.read(buf)) != -1 ) {
				String msg = new String(buf, 0, len);
				System.out.println(" asd " + msg);
				out.write(msg.getBytes());
			}
			
			
			
		
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
