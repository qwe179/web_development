package java13_io.file;

import java.io.File;
import java.io.IOException;

public class FileEx_01 {
	public static void main(String[] args) {
		
		//class File
		//������ ������ �ٷ�� Ŭ����
		// -> ������ ����´��(��ġ)�� ����� �� �ְ� ���ش�
		
		File file1 = new File("D:/test.txt");
		
		System.out.println("file info : " + file1);//���� ���
		System.out.println("length : " + file1.length()); //ũ��
		System.out.println("exists : " + file1.exists()); //��������
		
		
		
		
//		try {
//			file1.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}
}
