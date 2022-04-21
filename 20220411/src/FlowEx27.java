import java.util.Scanner;

public class FlowEx27 {

	public static void main(String[] args) {

		/*
		 * for{
		 * do ~ while
		 * }
		 * 
		 * while{
		 * while}
		 * 
		 * while{
		 * for}
		 * 
		 */

		int num;
		int sum = 0;
		boolean flag = true; 
		
		System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 \"0\"을 입력)");
		Scanner scanner = new Scanner(System.in);
		
		while(flag) {  //flag의 값이 true이므로 조건식은 참이 된다. 
						//0의 값이 입력 되기 전까지 조건식 무한반복함.
			
			System.out.print(">>");

			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);

			if(num != 0 ) {
				sum += num; //num 이 0이 아니면, sum에 더한다. 

			} else { 
				flag = false; // num이 0이면, while조건식의  flag의 값을 false로 변경하고, 문이 끝난다. 
			}
		} //while문의 끝
	
		System.out.println("합계:" + sum); //while 문의 값이 false일 때 해당 문이 나오게 됨. 
	}
}
