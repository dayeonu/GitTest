import java.util.Scanner;

public class Ex01_2 {

		public static void main(String[] args) { // jvm ȣ��  

			Scanner sc = new Scanner(System.in);
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			int result = add(num1, num2); // �Լ� ȣ��
				
				System.out.println("�� ���� ���� "+ (result));
				System.out.println("���α׷� ����");
		}
		
	//�Է�o ���o , void(��ȯ��) add(�Լ��̸�)
		
		public static int add(int num1, int num2) { // --> �Լ� ����, �Լ� ��ü 
			
			return num1 + num2;
			
	
		}
	}

