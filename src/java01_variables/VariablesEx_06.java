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
		
		
		System.out.println(777); //int�� ���ͷ� ��� 777
		
		//------------------------------------------------------------
		//������ ���ȭ
		final int MAX;
		
		//** final Ű���� : ������ ���ȭ ��Ų��.
		// ������ ���� �� �� ���� �ʱ�ȭ�� �� �ֵ��� �����.
		
		MAX = 100; //�ѹ��� ���� �����ϴ�, ���Ŀ� 100 ������ ������
//		MAX = 200; //�ٽ� ���� �Ұ�
		
		//���������� �̸��ִ� ����� �̸��� ��� �빮�ڷ� �ۼ��Ѵ�
		//������� �ܾ� ������ _�� �Ѵ�
		// ex) final int MAX_PROPLE_COUNT;(snake_case)
		//---------------------------------------------------------------
		
		//ex)�л����� ������ ���ϴ� ���α׷�
		final int STUDENT_NUM = 50; //���ο�
		
		double avg = 1000 /STUDENT_NUM; //���
		
		Carr mycar = new Carr("�ƹ�Ÿ");
		
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





