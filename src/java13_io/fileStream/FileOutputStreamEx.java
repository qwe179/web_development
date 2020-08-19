package java13_io.fileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		
		//��� ��� ����
		File file = new File("./src/java13_io/fileStream","Result");
		System.out.println("[test] exists : " + file.exists());
		
		//���� ��� ��Ʈ�� ��ü
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file); //��Ʈ�� ����
			
			//���� ���
			fos.write("Apple".getBytes(),0, "Apple".length());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close(); //��Ʈ�� �ݱ�
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
