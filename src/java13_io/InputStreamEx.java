package java13_io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {
	public static void main(String[] args) {
		
		InputStream is = System.in; //키보드 표준 입력 스트림
		byte[] buf = new byte[1024]; //입력 데이터의 임시 저장소 1024..
		
		int len = -1; //입력받은 데이터의 길이
		
		StringBuilder sb = new StringBuilder(); //전체 데이터 저장
		System.out.println("<<입력 대기중 >>");
		try {
			//입력 스트림에 입력받을 데이터가 존재하는 동안 반복
			while((len = is.read(buf)) != -1){      //EOF 안만나서 컨트롤+z로 EOF써줌
//				System.out.print(new String(buf, 0 , len));
				sb.append(new String(buf,0,len));
			
			}
//			is.read(buf);
//			System.out.println(new String(buf)); //new String 한번에 묶어서 문자로바꿔서출력
//			is.read(buf);
//			System.out.println(new String(buf)); //new String 한번에 묶어서 문자로바꿔서출력
//	
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close(); // 스트림 닫기
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("<< 입력된 데이터 >>"); 
		System.out.println(sb);
		
		
	}
}
