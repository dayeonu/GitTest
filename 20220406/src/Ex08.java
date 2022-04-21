import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		// 90이상 A학점 80이상 B학점
		// grade 로 학점 표시
		// jumsu 로 점수 표시
		
		int jumsu = 0;
		System.out.println("점수를 입력하세요:");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); //화면을 통해 입력받은 내용을 tmp에 저장
		jumsu = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환
		
		switch(jumsu/10) {
		case 9: 
			System.out.println("A학점 입니다.");
			break;
		case 8:
			System.out.println("A학점 입니다.");
			break;
		case 7:
			System.out.println("A학점 입니다.");
			break;
		case 6:
		
		default:
			System.out.println("F학점 입니다.");
			break;
		}

	}
}
