package java07_inherit.quiz.person;

import java07_inherit.quiz.product.Computer;
import java07_inherit.quiz.product.Product;
import java07_inherit.quiz.product.Tv;

public class Person {

	private String name;//�̸�
	private int money;//��, ������
	private Product prod;//����
	
//	private Product[] prods; //���� �迭
//	private int cnt;//���� ����
	private Computer[] coms;
	private Tv[] tvs;
	
	public Person(String name, int money){
		
		this.name = name;
		this.money=money;
		
	}
	///buy�޼ҵ�
	public void buy(Product p) {
		//���ǰ��ݸ�ŭ ���� ������ ���ű��(buy�޼ҵ�)�ߴ�
		
		if(this.money < p.getPrice()) {
			System.out.println("[SYSTEM] �������� �����մϴ�");
			
			return; //return; �ڵ�� �޼ҵ带 �ߴܽ�Ų��
		}
		this.prod=p;
		
		

		//�������ڷ� ���� Product��
		//����ʵ忡 �����ϰ�
		//���ǰ��ݸ�ŭ money�� �����Ѵ�
		this.money -=prod.getPrice();
		//�����Ȳ�� ����Ѵ�
		System.out.println(this.name + "����"
				+ prod.getPrice() + "���� �����ϰ�"
				+ prod.getModel() + "������");
		System.out.println("[�ܾ�] " + this.money + "��");
		//ex)
		//Alice���� 500���� �����ϰ� i5 ������
		//[�ܾ�] 0��
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
