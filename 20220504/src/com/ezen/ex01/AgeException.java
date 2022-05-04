package com.ezen.ex01;
import java.util.Scanner;

class ReadAgeException extends Exception{ // 예외처리 클래스 ReadAgeException를 가지고  상속시 가장 상위 클래스인 Exception 을 부모자리에 써줘야함 
	public ReadAgeException() {
		super("유효하지 않은 나이가 입력되었습니다.");
	}
}

public class AgeException {
	public static void main(String[] args) {

		System.out.println("나이 입력: ");

		try {
			int age = readAge();
			System.out.println("입력된 나이: " + age);

		}catch(ReadAgeException e) {
			System.out.println(e.getMessage());
		}
	}

	private static int readAge() throws ReadAgeException{ 
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if(age<0)
			throw new ReadAgeException(); // 객체 생성되어 상위 클래스 호출을 하고 
		return age;
	}
}
