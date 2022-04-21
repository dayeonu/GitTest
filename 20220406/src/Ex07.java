import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		System.out.print("점수를 입력해주세요\n =>");
		
		Scanner sc = new Scanner(System.in);
		
		String tmp = sc.nextLine();
		int num = Integer.parseInt(tmp);
		
		
		switch(num) {
		case 1:
			System.out.println("1입력");
			break;
		case 2:
			System.out.println("2입력");
//			break;	
		case 3:
			System.out.println("3입력");
			break;
		case 4:
			System.out.println("4입력");
			break;
	
		default: 
			System.out.println("그 외 입력");
		
		}
	}
}
