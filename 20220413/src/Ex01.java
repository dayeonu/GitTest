import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) { // jvm 호출  

		
			add(); // 함수 호출
			
			System.out.println("프로그램 종료");
	}
	
//입력x 출력x , void(반환형) add(함수이름)
	public static void add() { // --> 함수 정의, 함수 몸체 
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("두 수의 합은 "+ (num1 + num2));
		
	}
}