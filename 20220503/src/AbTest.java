abstract class AA{	 //추상클래스, 추상 클래스 안에는 하나 이상의 추상 메서드가 있다. 
	int a = 10;
	void test() {
		System.out.println("AAAAA");
	}
	
	abstract void func(); //추상 메서드
}

class BB extends AA{
	
	void func() {
		System.out.println("BBBBB");
	}
}

public class AbTest {
	public static void main(String[] args) {
		AA a = new BB();
		//AA타입이 BB를 참조하고 싶은 상황.  
		System.out.println(a.a);
		a.func();
	}
}