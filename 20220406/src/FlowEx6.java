import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {

		System.out.print("���� ���� �Է��ϼ���. \n =>\n");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		if		(month < 3 && month ==12)
			System.out.println("������ ������ �ܿ��Դϴ�.");
		else if(month>=9 &&month <=11)
			System.out.println("������ ������ �����Դϴ�.");
		else if(month>=6 &&month <=8)
			System.out.println("������ ������ �����Դϴ�.");
		
		
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("������ ������ ���Դϴ�.");
			break;
		case 6: case 7: case 8:		//�� �ٿ� �ٿ��� �� ���� �ִ�. 
			System.out.println("������ ������ �����Դϴ�.");
			break;
		case 9: case 10: case 11:
			System.out.println("������ ������ �����Դϴ�.");
			break;
		case 12: case 1: case 2:
			System.out.println("������ ������ �ܿ��Դϴ�.");
		default:	//����Ʈ�� ���� �� ���� �ִ�. 
			System.out.println("�߽���");
		}
	} //main�� ��
}
