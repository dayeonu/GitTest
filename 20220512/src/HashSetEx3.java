import java.util.HashSet;
import java.util.Objects;

public class HashSetEx3 {

	public static void main(String[] args) {

		HashSet set = new HashSet();

		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		System.out.println(set);
	}

}
class Person{

	String name;
	int age;

	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//중복확인
	public boolean equals(Object obj) {
		Person tmp = (Person)obj;
		return name.equals(tmp.name) && age == tmp.age ? true : false;
	}

	public String toString() {
		return name + " ," +age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
}