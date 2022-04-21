
public class Ex02 {

	public static void main(String[] args) {

//		int a = 1;
//		int b = 0;
//		
//		int i = 18;
//		System.out.println(a>0 && b>0); //두가지 조건 중에 하나라도 false면 false의 결과값이 나옴
//		System.out.println(a>0 || b>0); //두가지 조건 중에 하나라도 참이면 true 의 결과값이 나옴
//		System.out.println(!(a>0 || b>0)); //두가지 조건 중에 부정
//		System.out.println( i%3 == 0 || ( i%3 == 0 && i%6 !=0) );

		char ch = 95;
		 
		System.out.println( ('a' <= ch && ch >= 'z')  || ('A'<=ch && ch <= 'Z'));
							//아스키코드 a는 97, z는 122 이므로 
							// 97~ 122 ||  65~ 90 까지 비교해서 a 값 97 이면 true 가 된다.
							// 95 이면 false 
	}

}
