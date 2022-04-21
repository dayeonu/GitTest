import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

// 
		if (num > 0)
			System.out.println("양수");
		else if (num < 0)
			System.out.println("양수");
		else
			System.out.println("음수");
		
////////////////////////////////////////////////////////////////////		

		if (num > 0)						
			System.out.println("양수");
		else {
			if (num < 0)					// 중첩 if :가급적 사용 x
			System.out.println("양수");
			else
			System.out.println("음수");
		}
	}
}