import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	//Ű����� �� ������ �Է��� �޾Ƽ�, ������ ����� ����Ѵ�.
		
//		Scanner scanner = new Scanner(System.in);
//		
		System.out.printf("������ �Է��ϼ��� \n=>");
//		int input = scanner.nextInt();
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
		Scanner sc = new Scanner(System.in);
		
		String n1 = sc.nextLine(); //����, ���� �� �Է°��� 
		String n2 = sc.nextLine(); //����, ���� �� �Է°��� 
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		
		int sum = num1 + num2;
		double aver = sum / 2.0;
		
		System.out.println("�հ�:" + sum + "\n���:" + aver);
		}	
	}


