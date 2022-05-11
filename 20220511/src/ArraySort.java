
public class ArraySort {

	public static void main(String[] args) {

		
		Person a = new Person("유다연",35);
		System.out.println(a.toString());
		
	}
}


class Person {
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
}