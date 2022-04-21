import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	//키보드로 두 정수를 입력을 받아서, 총점과 평균을 출력한다.
		
//		Scanner scanner = new Scanner(System.in);
//		
		System.out.printf("정수를 입력하세요 \n=>");
//		int input = scanner.nextInt();
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
		Scanner sc = new Scanner(System.in);
		
		String n1 = sc.nextLine(); //문자, 정수 다 입력가능 
		String n2 = sc.nextLine(); //문자, 정수 다 입력가능 
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		
		int sum = num1 + num2;
		double aver = sum / 2.0;
		
		System.out.println("합계:" + sum + "\n평균:" + aver);
		}	
	}


