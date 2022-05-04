package LGSamsung;

public interface TV {

	public void PowerOn();
	public void PowerDown();
	public void volumeUp();
	public void volumeDown();
}

/*
 * 	interface TV {
 *	 void powerOn();
 * 티비 전원을 켜는 기능의 메서드 
 * } 
 * 
 */


// 인터페이스는 두 대상(객체)간의 '연결, 대화, 소통'을 돕는 '중간 역할'을 한다.
// 선언(설계)와 구현을 분리시키는 것을 가능케 한다.

// 	class B{
//		public void method() {
//			System.out.println("methodInB");
//	}}


// interface I {
//	public void method();
//	}
//	
//	class B implements I {
//		public void method() {
//			System.out.println("methodInB");
//		}
//	}


// 인터페이스를 이해하려면 먼저 두가지를 기억하자.
//클래스를 사용하는 쪽 (user)과 클래스를 제공하는 쪽(provider) 이 있다.
//메서드를 사용하는 (호출) 쪽(유저)에서는 사용하려는 메서드(provider)의 선언부만 알면 된다.

