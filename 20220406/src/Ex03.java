import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String str = sc.next();
		if(num > 0) {
			System.out.println("���");
			System.out.println("��Ȯ�մϴ�");
		} // �� ���ǿ��� Ȱ��ȭ ��ų ��� �߰�ȣ {} �� �־��ش�. 
		else if (num < 0)
			System.out.println("����");
		else
			System.out.println("��");
//		if(num == 0)
//			System.out.println("��");
//
//		if(num <0)
//			System.out.println("����");
	
	}

}
