import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLotoo {

	public static void main(String[] args) {

		Set set = new HashSet();
		
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(new Integer(num)); // set.add(num); 으로 사용해도된다. :박싱기능 
		}
		
		List list = new LinkedList(set);
		Collections.sort(list); 
		//번호를 크기 순으로 정렬하기 위해서 컬렉션클래스의 sort(List list)를 사용했다. 
		//이 메서드는 인자로 List인터페이스 타입을 필요로 하기 때문에 LinkedList클래서의 생성자 LinkedList(Collection c)를 
		//이용해서 HastSet에 저장된 객체들을 LinkedList에 담아서 처리했다. 
		System.out.println(list);
		
	}
}
