import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;


class AgeDesc implements Comparator<Integer>{

	//내림차순 사용시 
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
}


public class HashMapEx1 {
	public static void main(String[] args) {

//		HashMap<Integer, String> map = new HashMap<Integer, String>();
		TreeMap<Integer, String> map = new TreeMap<Integer, String>(new AgeDesc()); //내림차순 정렬시 사용
		
		//중복제거(key, value)
		map.put(3, "kim");
		map.put(4, "hong");
		map.put(5, "lee");
		map.put(6, "lee2");
		map.put(7, "park");
		map.put(8, "kim");
		map.put(9, "kim");
		map.put(10, "hong");
		map.put(41, "lee");
		map.put(42, "lee2");
		map.put(51, "park");
		map.put(60, "kim");
		
		System.out.println(map);
		System.out.println(map.get(5));
	
		//반복문 사용할 수 없어서 key를 사용한다.
		Set<Integer> set = map.keySet();
		for(Integer n : set) // key출력함 
			System.out.print(n + "\t");
	
		System.out.println();
		for(Integer n : set) // value 출력함 
			System.out.print(map.get(n) + "\t");
		
		System.out.println();
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext())
			System.out.print(map.get(itr.next())+ "\t");
	}
}
