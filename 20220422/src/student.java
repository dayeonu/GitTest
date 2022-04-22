import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		//5명의 학생이 있습니다.
		//2가지 과목(영어, 수학) 을 입력받아서, 
		//과목별 평균과 학생별 평균을 구하는 프로그램을 만드세요.
		Scanner sc = new Scanner(System.in);
		
		int number = 5;	//인원수
		
		int[][] subject = new int[number][2]; //점수
		int[] totalStudent = new int[number];   // 학생별 점수
		int[] totalSubject = new int[2]; //과목의 점수 
		
		System.out.printf("%d명 영어, 수학 점수 입력:\n", number);
		
		for(int i = 0; i<number; i++) {
			System.out.printf("%d번 영어: ", i+1);
			subject[i][0] = sc.nextInt();	//영어 점수 입력

			System.out.println("	수학: ");
			subject[i][1] = sc.nextInt();  //수학 점수 입력 
			
			totalStudent[i] = subject[i][0] + subject[i][1]; //학생 합계
			totalStudent[0] += subject[i][0]; // 영어 합계
			totalStudent[1] += subject[i][0]; // 수학 합계
		}
		
		System.out.println("No. 	영어	  	수학 		평균");
		for(int i=0; i<number; i++)
			System.out.printf("%2d %6d %6d %6.1f\n", i+1, subject[i][0],
					subject[i][1], (double)totalStudent[i]/2);
		
		System.out.printf("평균 %6.1f %6.1f\n", (double)totalSubject[0]/number,
												(double)totalSubject[1]/number);
	
	
	}

}
