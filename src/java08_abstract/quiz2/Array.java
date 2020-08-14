package java08_abstract.quiz2;

public class Array implements ArrayAction {
	String[] arr = new String[10];
	

	@Override
	public void add(String element) {
		int i;
		//0~9번째 인덱스까지 탐색
		for(i =0; i<arr.length; i++) {
		//null값을 가지고 있는 인덱스 찾기
			if(arr[i]==null) {
				
				break;//반복 중단
			}
		}
		//null값을 가진 인덱스에 새로운 값(element)추가
		if(i<arr.length) {//배열에 빈 공간이 없을 때 예외처리
			arr[i]=element;			
		}else {
			System.out.println("[SYETEM] 배열에 빈 공간이 없어" 
					+ "add ("+element+") 를 수행할 수 없습니다");
		}

		
	}

   //배열 삭제
	
  @Override
  public void remove(String element) {
//지우려는 데이터 element가 존재하는 인덱스 찾기
//	  int i;
//	  for( i=0;i<arr.length;i++) {
//		  if(element.equals(arr[i])) {
//			  break;
//		  } 
//	  }
	  int i =this.find(element);
	  if(i==-1) {//지우려는 데이터 없으면 중단
		  return;
	  }
	  //찾은 인덱스부터 뒷쪽의 데이터를 한칸씩 앞당기기
	  int j;
	  for(j=i; j<arr.length-1;j++) {
		  
		  //빈칸(null값)을 만나면 중단

		  
		  if(arr[j+1]==null) {
			  break;
		  }
		  arr[j]=arr[j+1];
		  
	  }
	  arr[j]=null;//앞당기기 작업의 마지막 데이터를 null로 대입
  }
  
  
  
  
  
//   @Override
//   public void remove(String element) {
//	   
//	   //지우려는 데이터 element가 존재하는 인덱스 찾기
//	   
//	   //찾은 인덱스부터 뒷쪽의 데이터를 한칸씩 앞당기기
//	   for(int i=0;i<arr.length;i++) {
//		   if(arr[i]!=null) {
//			   if(arr[i].equals(element)) {
//				   
//				   arr[i]=null;
//				   
//			   } 
//		   }
//	   }
//	   for(int j =0; j<arr.length-1;j++) {//남아있는거다땡겨줘
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
		// idx위치의 element를 반환
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
	//찾는 데이터 없음
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
			
			//빈칸(null값)은 출력하지 않음
			
			if(arr[i]==null) {
				break;
			}
			//첫번째 데이터가 아닐 때만 "," 출력
			if(i!=0) {
				System.out.print(",");
			}
			System.out.print(arr[i]);
		}
		System.out.println();
			//--------------------------
		//띄어쓰기로 전체 출력
		//빈칸(null)도 출력한다
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i] + " ");
//			
//		}
//		System.out.println();
		
	}
		
}
