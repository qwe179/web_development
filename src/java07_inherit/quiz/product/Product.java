package java07_inherit.quiz.product;

//메소드사용x->new하면 안됨(실체화x) -> 클래스 추상화
	public abstract class Product { //추상화메소드를 가지고있는 클래스는 추상화해줘야함
	protected String model;
	protected int price;
	
	
	public Product() {
		
	}
	public Product(String model,int price){
		
		this.model = model;
		this.price = price;
	}
	//추상메소드로 작성하기  
	public abstract void out();  //부모클래스 메소드가 할일이없으면 추상화해서 이름만 제공
	
//	public void out(){
//	}	
	//getter setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	

}
