import java.util.Scanner;

public class Day {

	public static void main(String[] args) {

		/*
		 * 스캐너 입력받고 요일 배열 생성해주고 출력문 만들기
		 */		
		
		Scanner sc = new Scanner(System.in);
		
		String[] day = { "일","월","화","수","목","금","토" };
		String[] dayEng = { "sunday","monday","tuesday","wedenday","thursday","firday","saturday" };
		
		System.out.println("요일을 입력하세요");
		String input = sc.nextLine();
		//사용자에게 입력 받은 월이 배열 내용과 같은 지 비교
		
		do { 
			if(input.equals(day[dayEng]);
		
		while(true) {
			System.out.println((input+1) +"요일");
			String qus = sc.nextLine();
			
			if(qus.equals(num[day])) break;
			
		}
	
	}

}
