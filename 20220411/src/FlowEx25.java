import java.util.Scanner;

public class FlowEx25 {

	public static void main(String[] args) {

		int num =0; int sum = 0;
		
		System.out.println("num ���ڸ� �Է��ϼ���(�� : 12345)>"); //12345
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // �Էµ� ���ڸ� tmp�� ����
		num = Integer.parseInt(tmp);	// �Է¹��� ���ڿ� tmp�� ���ڷ� ��ȯ
		
		while(num != 0) { 		//num�� 10���� ���� �������� sum�� ���� 
			sum += num % 10;	 //sum = sum + (num%10); num�� 12345
			System.out.printf("sum=%5d \t num=%d%n", sum, num);
			num /= 10;	 //num = num/10; num�� 10���� ���� ���� �ٽ� num�� ������.
			 //num = 12345/10 , num=1234
		}
		System.out.println("�� �ڸ����� ��:" + sum);
	} 
}
