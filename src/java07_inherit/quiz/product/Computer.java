package java07_inherit.quiz.product;

public class Computer extends Product{

	
	
	public Computer(String model, int price){
		super(model,price); //ĸ��ȭ.. �θ������ϴ±�ɾ���ظ��ϸ�
		
	}



	@Override
	public void out() {
		System.out.println("Computer");
	
	}
	
}