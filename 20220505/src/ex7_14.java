final class Singleton{
	private static Singleton s = new Singleton();
	private Singleton() {}

	public static Singleton getInSingleton() {
		System.out.println(s);
		if(s==null) {
			System.out.println("null");
		return new Singleton();
	}
	return s;
}

}
class SingletonTest{
	public static void main(String[] args) {
		//Singleton s = new Singleton();
		Singleton ss = Singleton.getInSingleton();
		System.out.println(ss);

		Singleton s2 = Singleton.getInSingleton();
		System.out.println(s2);
	}
}

