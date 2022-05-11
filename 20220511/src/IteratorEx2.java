import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2 {

	public static void main(String[] args) {

		ArrayList original = new ArrayList(10);
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);
		
		for(int i = 0; i<10; i++)
			original.add(i+""); //String 타입으로 숫자 값 저장 
		
		Iterator it = original.iterator();	
		
		while(it.hasNext())
			copy1.add(it.next()); // 값을 계속해서 넣어주고
		
		System.out.println(" =Original에서 copy1로 복사(copy) =");
		System.out.println("original :" + original);
		System.out.println("copy1:" + copy1);
		System.out.println();
		
		// 마지막 값 끝낫는데, 읽고 싶으면 한번ㄷ ㅓ 불러오기
		it = original.iterator(); 
		System.out.println(it + "it끝 출력할 값없어서 주소");
		
		while(it.hasNext()) {
			copy2.add(it.next());
			it.remove();
		}
		
		System.out.println(" =Original에서 copy2로 이동(remove) =");
		System.out.println("original:" + original);
		System.out.println("copy2:" +copy2);

	} //main
}//class
