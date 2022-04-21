import java.util.Scanner;

public class Ex01_2 {

		public static void main(String[] args) { // jvm 호출  

			Scanner sc = new Scanner(System.in);
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			int result = add(num1, num2); // 함수 호출
				
				System.out.println("두 수의 합은 "+ (result));
				System.out.println("프로그램 종료");
		}
		
	//입력o 출력o , void(반환형) add(함수이름)
		
		public static int add(int num1, int num2) { // --> 함수 정의, 함수 몸체 
			
			return num1 + num2;
			
	
		}
	}

