import java.util.Scanner;

//>>해당 월의 영어 단어를 입력하는 프로그램
public class MonthCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] monthString = {
				
					"January", "February", "March", "April", "May", "June",
					"July", "August", "September", "October", "November","December"
								};
		
		System.out.println("해당 월의 영어 단어를 입력하세요."); 
		System.out.println("첫 글자는 대문자, 그 이후는 소문자로 입력"); 
		
		int retry = 0;
		int last = -1; //이전 월
	
		//근데 반복숫자가 나올 수 잇으니 ... 나오지 않게 해봐.!
		do {
			
			int month;
			
			do { //직전 월과 같은 월이면 반복 , 같은 달이 아니라면 do-while을 벗어나는 문장.
				month = (int)(Math.random()*12);
				} while	(month == last);
			last=month;
		
		
			while(true) {
				System.out.print((month+1) + "월"); // 월이 출력되면 찍고, [0]~[11]자리 때문에 +1을 해준거야.
				String qus = sc.nextLine(); //사용자에게 입력을 받아.
				
				if(qus.equals(monthString[month])) break; //--참일 때 break를 만남  
				//문자열이 같은지 대소문자까지 비교해.
					System.out.println("오답입니다."); //--거짓일 때 while문을 빠져나오고, 아래 문자열도 출력함. 
					}
			
			System.out.println("정답입니다. >> 재도전(1) : 그만(0) : ");
			retry = sc.nextInt(); //다시 사용자에게 입력을 받아. #개행문자 
			sc.nextLine(); //엔터를 제거하기 위한 용도
		
		} while(retry ==1 ); // 사용자에게 (1)의 값을 받게 되면, 
		System.out.println("프로그램 종료!");
	}
}