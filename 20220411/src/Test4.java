import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자 입력 종료: 0");
		
		String  tmp = sc.nextLine();
		int num = Integer.parseInt(tmp);
		
		if ( num == 0) break;
		
		System.out.println("첫번째 숫자 입력:");
		int num1 = sc.nextInt();

		System.out.println("두번째 숫자 입력:");
		int num2 = sc.nextInt();

		System.out.println("연산자 입력:");
		String sign = sc.next();

	 
		
		if(sign.equals("+")) {
			System.out.println("두 수를 더한 값:" + (num1 + num2));
		}	
		else if(sign.equals("-")) {
			System.out.println("두 수를 뺀 값:" +(num1 - num2));
		}
		else if(sign.equals("*")) {
			System.out.println("두 수를 곱한 값:" +(num1 * num2));
		}
		else if(sign.equals("/")) {
			System.out.println("두 수를 나눈 값:" +(num1 / num2));
		}	 
	}}
}
//	
//		int num = 0;
//		int sum = 0;
//		int i = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		String ch = sc.nextLine();
//		Scanner sc1 = new Scanner(System.in);
//		String ch1 = sc1.nextLine();
//		
//		System.out.println(ch + i + num);
//		System.out.println(ch1 + i + num);
//		
//	} //main 의 끝  equlas. ch(문자열) --> 문자로 변환
//	

//사칙연산 (q 입력 하면 종료)
//sum += 2;
//System.out.println(sum);
//sum *=3;
//System.out.println(sum);
//sum /=2;
//System.out.println(sum);
//sum -=10;
//System.out.println(sum);