package java05_array;

import java.util.Scanner;

public class Array_Quiz02 {

	public static void main(String[] args) {
		int arr[] = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		
		////////////invert_arr라는 배열에 거꾸로 입력하기
		System.out.println("------1번-------------------");
		int[] invert_arr=new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			
			invert_arr[i]=arr[arr.length-1-i]; //배열뒤집기 (arr[9-i])
			
			System.out.println(invert_arr[i]);
		}
		
		
		
		
		
		////////////짝수번째 인덱스내용합 - 홀수번째 인덱스 내용의 합
		System.out.println("------2번-------------------");
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(i%2==0) {
				
				sum1+=arr[i]; ////짝수번째 합
			} else {
				sum2+=arr[i]; ////홀수번째 합
			}
			
		}
		System.out.println(sum1-sum2); //짝수번쨰합 - 홀수번째 합
		
		
		
		
		
		
		///////////높은 숫자가 1등이 되게하기
		System.out.println("-------3번-------------------");
		int[] arr1 ={10,17,3,9,27,10,8,9,13,21};
		int[] rank_arr = {10,17,3,9,27,10,8,9,13,21};

		int[] rank_arr3 =new int[10];
		
		int count=10;  //1번 반복할 때마다 숫자하나가 자리를 찾으므로 5로 설정
		int tmp;		//임시저장할 변수 선언
		
		
		while(count>1) { 
			
			for(int i = 0; i<arr1.length-1; i++) {  
				
				if(arr1[i]<arr1[i+1]) {	//왼쪽숫자가 오른쪽 숫자보다 클때!
					
					tmp=arr1[i];			//왼쪽 숫자를 임시저장
					arr1[i]=arr1[i+1];	//오른쪽 숫자를 왼쪽숫자에 대입
					arr1[i+1]=tmp;		//오른쪽 숫자에 임시저장한 왼쪽숫자 대입 -->숫자 교환
				}
			}
			count--; //1ROUND 돌때마다 감소됨
		}
		//////////버블정렬로 정렬
		/////////arr1 = {21,17,13,10,10,9,9,8,3}  /////내림차순으로 정렬시킴
		
		System.out.println("-------Test arr1-----------"); ///테스트 출력
		for(int i=0;i<10;i++) {
		System.out.println(arr1[i]);
		}
		
		System.out.println("---------------------------");
		
		
		int val2=0;
		int val=1;
		for(int i = 1; i<arr1.length; i++) {
			rank_arr[0]=1;  //////arr1[i]랑 arr1[i-1]랑 비교해서 rank_arr[i]에 넣어야하는데 index범위 넘어가서, 첫번째 인덱스는 1로 초기화시켜줌
			if (arr1[i]==arr1[i-1]) {
	
				val2+=1;
				rank_arr[i]=val;
				
			}else {
				val+=1;
				val+=val2;
				val2=0;
				rank_arr[i]=val;
			}
		}
		System.out.println("-------Test rank_arr-----------"); //rank_arr 출력 테스트	
		for(int i=0;i<10;i++) {
		System.out.println(rank_arr[i]);
		}
		for(int i=0;i<10;i++) {
			
			for(int j=0;j<10;j++) {
				
			
				if(arr[i]==arr1[j]) {	////기존배열과 내림차순시킨 배열 비교(숫자가 같은지)
					rank_arr3[i]=rank_arr[j];  ////숫자가 같다면, 내림차순시킨배열과 순위적어놓은 배열 인덱스매칭
					//내림차순정렬된 arr1의 index j는 순위 배열 rank_arr의 index와 같다.
					//결과값을 넣을 rank_arr3의 인덱스는 원본 배열 arr의 인덱스와 일치시킨다.
	
				}
			}
			
		}
			
		System.out.println("------문제3결과------------");
		for(int i=0;i<10;i++) {
		System.out.println(rank_arr3[i]);  ////결과는 rank_arr3에;;
		}

		
		System.out.println("--------------문제4---------");
		///중복된 값은 over_arr에 넣고 중복되지않은 값은 ret_arr에 입력하시오
		int[] arr2 = {10,17,3,9,27,10,8,9,13,21};
		
		int[] over_arr = new int[10];
		int[] ret_arr = new int[10];
		
		for(int i = 0; i<10; i++) {
			for(int j =i+1;j<10; j++) {
				if(arr2[i]==arr2[j]) {
					
					over_arr[i]=arr2[i];
					arr2[i]=0;
					arr2[j]=0;
					
				}else {
					ret_arr[i]=arr2[i];
				}
				
					//ret_arr[]
			}
		}
		ret_arr[9]=21;
		for(int i = 0; i<10; i++) {
			System.out.println(over_arr[i]);
		}
		System.out.println("-------------------------");
		for(int i = 0; i<10; i++) {
			System.out.println(ret_arr[i]);
		}
		
	}
}




//////////3번 rank=1, 크기비교해서  rank ++;해주면됨;;
