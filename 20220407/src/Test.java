
public class Test {

	public static void main(String[] args) {

		System.out.println("1" + "2");	//문자 
		System.out.println(true + "");	//문자열 "true"
		System.out.println('A' + 'B');	//char 65 + 66 
		System.out.println('1' + 2);	// 49 + 2 = 51 char < int  형변환 int로 바뀜 
		System.out.println('1' + '2');  // 49 + 50 = 99
		System.out.println('J' + "ava"); // 문자열
//		System.out.println(true + null); --- 오류 발생!
		// 숫자 0은 아스키 값으로 48  __ 0x30 
		// 대문자 A는 아스키 값으로 65
		// 소문자 a는 아스키 값으로 97
		
	}

}
