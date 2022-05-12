import java.util.Iterator;
import java.util.TreeSet;

class Person2 implements Comparable<Person2>{
	String name;
	int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}

	@Override
	public int compareTo(Person2 o) {
		return this.age-o.age;
	}
}

public class TreeSetEx2 {
	public static void main(String[] args) {

		TreeSet<Person2> tree = new TreeSet<Person2>();
		
		tree.add(new Person2("kim", 20)); //노드
		tree.add(new Person2("Park", 50)); 
		tree.add(new Person2("Lee", 80)); 
		tree.add(new Person2("kim", 29));  
		tree.add(new Person2("kim", 29)); //중복데이타
		tree.add(new Person2("kim", 29)); //중복데이타 
		tree.add(new Person2("kim", 20)); //중복데이타 
		
		for(Person2 n : tree)
			System.out.println(n);
		System.out.println("\n-----------------------");
		
		//sort 정렬도 해준다. 중복도 제거했음 
//		Iterator<Person> itr = tree.iterator();
//		while(itr.hasNext()) {
//			Person n = itr.next();
//			System.out.print(n.toString() + "\t");
		}
	}
