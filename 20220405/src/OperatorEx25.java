import java.util.Scanner;

public class OperatorEx25 {

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		char ch = ' ';
//		System.out.println("문자를 하나 입력하세요.>");
//
//		String input = scanner.nextLine();
//		ch = input.charAt(0);
//
//		if('0' <= ch && ch <= '9') {
//			System.out.printf("입력하신 문자는 숫자입니다.%n");
//		}
//
//		if(('a'<=ch && ch<='z') || ('A' <= ch && ch<= 'Z')) {
//			System.out.printf("입력하신 문자는 영문자입니다.%n");
//		}
 		
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		String str = "Korea";
		System.out.println(str.charAt(0));  // 문자의 한글자를 도출하되, 문자의왼쪽첫번째 자리가 0의 자리입니다.

		System.out.printf("문자를 하나 입력하세요.>");
		String input = scanner.nextLine();
		ch = input.charAt(0);   // 문자의 한글자를 도출하되, 0번째 자리의 문자를 도출하여, 숫자와 영문자로 결과를 알려준다.

		if('0' <= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}

		if(('a'<=ch && ch<='z') || ('A' <= ch && ch<= 'Z')) {
			System.out.printf("입력하신 문자는 영문자입니다.%n");
		}
		// main

	}
}