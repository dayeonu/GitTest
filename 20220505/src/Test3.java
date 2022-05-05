
public class Test3 {

	public static void main(String[] args) {

	 A a = new A();
	 a.tset();
	 a.tsetA();
//	 
//	 A a1 = new B();
//	 a1.tsetA();
//	 a1.tset();
//	 
	 A a2 = new C();
	 a2.tsetA();
	 a2.tset();
//	 
//
//	 //강제 형변환 
//	 B bb = (B)a1;
//	 bb.tsetB();
//	 bb.tsetA();
//	 
//	 System.out.println(bb.a);
//	 System.out.println(bb.b);
//	 
//	 //B b = new A();
//	 B b1 = new B();
//	 B b2 = new C();
//	 System.out.println(b2.a);
//	 
//	
//	 //C c = new A();
//	 //C c1 = new B();
//	 C cc = (C)a2;
//	 System.out.println(cc.a);
//	 System.out.println(cc.b);
//	 cc.tsetA();
	}
}

class A{
	int a = 1;
	
	A(){}
	A(int a) {
		this.a = a;
	}
	void tsetA() {
		System.out.println("A클래스의 A메서드 입니다.");
	}
	void tset() {
		System.out.println("A클래스의 테스트메서드 입니다.");
	}
}

class B extends A{
	int b =2;
	
	B(){}
	B(int a, int b) {
		super(a);
		this.b = b;
	}	
	void tsetB() {
		System.out.println("B클래스의 B메서드 입니다.");
	}
	void tset() {
		System.out.println("B클래스의 테스트메서드 입니다.");
	}
}
class C extends B{
	int c = 3;
	
	C(){}
	C(int a, int b, int c) {
		super(a,b);
		this.c = c;
	}
	void tsetC() {
		System.out.println("C클래스의 C메서드 입니다.");
	}
	void tset() {
		System.out.println("C클래스의 테스트메서드 입니다.");
	}
}