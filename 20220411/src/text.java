import java.util.Scanner;

public class text {

	public static void main(String[] args) {

	int num =0; int sum = 0;
	
	Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // �Էµ� ���ڸ� tmp�� ����
		num = Integer.parseInt(tmp);	// �Է¹��� ���ڿ� tmp�� ���ڷ� ��ȯ

	 while ( num != 0 ) {
		 num = sum + 1; //num = num + 1   
	 } System.out.println(num );
	} 
}
