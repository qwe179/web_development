package java14_net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	
	public static void main(String[] args) {
		
	
		InetAddress ip = null; //IP�ּ� ǥ�� ��ü
		try {
			//������ �ּҸ� �̿��Ͽ� IP���� ������
			ip= InetAddress.getByName("www.iei.or.kr");
			
			System.out.println("IP : " + ip.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println("-----------------------------------");
		
		try {
			//�ڱ� �ڽ��� ȣ��Ʈ �ּ� �˾Ƴ���
			ip = InetAddress.getLocalHost();
			System.out.println("Address : " + ip.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}
}
