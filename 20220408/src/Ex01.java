
public class Ex01 {

	public static void main(String[] args) {

		int sum = 0;

		/*
		 * int i = 1 �� ó�� �ѹ��� �����. for( int i = 1; i<6; i++) �� ���� ����, i�� 5������ ��µ� ������
		 * int i = 1;�� ���ָ� i�� 6���� ��µ�.
		 */

//		for ( ; i<6;  ) {   ���������� ���ϴ�.
//			sum += i++; // sum = sum + i  

		for ( int i = 0; i<5; i++  ) { 
				sum += i;  //sum= sum + i 
			System.out.println("i : " + i + " , sum = " + sum);

		}
//		System.out.println("i = " + i + " Last sum = " + sum);
	}

}
