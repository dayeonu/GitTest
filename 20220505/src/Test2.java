
public class Test2 {

	public static void main(String[] args) {

		Test2_1 t1 = new Test2_1();
		Test2_1 t2 = new Test2_1(10);
		Test2_1 t3 = new Test2_1(10,20);
		Test2_1 t4 = new Test2_1(10,20,30);
		
		System.out.println(t4.a);
		System.out.println(t4.b);
		System.out.println(t4.c);
	}
}


class Test2_1{

	int a,b,c;

	public Test2_1() { //디폴트, 매개변수 0개
		this(0,0,0);
	}
	public Test2_1(int a) { //디폴트, 매개변수 1개
		this(a,0,0);
	}
	public Test2_1(int a, int b) { //디폴트, 매개변수 2개
		this(a,b,0);
	}
	public Test2_1(int a, int b, int c) { //디폴트, 매개변수 3개

		this.a = a;
		this.b = b;
		this.c = c;
	}
}