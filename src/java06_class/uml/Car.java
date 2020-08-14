package java06_class.uml;

public class Car{ //Car +
	//멤버필드
	private String model;//String
	private String color;//String
	
	//생성자
	public Car(String model, String color) { 
		this.model=model;
		this.color=color;
	
	}

	public void display() { /////display + ,void   ///method
	System.out.println("차 모델은 " + this.model+"이고 " + "색깔은 " +this.color + "입니다");
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