import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		String str = sc.nextLine();			//nextLine 정수, 스트링 가능 
//		
//		if(str.equals("yes"))				//대소문자 구별. 
//			System.out.println("정답입니다.");
//	
//		else
//			System.out.println("소문자가 아닙니다.");
//		
		if(str.equalsIgnoreCase("yes")) 	//대소문자 구별안함. 
			System.out.println("정답입니다.");
	System.out.println("11111");  //무조건 실행 되는 문장. 
	}

}
