package java08_abstract.quiz;

public class Taxi implements Fare{
	@Override
	public void calc(int distance) {
		System.out.println(distance+"m�� �������� �� �����"+distance*FEE*2+"���Դϴ�");
	}
}
