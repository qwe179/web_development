package java13_io.objectStream;

import java.io.Serializable;

public class Point implements Serializable{

	int x;
	int y;
	
	
//	@Override
//	public String toString() {
//		return super.toString();
//	}
//	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

//toString() �ڵ� ���� ����Ű : alt + shift + s, s
	@Override
	public String toString() { //toString-> ��°����ϰ�����
		return "Point [x=" + x + ", y=" + y + "]";
	}



	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}