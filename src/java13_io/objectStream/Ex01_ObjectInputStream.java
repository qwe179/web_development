package java13_io.objectStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex01_ObjectInputStream {
	public static void main(String[] args) {
		//입력 파일 객체
		File file = new File("./src/java13_io/objectStream","ObjectTest.ser");
		
		
		//스트림 객체 선언
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			
			Object p1 =ois.readObject();
			Point p2 =(Point)ois.readObject();
			Point p3 =(Point)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			
			try {
				ois.close(); //스트림 닫기
				fis.close(); //스트림 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
