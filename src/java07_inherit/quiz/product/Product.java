package java07_inherit.quiz.product;

//�޼ҵ���x->new�ϸ� �ȵ�(��üȭx) -> Ŭ���� �߻�ȭ
	public abstract class Product { //�߻�ȭ�޼ҵ带 �������ִ� Ŭ������ �߻�ȭ�������
	protected String model;
	protected int price;
	
	
	public Product() {
		
	}
	public Product(String model,int price){
		
		this.model = model;
		this.price = price;
	}
	//�߻�޼ҵ�� �ۼ��ϱ�  
	public abstract void out();  //�θ�Ŭ���� �޼ҵ尡 �����̾����� �߻�ȭ�ؼ� �̸��� ����
	
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
