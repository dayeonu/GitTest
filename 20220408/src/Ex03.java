
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1~20 ������ 2 �� 3�� ��� �� �������� ����.

		int sum = 0;
		for( int i = 1; i<=20; i++) { // 1~20������ �� ���� ���ϰ�, 2�� ���,3�� ��� ������ ���� 
//			sum = 210 
			if(i%2 != 0 && i%3 != 0) // 
				sum += i;

		} System.out.println("sum:" + sum);
	
	}

}

