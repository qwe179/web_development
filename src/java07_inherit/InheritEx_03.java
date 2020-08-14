package java07_inherit;

class Animal {
	public void cry() {
		System.out.println("ũ��������");
		
	}
}

class Dog extends Animal{
	@Override
	
	public void cry() {
		System.out.println("�۸�");
	}
	
}
class Cat extends Animal{
	@Override
	
	public void cry() {
		System.out.println("�߿�");
	}
	
}




public class InheritEx_03{
	public static void main(String[] args) {
		Dog d= new Dog();
		Cat c= new Cat();
		
		d.cry();
		c.cry();
		System.out.println("----------");	
		
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		
		a1.cry();
		a2.cry();
		System.out.println("----------");	
		
		//������, Polymorphism
		//�ϳ��� �޼ҵ峪 Ŭ���� Ÿ������ �ٸ� �޼ҵ峪 Ŭ������
		// ��ǥ�ؼ� ����� �� �ִ� Ư¡
		// -> �θ�Ŭ����Ÿ������ �پ��� �ڽ�Ŭ����Ÿ���� ��ǥ�Ѵ�
		
		
		Animal[] animals = new Animal[5];
		
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Dog();
		animals[3] = new Cat();
		animals[4] = new Dog();
		
		for( int i = 0; i < animals.length; i++) {
			animals[i].cry();	
		}
		
		
		
		
		
		
		
		
		
		
		
	}
		
}