package java14_net.quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class client {

	public static void main(String[] args) {
		String serverIp = "127.0.0.1";
		int port = 3000;
		
		
		Socket sock = null;
		OutputStream out = null;
		
		File file = new File("./src/java14_net/quiz","testinput.txt");
		FileInputStream in = null;
		PrintWriter Pw = null;
		FileOutputStream fos;
		
		
		byte[] buf = new byte[1024];
		int len = -1;
		StringBuilder sb = new StringBuilder();
		
		try {
			System.out.println("클라이언트:연결됐습니다");
			sock = new Socket(serverIp, port);
//			sock.getOutputStream();
			out = sock.getOutputStream();
			Pw = new PrintWriter(sock.getOutputStream());
			in = new FileInputStream(file);
			while( (len = in.read(buf)) != -1 ) {
				String str = new String(buf, 0, len);
				out.write(str.getBytes());
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
