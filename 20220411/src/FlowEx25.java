import java.util.Scanner;

public class FlowEx25 {

	public static void main(String[] args) {

		int num =0; int sum = 0;
		
		System.out.println("num 숫자를 입력하세요(예 : 12345)>"); //12345
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 입력된 숫자를 tmp에 저장
		num = Integer.parseInt(tmp);	// 입력받은 문자열 tmp를 숫자로 변환
		
		while(num != 0) { 		//num을 10으로 나눈 나머지를 sum에 더함 
			sum += num % 10;	 //sum = sum + (num%10); num은 12345
			System.out.printf("sum=%5d \t num=%d%n", sum, num);
			num /= 10;	 //num = num/10; num을 10으로 나눈 값을 다시 num에 저장함.
			 //num = 12345/10 , num=1234
		}
		System.out.println("각 자리수의 합:" + sum);
	} 
}
