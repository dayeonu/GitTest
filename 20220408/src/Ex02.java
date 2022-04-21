import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");

		Scanner scanner = new Scanner(System.in);

		int result;
		int user = scanner.nextInt();
		int com = (int)(Math.random() * 3) + 1;  //0~0.9999 = 정수를 만드는게 목표이므로, *3을 해서 2.99997... 하면 정수 0,1,2 도출되나, 여기선 0이 필요없고
												// 3이 또 필요하기 때문에 더하기 1을 해준다.
		
		System.out.println("당신은 " + user + "입니다.");
		System.out.println("컴은 " + com + "입니다.");

		result = user - com;

		if(result==2 || result == -1)
			System.out.println("당신이 졌습니다.");
		else if(result==1 || result == -2)
			System.out.println("당신이 이겼습니다.");
		else if(result==0)
			System.out.println("비겼습니다..");
		
		/*		
		 * if (com == 1 && user == 1) {
					System.out.println("비겼습니다. ");
				
					if(com ==2 && user == 1)
					System.out.println("당신이 졌습니다.");
					
					if(com ==1 && user == 2)
						System.out.println("당신이 이겼습니다.");
			내가 작성한 부분*/
		
				
//		switch(user-com) { // 1,2,3 숫자를 가지고 case 값을 만듦
//		case  2: case -1: 
//			System.out.println("당신이 졌습니다.");
//		break;
//		
//		case  1: case -2: 
//			System.out.println("당신이 이겼습니다.");
//		break;
//		
//		case 0: 
//			System.out.println("비겼습니다.");
//		break;
		}	
		
	}



