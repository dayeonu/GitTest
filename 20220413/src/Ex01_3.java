import java.util.Scanner;

public class Ex01_3 {

		public static void main(String[] args) { // jvm 호출  
//두 정수를 입력받아서 평균을 구하는 프로그램
		
			double result = add(); // 함수 호출
				
				System.out.println("두 수의 평균은 "+ result);
				System.out.println("프로그램 종료");
		}
		
	//입력x 출력o , void(반환형) add(함수이름)
		
		public static double add() { // --> 함수 정의, 함수 몸체 
	
			Scanner sc = new Scanner(System.in);
				
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
			
			return (num1 + num2)/2.0;
			
	}
}
