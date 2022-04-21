
public class OperatorEx19 {

	public static void main(String[] args) {

		int x = 10;
		int y = 8;
		
//		System.out.printf("%d을 %d로 나누면, %n", x,y);
//		System.out.printf("몫은 %d이고, 나머지는 %d입니다. %n", x/y,x%y);
//		
//		System.out.println(x / y);   //나누기
//		System.out.println(x % y);	//나누기 몫
//		System.out.println(x % -y); //부호는 무시된다. 
//		
		System.out.println( x > y);
		System.out.println( x < y);
		System.out.println( x >= y);  //부호는 크거나 같다 로 표현해야 함. => 이 표현은 틀림.
		System.out.println( x <= y);  // 부호는 작거나 같다 로 표현해야 함. =< 이 표현은 틀림.
	
		System.out.println( x == y);  // false -- x와 y값이 같은 경우 false
		System.out.println( x != y);  // true  -- x와 y값이 다른 경우 true
		
		
		
	}
}
