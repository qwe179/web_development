package java04_control.loop;

public class For_05 {
	public static void main(String[] args) {
		
		//1부터 10까지 총합을 구하기
		
		//어떤 숫자를 반복적으로 증가시킬 것인가?
		//반복횟수 : 10
		//반복구간 : 0~9
		
		//초기식 : int i = 0; (i변수, 반복구간의 시작값)
		//조건식 : i<10 (i변수, 반복구간의 끝값, 반복 횟수)
		//증감식 : i++ (1씩 증가)
		
		// ** 필요한 변수 생각해보기
		//sum 총합변수
		//반복문작성할때는 반복하지않고 작성했을때 형태를 생각?해야함
		
		int sum= 0;
		for(int i =0;i<10;i++) {
			sum+= i+1; 
		}
		System.out.println(sum);
		
	}

}
