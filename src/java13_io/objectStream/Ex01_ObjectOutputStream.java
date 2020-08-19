package java13_io.objectStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex01_ObjectOutputStream {
	public static void main(String[] args) {
	//ObjectOutputStream ->2����Ʈ��, 1����Ʈ�� �Ű������� �־������
		//��� ���� ��ü
		File file = new File("./src/java13_io/objectStream","ObjectTest.ser"); //ser -> serialize�Ȱ��..
		
		//��Ʈ�� ����
		FileOutputStream fos = null; //������½�Ʈ�� - 1�� ��Ʈ��
		ObjectOutputStream oos = null; //��ü��½�Ʈ�� - 2�� ��Ʈ��
		
		try {
			fos = new FileOutputStream(file);//������½�Ʈ�� ����
			oos = new ObjectOutputStream(fos); //��ü��½�Ʈ�� ����
			
			
			
			//��� ��� ��ü
			Point p1 = new Point(11,22);
			Point p2 = new Point(111,222);
			Point p3 = new Point(1111,2222);
			
			oos.writeObject(p1);
			
			
			oos.writeObject(p2);
			oos.writeObject(p3);
			oos.flush(); //��� ���� ����
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}
}
