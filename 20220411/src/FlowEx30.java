
public class FlowEx30 {

	public static void main(String[] args) {
		/*
		 * ���ڸ� 1���� ��� ���� ������ �� ���� ���ϸ� ���� 100�� �Ѵ��� �˾Ƴ��� ������
		 */
		
		int sum = 0;
		int i = 0;
		
		while(true) {
			if (sum >100)
				break; // sum�� ���� 100�� �ʰ� �ϸ� while���� ����� �ȴ�. 
			
			++i; // ������ ��. 
			sum +=i; // sum = sum + i 
		
		} //End of while
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}

}
//
// for(int i = 2; i<=9; i++) {
//	 for (int j = 1; j<=9; j++) {
//		 System.out.println(i+j);
//		 if(i==j)break;
//	 }
//	 system.out.println("final---------");
//	}
//}