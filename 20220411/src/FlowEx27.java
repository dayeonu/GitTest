import java.util.Scanner;

public class FlowEx27 {

	public static void main(String[] args) {

		/*
		 * for{
		 * do ~ while
		 * }
		 * 
		 * while{
		 * while}
		 * 
		 * while{
		 * for}
		 * 
		 */

		int num;
		int sum = 0;
		boolean flag = true; 
		
		System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���.(�������� \"0\"�� �Է�)");
		Scanner scanner = new Scanner(System.in);
		
		while(flag) {  //flag�� ���� true�̹Ƿ� ���ǽ��� ���� �ȴ�. 
						//0�� ���� �Է� �Ǳ� ������ ���ǽ� ���ѹݺ���.
			
			System.out.print(">>");

			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);

			if(num != 0 ) {
				sum += num; //num �� 0�� �ƴϸ�, sum�� ���Ѵ�. 

			} else { 
				flag = false; // num�� 0�̸�, while���ǽ���  flag�� ���� false�� �����ϰ�, ���� ������. 
			}
		} //while���� ��
	
		System.out.println("�հ�:" + sum); //while ���� ���� false�� �� �ش� ���� ������ ��. 
	}
}
