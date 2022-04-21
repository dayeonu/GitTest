import java.util.Scanner;

public class test {

		public static void main(String[] args) {
			
			//객체		 //객체생성 -> new 클래스로 클래스 객체생성
			Scanner sc = new Scanner(System.in);
				
			String name = sc.nextLine(); 	// 입력 내용을 name에 저장
			System.out.println(name); 		// 입력 받은 내용을 출력
			
			//sc.nextLine();
			
			String input = sc.nextLine();
			int num = Integer.parseInt(input);
			System.out.println(num);

			
			
		}
}
