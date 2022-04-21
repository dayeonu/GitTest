import java.util.Scanner;

public class Ex03_q {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s3 = new String("java");
		String s4 = sc.nextLine();
		
		System.out.println(s3 ==s4); //서로 다른 객체 이기 때문에 . 
		System.out.println(s3.equals(s4));
	}

}
