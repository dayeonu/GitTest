import java.util.Scanner;

public class FlowEx10 {

	public static void main(String[] args) {

		int score = 0;
		char grade = ' ';
		
		System.out.println("당신의 점수를 입력하세요 \n=>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 입력받은 내용을 tmp 에 저장
		score = Integer.parseInt(tmp);  // 입력받은 tmp를 숫자로 변환.
		
		switch(score/10) {	//int / int의 결과는 int의 값이기떄문에 88/10 하면 8.8이 아니라 8이 나온다.
							//조건식을 잘 만들어서 case의 문의 갯수를 줄이는게 베스트
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'B';
			break;
		default :
			grade = 'F';
			break;
			
		} //end of switch	
		System.out.println("당신의 학점은 "+ "'" + grade +"'" + " 입니다.");

	} 	//main의 끝

}
