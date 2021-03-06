package java10_collection;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection_01_ArrayList {
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		LinkedList list2 = new LinkedList();
		Vector List3 = new Vector();
		//----------------------------------------
		
		//자료구조에서 자주 사용되는 동작
		// CRUD 작업
		
		//Create - 추가/삽입/생성
		//Read - 조회/탐색
		//Update - 수정/변경
		//Delete - 삭제/제거
		
		//-------------------------------------------------------
		
		List list = new ArrayList();
		System.out.println("--삽입--");
		list.add("Apple");		
		list.add("Banana");
		list.add("Cherry");
		
		System.out.println(list);
		
		System.out.println("\n----조회-----");
		
		System.out.println("1번째 요소 : " + list.get(1));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\n---삭제------");
		list.remove(1);//1번째 인덱스 삭제
		System.out.println(list);
		list.remove("Cherry");
		System.out.println(list);
		System.out.println("\n---수정----");
		
		list.set(0, "orange");
		System.out.println(list);
		
		System.out.println("\n---isEmpty()-----");
		System.out.println(list.isEmpty());
		
		List l1 = null;//리스트 생성하지 않았음
		List l2 = new ArrayList(); //리스트가 비어있음
		
		
		//l1==null -> true
		//isEmpty() -> NullPointerException
		
		//l2 ==null -> false
		//l2.l2.isEmpty() ->true
		System.out.println(l1);
		System.out.println(l2);
		
		if(l2 !=null) {//리스트를 생성했는지 검사
			if(!l2.isEmpty()){ //리스트에 데이터가 있는지 검사
		
				//l2 리스트 사용
				
				
			}
		}
		
		System.out.println("\n-----clear()------");
		System.out.println(list);
		list.clear();//전체 삭제, 모든 요소를 삭제한다
		System.out.println(list);
		
		
		
		//회원 정보 관리
		
		//회원가입 - Create
		//마이페이지 - Read
		//회원정보 수정 - Update
		//회원탈퇴 - Delete
		
		
		
		
		
	}

}
