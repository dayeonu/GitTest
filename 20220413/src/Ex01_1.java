
import java.util.Scanner;

public class Ex01_1 {

	// �� ���� �Է¹޾Ƽ� ���� ���ϴ� ���α׷� 
	public static void main(String[] args) { // jvm ȣ��  

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
			add(num1, num2); // �Լ� ȣ��
			
			System.out.println("���α׷� ����");
	}
	
//�Է�o ���x , void(��ȯ��) add(�Լ��̸�)
	
	public static void add(int num1, int num2) { // --> �Լ� ����, �Լ� ��ü 
		
		System.out.println("�� ���� ���� "+ (num1 + num2));
		
	}
}