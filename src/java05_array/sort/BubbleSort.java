package java05_array.sort;

public class BubbleSort {
	public static void main(String[] args) {
		//버블 정렬
		// 1. 각 ROUND의 알고리즘
		
		// - 0번째 요소와 인접한 요소를 비교한다(0인덱스, 1인덱스)
		// - 왼쪽의 데이터가 크면 스왑한다(오름차순)
		// - 이 방법을 마지막 요소까지 진행(반복)
		
		
		
		// 2. 1번 알고리즘을 이용하여 모든 요소가 정렬될 때까지 반복
		//		-각 ROUND가 진행될 때마다 1개의 요소가 정렬된 상태가 된다.
		// 		-각 ROUND가 진행되면 정렬해야하는 요소가 하나씩 줄어든다.
		
		
		//-----원본 출력 -------
		int[] arr = {3,2,5,4,1};
		System.out.println("----정렬 전 ----");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//----------------------
		
////////////////실행할때마다 반복횟수 줄어드는데 고려안한코드... i값뺴주면 효율적임    for (int i=0; i<arr.length-1;i++){for(int j=0;j<arr.length-1-i;j++){}}
		
		
		
		//---- 버블 정렬(구현) ---
		int count=5;  //1번 반복할 때마다 숫자하나가 자리를 찾으므로 5로 설정
		int tmp;		//임시저장할 변수 선언
		
		
		while(count>1) { //count가 5->1이되면 정렬 끝내고 탈출! 
			
			for(int i = 0; i<4; i++) {  //1ROUND돌때 4번 비교하므로 i<4
				
				if(arr[i]>arr[i+1]) {	//왼쪽숫자가 오른쪽 숫자보다 클때!
					
					tmp=arr[i];			//왼쪽 숫자를 임시저장
					arr[i]=arr[i+1];	//오른쪽 숫자를 왼쪽숫자에 대입
					arr[i+1]=tmp;		//오른쪽 숫자에 임시저장한 왼쪽숫자 대입 -->숫자 교환
				}
			}
			count--; //1ROUND 돌때마다 감소됨
		}
		//------------------------		
		//--- 정렬된 이후 출력 ----
		System.out.println("----정렬 후 ----");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		//-------------------------

			
			
			
			
			
			
			
		
		
		
	}

}
