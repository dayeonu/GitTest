package com.ezen.ex01;

public class ExceptionTest02 {

	public static void main(String[] args) throws Exception {

		method1();	//같은 클래스내의 static 멤버이므로 객체생성없이 직접 호출가능 
	
	}	//main메서드의 끝

	static void method1() throws Exception{	// 예외가 발생한 곳 
		method2();
	} //method1의 끝
	
	static void method2() throws Exception{
		throw new Exception();
	}
}
