package java07_inherit.quiz.person;

import java07_inherit.quiz.product.Computer;
import java07_inherit.quiz.product.Product;
import java07_inherit.quiz.product.Tv;

public class Person {

	private String name;//이름
	private int money;//돈, 소지금
	private Product prod;//물건
	
//	private Product[] prods; //물건 배열
//	private int cnt;//물건 갯수
	private Computer[] coms;
	private Tv[] tvs;
	
	public Person(String name, int money){
		
		this.name = name;
		this.money=money;
		
	}
	///buy메소드
	public void buy(Product p) {
		//물건가격만큼 돈이 없으면 구매기능(buy메소드)중단
		
		if(this.money < p.getPrice()) {
			System.out.println("[SYSTEM] 소지금이 부족합니다");
			
			return; //return; 코드는 메소드를 중단시킨다
		}
		this.prod=p;
		
		

		//전달인자로 받은 Product를
		//멤버필드에 저장하고
		//물건가격만큼 money를 차감한다
		this.money -=prod.getPrice();
		//진행상황을 출력한다
		System.out.println(this.name + "님이"
				+ prod.getPrice() + "원을 지불하고"
				+ prod.getModel() + "구매함");
		System.out.println("[잔액] " + this.money + "원");
		//ex)
		//Alice님이 500원을 지불하고 i5 구매함
		//[잔액] 0원
	}
	
	
	//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
