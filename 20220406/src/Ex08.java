import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		// 90�̻� A���� 80�̻� B����
		// grade �� ���� ǥ��
		// jumsu �� ���� ǥ��
		
		int jumsu = 0;
		System.out.println("������ �Է��ϼ���:");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); //ȭ���� ���� �Է¹��� ������ tmp�� ����
		jumsu = Integer.parseInt(tmp); // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
		
		switch(jumsu/10) {
		case 9: 
			System.out.println("A���� �Դϴ�.");
			break;
		case 8:
			System.out.println("A���� �Դϴ�.");
			break;
		case 7:
			System.out.println("A���� �Դϴ�.");
			break;
		case 6:
		
		default:
			System.out.println("F���� �Դϴ�.");
			break;
		}

	}
}
