import java.util.Scanner;

public class if������_�׽�Ʈ {

	public static void main(String[] args) {

		//fee , rate,  age,  ���� ����
		// �ִ��� �ܼ��ϰ� ó���� �� �ִ� �������� �ڵ����� �����ϴ°�. 
		
//		int age = 0;
//
//		Scanner scanner = new Scanner(System.in);
//		age = scanner.nextInt();
//
//		int rate =100; 
//		int charge = 2500;
//		int fee=0;
//		
//		switch(age) {  
//		case 0 : case 1 : case 2 : case 3 : 
//			fee = charge * rate;
//			
//		case 4 : case 5 : case 6 : case 7 : 
//			fee = charge * (rate/2);
//		
//		default: 
//			fee = 0;
//			}
//		System.out.println(fee);

		int user = 0;
		int charge = 2500;
		double discount = 0;
		int num;
		
		if ( user >= 4 && user <=13 )  
			discount = 0.5;
		
		else if ( user >= 14 && user <=19 ) 
			discount = 0.25;
		
		else if ( user >= 20 && user <=64) 
			discount = 0;
		
		num = (int)(charge *(1-discount)); 
		System.out.println(user +"�� "+ num+"��");
	
	
	} //end of main
}
