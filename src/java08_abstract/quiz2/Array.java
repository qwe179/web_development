package java08_abstract.quiz2;

public class Array implements ArrayAction {
	String[] arr = new String[10];
	

	@Override
	public void add(String element) {
		int i;
		//0~9��° �ε������� Ž��
		for(i =0; i<arr.length; i++) {
		//null���� ������ �ִ� �ε��� ã��
			if(arr[i]==null) {
				
				break;//�ݺ� �ߴ�
			}
		}
		//null���� ���� �ε����� ���ο� ��(element)�߰�
		if(i<arr.length) {//�迭�� �� ������ ���� �� ����ó��
			arr[i]=element;			
		}else {
			System.out.println("[SYETEM] �迭�� �� ������ ����" 
					+ "add ("+element+") �� ������ �� �����ϴ�");
		}

		
	}

   //�迭 ����
	
  @Override
  public void remove(String element) {
//������� ������ element�� �����ϴ� �ε��� ã��
//	  int i;
//	  for( i=0;i<arr.length;i++) {
//		  if(element.equals(arr[i])) {
//			  break;
//		  } 
//	  }
	  int i =this.find(element);
	  if(i==-1) {//������� ������ ������ �ߴ�
		  return;
	  }
	  //ã�� �ε������� ������ �����͸� ��ĭ�� �մ���
	  int j;
	  for(j=i; j<arr.length-1;j++) {
		  
		  //��ĭ(null��)�� ������ �ߴ�

		  
		  if(arr[j+1]==null) {
			  break;
		  }
		  arr[j]=arr[j+1];
		  
	  }
	  arr[j]=null;//�մ��� �۾��� ������ �����͸� null�� ����
  }
  
  
  
  
  
//   @Override
//   public void remove(String element) {
//	   
//	   //������� ������ element�� �����ϴ� �ε��� ã��
//	   
//	   //ã�� �ε������� ������ �����͸� ��ĭ�� �մ���
//	   for(int i=0;i<arr.length;i++) {
//		   if(arr[i]!=null) {
//			   if(arr[i].equals(element)) {
//				   
//				   arr[i]=null;
//				   
//			   } 
//		   }
//	   }
//	   for(int j =0; j<arr.length-1;j++) {//�����ִ°Ŵٶ�����
//		   for(int i = 0; i<arr.length-1;i++) {
//			   
//			   if(arr[i]==null) {
//				   
//				   arr[i]=arr[i+1];
//				   arr[i+1]=null;
//			   }		   
//		   } 
//	   
//	   }
//	   
//   }




	@Override
	public String get(int idx) {
		// idx��ġ�� element�� ��ȯ
		return arr[idx];
	}

	@Override
	public int find(String element) {
		int i;
		for(  i=0;i<arr.length;i++) {
		  if(element.equals(arr[i])) {
			  break;
		  } 
		}
	//ã�� ������ ����
//	 if(i==arr.length) {
//		 return -1;
//	 }
	 return i;
		
	}
//	@Override
//	public int find(String element) {
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=null) {
//				if(arr[i].equals(element)) {
//					
//					return i;
//				}
//			}
//		}
//		return -1;
//	}

	@Override
	public void print() {
		for(int i=0;i<arr.length;i++) {
			
			//��ĭ(null��)�� ������� ����
			
			if(arr[i]==null) {
				break;
			}
			//ù��° �����Ͱ� �ƴ� ���� "," ���
			if(i!=0) {
				System.out.print(",");
			}
			System.out.print(arr[i]);
		}
		System.out.println();
			//--------------------------
		//����� ��ü ���
		//��ĭ(null)�� ����Ѵ�
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i] + " ");
//			
//		}
//		System.out.println();
		
	}
		
}
