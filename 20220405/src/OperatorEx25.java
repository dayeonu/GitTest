import java.util.Scanner;

public class OperatorEx25 {

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		char ch = ' ';
//		System.out.println("���ڸ� �ϳ� �Է��ϼ���.>");
//
//		String input = scanner.nextLine();
//		ch = input.charAt(0);
//
//		if('0' <= ch && ch <= '9') {
//			System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ�.%n");
//		}
//
//		if(('a'<=ch && ch<='z') || ('A' <= ch && ch<= 'Z')) {
//			System.out.printf("�Է��Ͻ� ���ڴ� �������Դϴ�.%n");
//		}
 		
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		String str = "Korea";
		System.out.println(str.charAt(0));  // ������ �ѱ��ڸ� �����ϵ�, �����ǿ���ù��° �ڸ��� 0�� �ڸ��Դϴ�.

		System.out.printf("���ڸ� �ϳ� �Է��ϼ���.>");
		String input = scanner.nextLine();
		ch = input.charAt(0);   // ������ �ѱ��ڸ� �����ϵ�, 0��° �ڸ��� ���ڸ� �����Ͽ�, ���ڿ� �����ڷ� ����� �˷��ش�.

		if('0' <= ch && ch <= '9') {
			System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ�.%n");
		}

		if(('a'<=ch && ch<='z') || ('A' <= ch && ch<= 'Z')) {
			System.out.printf("�Է��Ͻ� ���ڴ� �������Դϴ�.%n");
		}
		// main

	}
}