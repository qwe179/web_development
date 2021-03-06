package java13_io.objectStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex02_ObjectOutputStream {
	public static void main(String[] args) {
	
		//출력 파일 객체
		File file = new File(
				"./src/java13_io/objectStream"
				,"ObjectTest.ser");
				
		//스트림 객체 선언
		ObjectOutputStream oos = null;
		
		
		
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			List<Point> list = new ArrayList<>();
			
			list.add(new Point(11,22));
			list.add(new Point(123,456));
			list.add(new Point(555,666));
			
			oos.writeObject(list);//리스트를 출력에 사용
			oos.flush(); //출력 버퍼 비우기
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.close(); //전달받은 1차스트림도 안전하게 닫아준다
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
	}
}
