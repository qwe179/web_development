package java09_api;

public class StringBuilderEx {
	
	public static void info(StringBuilder s) {//정적으로 만들어줘야됨
		System.out.println("Length : " + s.length());//길이
		System.out.println("capacity : " + s.capacity()); //용량
	}
	
	public static void main(String[] args) {
		System.out.println("---StringBuilder 생성 ---");
		StringBuilder sb = new StringBuilder();

		info(sb);
		System.out.println("---Apple 추가 -----");
		sb.append("Apple");
		System.out.println(sb);
		info(sb);
		
		System.out.println("---Banana 추가 -----");
		sb.append("BananaBanana");
		System.out.println(sb);
		info(sb);
		
		System.out.println("---Orange insert -----");
		sb.insert(5,"Orange"); //5번째 인덱스에 끼워넣기(삽입)
		sb.deleteCharAt(3);//3번째 인덱스 문자 삭제
		System.out.println(sb);
		System.out.println("----trimtoSize-----"); //length만큼 capacity를 줄인다
		sb.trimToSize(); //capa 맞추기 마무리할때 사용
		info(sb);
		
		//내용물의 순서를 뒤집는다
		System.out.println("--reverse---");
		sb.reverse();
		System.out.println(sb);
		
	}

}
