package java01_variables;

class Carr {
	private String modelName;
	
	Carr(String modelName){
		
		this.modelName = modelName;
		
	}
		
	public void mymethod(){
		
		System.out.println(modelName);
		
		
	}
	
	
	
	
	
}

public class VariablesEx_06 {

	
	
	public static void main(String[] args) {
		
		
		System.out.println(777); //int형 리터럴 상수 777
		
		//------------------------------------------------------------
		//변수의 상수화
		final int MAX;
		
		//** final 키워드 : 변수를 상수화 시킨다.
		// 변수의 값을 딱 한 번만 초기화할 수 있도록 만든다.
		
		MAX = 100; //한번만 대입 가능하다, 이후엔 100 값으로 고정됨
//		MAX = 200; //다시 대입 불가
		
		//관례적으로 이름있는 상수의 이름은 모두 대문자로 작성한다
		//상수명의 단어 구분은 _로 한다
		// ex) final int MAX_PROPLE_COUNT;(snake_case)
		//---------------------------------------------------------------
		
		//ex)학생들의 성적을 구하는 프로그램
		final int STUDENT_NUM = 50; //총인원
		
		double avg = 1000 /STUDENT_NUM; //평균
		
		Carr mycar = new Carr("아바타");
		
		mycar.mymethod();
		
		
		
		/*
		
		int num = 0;
		int[][] grade = new int[5][5];
		
		for (int i=0; i<5;i++) {

			for (int j =0; j<5; j++) {
				grade[i][j] =num;
				
				num +=1;
				if (j%2==1) {
					
					grade[i][j]=0;
				}
				System.out.println(grade[i][j]);
			}
		}
		
		
		
		*/
	}
}





