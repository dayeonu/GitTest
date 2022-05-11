import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Listlterator {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("toy", "box", "robot", "box");
		
		System.out.println(list);
		
		list = new ArrayList<String>(list); //타입을 변환해준 부분 

		ListIterator<String> it = list.listIterator(); // 양방향 
	
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str + "\t");
		}
		
		// 여기까지만 데이타 출력되고 아래 while문에서는 찍을 출력값이 없음 
		
		System.out.println();
		
		//역순으로 간다
		while(it.hasPrevious()) {	
			String str = it.previous();
			System.out.print(str + "\t");
		}
		
		System.out.println();
		
		for(Iterator<String> itr = list.iterator(); it.hasNext(); )
			System.out.println(itr.next() + "\t" );
	
	}}
		//next() : 다음값 반환
		//hasNext() : 가져올 데이타가 있는가?
		//remove : next()호출을 통해 반환된 인스턴스를 삭제