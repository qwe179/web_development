package java13_io;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		
		OutputStream os = System.out; //표준 출력 스트림
		
		byte[] buf = new byte[1024]; //출력 데이터 버퍼
		
		int len = 0; //출력할 의미있는 데이터의 길이
		
		buf[len++] = 'A';
		buf[len++] = 'P';
		buf[len++] = 'P';
		buf[len++] = 'L';
		buf[len++] = 'E';
		buf[len++] = '\n'; //개행직접넣어줘야함
	
		
		try {
			os.write(buf,0,len); //버퍼 배열 출력
			os.flush(); // 버퍼 비우기(출력 장치까지 내보내기)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				os.close(); // 스트림 닫기  // 내부코드에 flush가 포함되어있음
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}  //메인메소드가 끝날 때 입출력스트림 알아서 정리함
}
