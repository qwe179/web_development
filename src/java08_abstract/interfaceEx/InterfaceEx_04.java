package java08_abstract.interfaceEx;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

interface Anonymous{
	public void out();
	
}





public class InterfaceEx_04 {
	public static void main(String[] args) {
		Anonymous a01; //인터페이스 객체 변수
		
		a01 = new Anonymous() {
		
			@Override
			public void out() {
				System.out.println("익명 객체 1번");
				// TODO Auto-generated method stub
			//채워줄테니까 객체생성해달라	
			}
		};
		a01.out();
		System.out.println("-----------");
		
		Anonymous a02 = new Anonymous() {
			
			@Override
			public void out() {
				System.out.println("익명객체 2번"); //같은메소드로 동작코드만 달라지게..이벤트
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
