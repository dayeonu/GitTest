import java.util.Scanner;

public class Ex01_3 {

		public static void main(String[] args) { // jvm ȣ��  
//�� ������ �Է¹޾Ƽ� ����� ���ϴ� ���α׷�
		
			double result = add(); // �Լ� ȣ��
				
				System.out.println("�� ���� ����� "+ result);
				System.out.println("���α׷� ����");
		}
		
	//�Է�x ���o , void(��ȯ��) add(�Լ��̸�)
		
		public static double add() { // --> �Լ� ����, �Լ� ��ü 
	
			Scanner sc = new Scanner(System.in);
				
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
			
			return (num1 + num2)/2.0;
			
	}
}
