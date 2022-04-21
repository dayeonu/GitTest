import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int sum = 0;
		int i =0;
		int input;
		
		Scanner scanner = new Scanner(System.in);
			
			while(i++ < 5) {
			System.out.println(i + "회 정수 입력:"); 
				input = scanner.nextInt();
			
			sum +=input;
			System.out.println("sum:" + sum);
			
			} 
	}
}