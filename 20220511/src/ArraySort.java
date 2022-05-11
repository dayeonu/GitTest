import java.util.Arrays;
public class ArraySort {

	public static void main(String[] args) {

		
		Person[] a = new Person[3];

		a[0] = new Person("김대",35);
		a[1] = new Person("김신유",28);
		a[2] = new Person("남궁신유",25);
		
		Arrays.sort(a);
		
		for( Person p : a)
		System.out.println(p);
	}
}

class Person implements Comparable{
	private String name;
	private int age; 
	
	public Person() {}
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	@Override
	public String toString() {
		return "Person [ name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Object o) { 
		// 두 객체 비교 하기
		Person p = (Person)o; 

		//이름길이로 정렬....
		return this.name.length() -p.name.length();
		
		// 같으면 0, 비교하는 값보다 작으면 -1, 크면 1로 반환하도록 구현 
		//3개 다항식 활용해서 출력하기 
//		return (this.age<p.age ? 1 : this.age>p.age ? -1 : 0);
//		return p.age - this.age; //내림차순
//		return this.age - p.age; //오름차순
		
//		if(this.age > p.age ) return 1;
//		else if(this.age < p.age) return -1;
//		else return 0;
	}
}
