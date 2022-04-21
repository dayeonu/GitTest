import java.util.Arrays;

public class test4 {

	public static void main(String[] args) {
//다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
	
//*** 아래와 같은 패턴을 외우기***
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		//
		for(int i = 0; i<ballArr.length; i++) { //10번 
			int j = (int)(Math.random() * ballArr.length); //0~9번 추출
			int tmp=0; 
//1) 알맞은 코드를 넣으시오
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		System.out.println(Arrays.toString(ballArr));

		//			System.out.println(ballArr.length);
		//			System.out.println(ball3.length);
		//				
//2) 배열ballArr의 앞에서 3개의 수를 배열 ball3으로 복사한다.

		for(int i=0; i<3; i++)
			ball3[i] =ballArr[i];

		for(int i = 0; i<ball3.length; i++) {

			System.out.print(ball3[i]);
		}
	}
}