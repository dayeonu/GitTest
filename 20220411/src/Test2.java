
public class Test2 {

	public static void main(String[] args) {

		// 3�� ��� 3,6,9 ���� ���� �Ǿ������� ���Ե� ������ŭ �ڼ��� ġ�� 369����
		// 1���� 100����  ���.
		
		for(int i = 1; i<=100; i++) {
			System.out.printf("i=%d", i);
			
			// tmp = tmp/10  15/10 ==> 5
			int tmp = i;
			
			for(; (tmp/=10) != 0;){
				if(tmp %10 %3 == 0 && tmp %10 != 0)
					System.out.print(" ¦ ");
		}
			do {
				if(tmp % 10 % 3 == 0 && tmp % 10 !=0)
					System.out.println("¦");
			} while((tmp /=10) != 0);
			System.out.println();
		} //main
	}
}