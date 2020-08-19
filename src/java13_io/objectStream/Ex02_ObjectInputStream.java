package java13_io.objectStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Ex02_ObjectInputStream {
	public static void main(String[] args) {
		
		//입력 파일 객체
		File file = new File(
				"./src/java13_io/objectStream"
				,"ObjectTest.ser");
				
		//입력 스트림 객체 선언
		ObjectInputStream ois = null;
		
		
		
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			List<Point> list = (List<Point>)ois.readObject();
			
			System.out.println(list);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
