import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		System.out.print("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���.>");

		Scanner scanner = new Scanner(System.in);

		int result;
		int user = scanner.nextInt();
		int com = (int)(Math.random() * 3) + 1;  //0~0.9999 = ������ ����°� ��ǥ�̹Ƿ�, *3�� �ؼ� 2.99997... �ϸ� ���� 0,1,2 ����ǳ�, ���⼱ 0�� �ʿ����
												// 3�� �� �ʿ��ϱ� ������ ���ϱ� 1�� ���ش�.
		
		System.out.println("����� " + user + "�Դϴ�.");
		System.out.println("���� " + com + "�Դϴ�.");

		result = user - com;

		if(result==2 || result == -1)
			System.out.println("����� �����ϴ�.");
		else if(result==1 || result == -2)
			System.out.println("����� �̰���ϴ�.");
		else if(result==0)
			System.out.println("�����ϴ�..");
		
		/*		
		 * if (com == 1 && user == 1) {
					System.out.println("�����ϴ�. ");
				
					if(com ==2 && user == 1)
					System.out.println("����� �����ϴ�.");
					
					if(com ==1 && user == 2)
						System.out.println("����� �̰���ϴ�.");
			���� �ۼ��� �κ�*/
		
				
//		switch(user-com) { // 1,2,3 ���ڸ� ������ case ���� ����
//		case  2: case -1: 
//			System.out.println("����� �����ϴ�.");
//		break;
//		
//		case  1: case -2: 
//			System.out.println("����� �̰���ϴ�.");
//		break;
//		
//		case 0: 
//			System.out.println("�����ϴ�.");
//		break;
		}	
		
	}



