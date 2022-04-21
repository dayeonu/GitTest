
public class FlowEx30 {

	public static void main(String[] args) {
		/*
		 * 숫자를 1부터 계속 더해 나가서 몇 까지 더하면 합이 100을 넘는지 알아내는 예제문
		 */
		
		int sum = 0;
		int i = 0;
		
		while(true) {
			if (sum >100)
				break; // sum의 값이 100을 초과 하면 while문을 벗어나게 된다. 
			
			++i; // 전위형 값. 
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