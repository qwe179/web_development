package java07_inherit.quiz.product;

public class Computer extends Product{

	
	
	public Computer(String model, int price){
		super(model,price); //캡슐화.. 부모가제공하는기능쓰기왠만하면
		
	}



	@Override
	public void out() {
		System.out.println("Computer");
	
	}
	
}