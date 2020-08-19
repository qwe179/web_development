package java13_io.file;

import java.io.File;
import java.io.IOException;

public class FileEx_02 {
	public static void main(String[] args) {
		
		//class File의 생성자
		
		//File(String path, String filename)
		//File(File path, String filename)

		//File(String filepath)
		
		File file = new File("D:/workspace/JavaBasic/src/java13_io/file","Hello");
		
		System.out.println(file.length());
		System.out.println(file.exists());
		System.out.println("--------------------------------------------------------");
		
		File file2 = new File(
				"./src/java13_io/file"
				,"Hello");
		System.out.println(file2.length());
		System.out.println(file2.exists());
		
	}
}
