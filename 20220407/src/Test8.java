
public class Test8 {

	public static void main(String[] args) {

		int fahrenheit = 100; //화씨         C = 5/9 *(f-32) 
		float celcius = (int)(((float)5/9 * (fahrenheit -32))*(100)+0.5f)/100f;
		
		
		System.out.println("Fahrenheit:"+ fahrenheit);
		System.out.println("Celcius:"+ celcius);
	
		
		/*화씨를 섭씨로 변환하는 코드.
		 * C = 5/9 *(f-32) 
		 * 소수점 3번째 자리 반올림하기.
		 * Math.round 사용하지 않음
		 */
	}

}
