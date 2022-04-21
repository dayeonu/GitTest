
public class Test11 {

	public static void main(String[] args) {
	
//		1번문제 int형 변수 x가 10 보다 크고 20보다 작을 때 True인 조건식 만들기
		int x = 0;
		boolean a = x>10 && x<20;
		System.out.println(a);
	
	
//		2번문제 char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식 만들기
		char ch ='a';
		System.out.println(ch!=' ' && ch!='\t');

//	  	3번문제 char형 변수 ch가 'x'또는 'X'일 때 true인 조건식 
		char ch2 = 'x';
		System.out.println((ch2 =='x') || (ch2 =='X'));
	 
//		4번문제 char 형 변수 ch가 숫자 '0'~'9' 일대 true인 조건식
		char ch3 = '5';
		System.out.println((ch3>='0' && ch3<='9'));
	
//		5번문제 char형 변수ch가 영문자(대문자 또는 소문자) 일떄 true인 조건식
		char ch4  = 'a';
		System.out.println(ch4 >='A' && ch4 <='z' || (ch4 >='a' && ch4 <='z'));
	
//		6번문제 int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지
//		않을 때 true 인 조건식
		int year = 2022;
//		System.out.println((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0 ));
		System.out.println(year % 100 != 0);

//		7번문제 boolean형 변수 powerOn가 flase일 때 true인 조건식
		boolean powerOn = true;
		System.out.println("7 :" + !powerOn); 
		
//		8번 문제 문자열 참조변수 str에 "yes"일 떄 true인 조건식
		String str = "yes";
		System.out.println("s:" + str.equals("yes"));
	
	}

}
