package LGSamsung;

public class SamsungTV implements TV{
	//1. class 클래스 이름 implements 인터페이스 이름{
	//인터페이스에 정의된 추상 메서드를 구현해야한다.
	
	//1.1 인터페이스에 정의된 추상메서드를 완성해야한다.
	
	//1.2 상속과 구현이 동시에 가능하다.
	
	// 인터페이스를 구현하는 것은 클래스를 상속받는 것 과 같다/
	// 다만 extends를 쓰는 대신, 
	// implements를 사용한다.
	
	@Override
	public void PowerOn() {
		System.out.println("sam-----on");
	}

	@Override
	public void PowerDown() {
		System.err.println("sam------off");
	}

	@Override
	public void volumeUp() {
		System.out.println("vol------up");
	}

	@Override
	public void volumeDown() {
		System.out.println("vol-----down");
	}
}
