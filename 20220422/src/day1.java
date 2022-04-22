import java.util.Random;
import java.util.Scanner;
public class day1 {

	public static void main(String[] args) {

		Random rand = new Random();		
		Scanner sc = new Scanner(System.in);
		
		String[] DayKor = { "일", "월", "화","수","목","금", "토" };
		String[] DayEng = { "sunday", "monday", "tuesday", "wedensday",
							"thursday","friday", "saturday"};
		int retry = 0;
		int last = -1;
		int sucess = 0;
		int failure = 0;
		
		do {
			int day;
			do { 
				day	= rand.nextInt(7);
			} while	(day == last);
			last = day; //last는 마지막에 입력한 값을 저장 (최종요일 저장한 상태)
			
			while(true) {
				System.out.println(DayKor[day] + "요일: ");
				String dayeng = sc.nextLine();

				if(dayeng.equals(DayEng[day])) break;

				System.out.println("오답입니다. 재입력:");
				failure++;
			}
			System.out.println("정답입니다. 재시도(1) / 포기(2)");
			sucess++;
			retry = sc.nextInt();
			sc.nextLine();
			
		} while(retry ==1); 
		System.out.printf("성공(%d)/실패(%d)", sucess, failure);
		System.out.println("프로그램 종료! ");
	}
}
		
		
		
