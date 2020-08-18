package java10_collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Collection_06_Properties {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		Reader reader;
		try {
			reader = new FileReader("./src/java10_collection/user.properties");//unhandled exception -> Ȥ�ó������� ó���ϼ���
			
			
			// ./ : ���α׷��� ����� ����
			//		->������Ʈ ����
			prop.load(reader);
			
			//������ ������ �о� �޸𸮷� �ε� �Ϸ�
			//----------------------------------------
			System.out.println(prop);

			//�Ӽ��� ��������
			String user = prop.getProperty("username");
			System.out.println("USER : " + user);
			
			user = "Bob";
			prop.setProperty("username", user);
			System.out.println(prop);
			
			//-----------------------------------------
			prop.store(new FileWriter("./src/java10_collection/user.properties"),"user information update");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
