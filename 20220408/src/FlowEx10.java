import java.util.Scanner;

public class FlowEx10 {

	public static void main(String[] args) {

		int score = 0;
		char grade = ' ';
		
		System.out.println("����� ������ �Է��ϼ��� \n=>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // �Է¹��� ������ tmp �� ����
		score = Integer.parseInt(tmp);  // �Է¹��� tmp�� ���ڷ� ��ȯ.
		
		switch(score/10) {	//int / int�� ����� int�� ���̱⋚���� 88/10 �ϸ� 8.8�� �ƴ϶� 8�� ���´�.
							//���ǽ��� �� ���� case�� ���� ������ ���̴°� ����Ʈ
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'B';
			break;
		default :
			grade = 'F';
			break;
			
		} //end of switch	
		System.out.println("����� ������ "+ "'" + grade +"'" + " �Դϴ�.");

	} 	//main�� ��

}
