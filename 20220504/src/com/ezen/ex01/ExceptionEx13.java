package com.ezen.ex01;

public class ExceptionEx13 {

	public static void main(String[] args) throws Exception { //jvm이 받아서 처리
		int a = 100;
		int b;
		
		try {
			b = a/10;
//		method1();
	} catch (Exception e) {
//		System.out.println("method1메서드에서 예외가 처리되었습니다.");
		e.printStackTrace();
	} finally {
		System.out.println("무조건 실행 ");
	}
		System.out.println("dsfds");
	}
		static void method1() throws Exception {
			throw new Exception();
	}
}
