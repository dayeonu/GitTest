import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		int value = 0;
		int number = 45;
	
		for(int i = 0; i<6; i++) {
			System.out.println((int)(Math.random()*45)+1);
			System.out.println("�ζ� ��ȣ�� �Է� ���ּ���: ");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // �Է¹��� ������ tmp �� ����
		number = Integer.parseInt(tmp);  // �Է¹��� tmp�� ���ڷ� ��ȯ.
		}
		for(int i=1; i<number; i++)
			value = (int)(Math.random()*45) +1; //1~45�� ������ ������
					
		System.out.print(value);
		System.out.println(value);
			} //main�� ��
		}
	

