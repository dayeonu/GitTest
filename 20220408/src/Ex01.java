
public class Ex01 {

	public static void main(String[] args) {

		int sum = 0;

		/*
		 * int i = 1 은 처음 한번만 실행됨. for( int i = 1; i<6; i++) 이 원래 문장, i는 5까지만 출력됨 밖으로
		 * int i = 1;로 빼주면 i는 6까지 출력됨.
		 */

//		for ( ; i<6;  ) {   직관적이지 못하다.
//			sum += i++; // sum = sum + i  

		for ( int i = 0; i<5; i++  ) { 
				sum += i;  //sum= sum + i 
			System.out.println("i : " + i + " , sum = " + sum);

		}
//		System.out.println("i = " + i + " Last sum = " + sum);
	}

}
