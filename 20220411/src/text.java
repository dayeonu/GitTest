import java.util.Scanner;

public class text {

	public static void main(String[] args) {

	int num =0; int sum = 0;
	
	Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 입력된 숫자를 tmp에 저장
		num = Integer.parseInt(tmp);	// 입력받은 문자열 tmp를 숫자로 변환

	 while ( num != 0 ) {
		 num = sum + 1; //num = num + 1   
	 } System.out.println(num );
	} 
}
