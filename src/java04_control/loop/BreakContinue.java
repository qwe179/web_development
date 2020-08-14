package java04_control.loop;

public class BreakContinue {

	
	public static void main(String[] args) {
		//break;
		
		//제어문을 중단시키는 역할을 수행하는 코드
		//if문은 중단시키지 않는다
		// -> for, while, do-while, switch를 중단시킴
		//제어문이 중첩되어있을 경우 가장 가까운 영역을 {} 블록을 가진
		// 제어문 한 개를 중단시킨다.
		
		
		//--------------------------------------------
		for( int i =0; i<100; i++) { //i, 0~99,100번
			System.out.println(i);
			if( i>=5) {
				
				break; //중단코드
				
			}
			
		}
		
		
		
		//continue;
		//반복문에서 사용되는 기타 제어문
		//다음 반복으로 넘긴다
		// for문에서는 continue가 실행되면 즉시 증감문으로 넘어간다.
		//while문에서는 continue가 실행되면 조건문으로 넘어간다.
		
		for(int i=0; i<10; i++) {//i, 0~9, 10번
			if(i%2==0) { //짝수
				continue; //다음 반복으로 넘기기
			}
			System.out.println(i);
			
		}
	}
}
