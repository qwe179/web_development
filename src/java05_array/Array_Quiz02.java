package java05_array;

import java.util.Scanner;

public class Array_Quiz02 {

	public static void main(String[] args) {
		int arr[] = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		
		////////////invert_arr��� �迭�� �Ųٷ� �Է��ϱ�
		System.out.println("------1��-------------------");
		int[] invert_arr=new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			
			invert_arr[i]=arr[arr.length-1-i]; //�迭������ (arr[9-i])
			
			System.out.println(invert_arr[i]);
		}
		
		
		
		
		
		////////////¦����° �ε��������� - Ȧ����° �ε��� ������ ��
		System.out.println("------2��-------------------");
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(i%2==0) {
				
				sum1+=arr[i]; ////¦����° ��
			} else {
				sum2+=arr[i]; ////Ȧ����° ��
			}
			
		}
		System.out.println(sum1-sum2); //¦�������� - Ȧ����° ��
		
		
		
		
		
		
		///////////���� ���ڰ� 1���� �ǰ��ϱ�
		System.out.println("-------3��-------------------");
		int[] arr1 ={10,17,3,9,27,10,8,9,13,21};
		int[] rank_arr = {10,17,3,9,27,10,8,9,13,21};

		int[] rank_arr3 =new int[10];
		
		int count=10;  //1�� �ݺ��� ������ �����ϳ��� �ڸ��� ã���Ƿ� 5�� ����
		int tmp;		//�ӽ������� ���� ����
		
		
		while(count>1) { 
			
			for(int i = 0; i<arr1.length-1; i++) {  
				
				if(arr1[i]<arr1[i+1]) {	//���ʼ��ڰ� ������ ���ں��� Ŭ��!
					
					tmp=arr1[i];			//���� ���ڸ� �ӽ�����
					arr1[i]=arr1[i+1];	//������ ���ڸ� ���ʼ��ڿ� ����
					arr1[i+1]=tmp;		//������ ���ڿ� �ӽ������� ���ʼ��� ���� -->���� ��ȯ
				}
			}
			count--; //1ROUND �������� ���ҵ�
		}
		//////////�������ķ� ����
		/////////arr1 = {21,17,13,10,10,9,9,8,3}  /////������������ ���Ľ�Ŵ
		
		System.out.println("-------Test arr1-----------"); ///�׽�Ʈ ���
		for(int i=0;i<10;i++) {
		System.out.println(arr1[i]);
		}
		
		System.out.println("---------------------------");
		
		
		int val2=0;
		int val=1;
		for(int i = 1; i<arr1.length; i++) {
			rank_arr[0]=1;  //////arr1[i]�� arr1[i-1]�� ���ؼ� rank_arr[i]�� �־���ϴµ� index���� �Ѿ��, ù��° �ε����� 1�� �ʱ�ȭ������
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
		System.out.println("-------Test rank_arr-----------"); //rank_arr ��� �׽�Ʈ	
		for(int i=0;i<10;i++) {
		System.out.println(rank_arr[i]);
		}
		for(int i=0;i<10;i++) {
			
			for(int j=0;j<10;j++) {
				
			
				if(arr[i]==arr1[j]) {	////�����迭�� ����������Ų �迭 ��(���ڰ� ������)
					rank_arr3[i]=rank_arr[j];  ////���ڰ� ���ٸ�, ����������Ų�迭�� ����������� �迭 �ε�����Ī
					//�����������ĵ� arr1�� index j�� ���� �迭 rank_arr�� index�� ����.
					//������� ���� rank_arr3�� �ε����� ���� �迭 arr�� �ε����� ��ġ��Ų��.
	
				}
			}
			
		}
			
		System.out.println("------����3���------------");
		for(int i=0;i<10;i++) {
		System.out.println(rank_arr3[i]);  ////����� rank_arr3��;;
		}

		
		System.out.println("--------------����4---------");
		///�ߺ��� ���� over_arr�� �ְ� �ߺ��������� ���� ret_arr�� �Է��Ͻÿ�
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




//////////3�� rank=1, ũ����ؼ�  rank ++;���ָ��;;
