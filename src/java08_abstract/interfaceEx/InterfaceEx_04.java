package java08_abstract.interfaceEx;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

interface Anonymous{
	public void out();
	
}





public class InterfaceEx_04 {
	public static void main(String[] args) {
		Anonymous a01; //�������̽� ��ü ����
		
		a01 = new Anonymous() {
		
			@Override
			public void out() {
				System.out.println("�͸� ��ü 1��");
				// TODO Auto-generated method stub
			//ä�����״ϱ� ��ü�����ش޶�	
			}
		};
		a01.out();
		System.out.println("-----------");
		
		Anonymous a02 = new Anonymous() {
			
			@Override
			public void out() {
				System.out.println("�͸�ü 2��"); //�����޼ҵ�� �����ڵ常 �޶�����..�̺�Ʈ
			}
		};
		System.out.println("-----------");
		
		MouseListener m1;
		m1 = new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		};

	}
}
