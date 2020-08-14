package java07_inherit.quiz.product;

public class Tv extends Product{


//	
	public Tv(String model, int price){
		super(model,price);
		
//		
	}

	@Override
	public void out() {
		
		System.out.println("TV");
//		System.out.println("¸ðµ¨ : "+model);
//		System.out.println("°¡°Ý : "+price);
	}
	
	
}
