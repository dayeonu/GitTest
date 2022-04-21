import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		int value = 0;
		int number = 45;
	
		for(int i = 0; i<6; i++) {
			System.out.println((int)(Math.random()*45)+1);
			System.out.println("로또 번호를 입력 해주세요: ");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 입력받은 내용을 tmp 에 저장
		number = Integer.parseInt(tmp);  // 입력받은 tmp를 숫자로 변환.
		}
		for(int i=1; i<number; i++)
			value = (int)(Math.random()*45) +1; //1~45개 랜덤이 생성됨
					
		System.out.print(value);
		System.out.println(value);
			} //main의 끝
		}
	

