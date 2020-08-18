package java13_io.file;

import java.io.File;
import java.io.IOException;

public class FileEx_01 {
	public static void main(String[] args) {
		
		//class File
		//파일의 정보를 다루는 클래스
		// -> 파일을 입출력대상(장치)로 사용할 수 있게 해준다
		
		File file1 = new File("D:/test.txt");
		
		System.out.println("file info : " + file1);//파일 경로
		System.out.println("length : " + file1.length()); //크기
		System.out.println("exists : " + file1.exists()); //존재유무
		
		
		
		
//		try {
//			file1.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}
}
