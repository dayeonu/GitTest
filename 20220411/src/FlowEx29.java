
public class FlowEx29 {

	public static void main(String[] args) {

		// 3�� ��� 3,6,9 ���� ���� �Ǿ������� ���Ե� ������ŭ �ڼ��� ġ�� 369����
		// 1���� 100����  ���.
		
		for(int i = 1; i<=100; i++) {
			System.out.printf("i=%d", i);
			
			int tmp = i;
			//tmp(3, 4)
			do { 
				// tmp%10 �� 3�� ������� Ȯ�� 0�� ����
				if((tmp %10) %3 == 0 && tmp %10 != 0) //tmp���� 0, 0�� �ƴҰ�� 
					// true && true �̸� ¦ �Է� 
					System.out.print(" ¦ ");
				//tmp /= 10�� tmp = tmp /10�� ����
				
			} while((tmp/=10) != 0); 
			 //tmp = tmp/ 10
			// tmp = 0.���� �����ϱ� ���� 0�� ����. 
			System.out.println();

		}
	} //main
}
