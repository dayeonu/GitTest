import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���� �Է� ����: 0");
		
		String  tmp = sc.nextLine();
		int num = Integer.parseInt(tmp);
		
		if ( num == 0) break;
		
		System.out.println("ù��° ���� �Է�:");
		int num1 = sc.nextInt();

		System.out.println("�ι�° ���� �Է�:");
		int num2 = sc.nextInt();

		System.out.println("������ �Է�:");
		String sign = sc.next();

	 
		
		if(sign.equals("+")) {
			System.out.println("�� ���� ���� ��:" + (num1 + num2));
		}	
		else if(sign.equals("-")) {
			System.out.println("�� ���� �� ��:" +(num1 - num2));
		}
		else if(sign.equals("*")) {
			System.out.println("�� ���� ���� ��:" +(num1 * num2));
		}
		else if(sign.equals("/")) {
			System.out.println("�� ���� ���� ��:" +(num1 / num2));
		}	 
	}}
}
//	
//		int num = 0;
//		int sum = 0;
//		int i = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		String ch = sc.nextLine();
//		Scanner sc1 = new Scanner(System.in);
//		String ch1 = sc1.nextLine();
//		
//		System.out.println(ch + i + num);
//		System.out.println(ch1 + i + num);
//		
//	} //main �� ��  equlas. ch(���ڿ�) --> ���ڷ� ��ȯ
//	

//��Ģ���� (q �Է� �ϸ� ����)
//sum += 2;
//System.out.println(sum);
//sum *=3;
//System.out.println(sum);
//sum /=2;
//System.out.println(sum);
//sum -=10;
//System.out.println(sum);