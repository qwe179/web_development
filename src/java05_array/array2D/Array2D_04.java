package java05_array.array2D;
import java.util.Scanner;
public class Array2D_04 {
	public static void main(String[] args) {
		

		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		
		System.out.println("길이 : " + arr.length);
		
		System.out.println("---------------------");
		arr= new int[3];
		System.out.println("길이 : " + arr.length);
		//arr 변수가 int[3]로 새로 만들어진 배열을 참조하면서
		//이전에 참조하던 int[5] 배열은 아무도 참조하지 않는다
		
		//-> 아무도 참조하지 않는 동적할당공간을 GC가 해제한다
		//-> Garbage Collector
		//-> 가비지 콜렉터
		//-> 가비지 콜렉터는 JVM안에 포함되어있음 
	}
}
