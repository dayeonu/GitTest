import java.util.Scanner;

public class LunchMental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int retry = 0;
		System.out.println("암산하자");

		do {
			int x = (int)(Math.random()*100)+1;
			int y = (int)(Math.random()*100)+1;
			int z = (int)(Math.random()*100)+1;

			int num = (int)(Math.random()*4);

			int answer = 0;

				switch(num) {
				case 0 : answer = x + y + z; break;
				case 1 : answer = x + y - z; break;
				case 2 : answer = x - y + z; break;
				default : answer = x - y - z; break;
				}
			
			System.out.println("case" + num);
			
				while(true) {
					System.out.print(
							x + ( (num<2) ? " + " : " - ") +
							y + ( (num % 2 == 0) ? " + " : " - ") +
							z + " = "
							);
	
					int an = sc.nextInt();
					if( an == answer) break;
					System.out.println("오답입니다.");
				}
			
			System.out.println("정답입니다.");
			System.out.println("계속(1)/ 중지(0)");
			retry = sc.nextInt();
			sc.nextLine();

			} while(retry==1);
			System.out.println("프로그램 종료");
		}
	}
