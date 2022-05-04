
public class abc {

}

class A{
	int a;
	void testA() {System.out.println("class a");
	public A() {}
	public A(int a) {
		this.a=a;
	}
}

class B extends A{
	int b;
	void testA() {System.out.println("class b");
	public B() {}
	public B(int a,int b) {
		super(a);
		this.b =b;
	}
}

class C extends B{
	int c;
	void testA() {
		super.testA();
		System.out.println("class c");
	public C() {}
	}
}
	
}
	
	
