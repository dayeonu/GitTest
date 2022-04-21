
public class Test10 {

	public static void main(String[] args) {

		char ch = 'K';
		
		//				1조건이 참일 경우, 2번도출, 부정일경우 ch도출 
		//char lowerCase = (1) ? (2) : ch;
		
		
		char lowerCase = ('A' <= ch && ch <='Z') ? (char)(ch+32) :ch;		
		
		System.out.println("ch:"+ ch);
		System.out.println("ch to lowerCase:"+ lowerCase);
	}
	/* 대문자를 소문자로 변경하는 코드인데,
	 * 문자 ch에 저장된 문자가 대문자 인 경우에만 소문자로 변경한다.
	 * 문자코드는 소문자가 대문자보다 32만큼 더 크다. 
	 * 예를 들어 'A'의 코드는 65이고 'a'의 코드는 97 이다.
	 */

}
