package java06_class.uml;

public class Car{ //Car +
	//����ʵ�
	private String model;//String
	private String color;//String
	
	//������
	public Car(String model, String color) { 
		this.model=model;
		this.color=color;
	
	}

	public void display() { /////display + ,void   ///method
	System.out.println("�� ���� " + this.model+"�̰� " + "������ " +this.color + "�Դϴ�");
	}
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) { ////+String
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) { /////+String
		this.color = color;
	}
	
	
	
	
	
	
}