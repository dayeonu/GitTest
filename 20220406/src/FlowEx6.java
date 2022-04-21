import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {

		System.out.print("현재 월을 입력하세요. \n =>\n");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		if		(month < 3 && month ==12)
			System.out.println("현재의 계절은 겨울입니다.");
		else if(month>=9 &&month <=11)
			System.out.println("현재의 계절은 가을입니다.");
		else if(month>=6 &&month <=8)
			System.out.println("현재의 계절은 여름입니다.");
		
		
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:		//한 줄에 붙여서 쓸 수도 있다. 
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;
		case 12: case 1: case 2:
			System.out.println("현재의 계절은 겨울입니다.");
		default:	//디폴트를 생략 할 수도 있다. 
			System.out.println("잘스셈");
		}
	} //main의 끝
}
