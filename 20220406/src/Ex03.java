import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String str = sc.next();
		if(num > 0) {
			System.out.println("양수");
			System.out.println("정확합니다");
		} // 이 조건에만 활성화 시킬 경우 중괄호 {} 을 넣어준다. 
		else if (num < 0)
			System.out.println("음수");
		else
			System.out.println("영");
//		if(num == 0)
//			System.out.println("영");
//
//		if(num <0)
//			System.out.println("음수");
	
	}

}
