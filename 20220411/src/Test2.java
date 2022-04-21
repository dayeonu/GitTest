
public class Test2 {

	public static void main(String[] args) {

		// 3의 배수 3,6,9 등이 포함 되어있으면 포함된 갯수만큼 박수를 치는 369게임
		// 1부터 100까지  허용.
		
		for(int i = 1; i<=100; i++) {
			System.out.printf("i=%d", i);
			
			// tmp = tmp/10  15/10 ==> 5
			int tmp = i;
			
			for(; (tmp/=10) != 0;){
				if(tmp %10 %3 == 0 && tmp %10 != 0)
					System.out.print(" 짝 ");
		}
			do {
				if(tmp % 10 % 3 == 0 && tmp % 10 !=0)
					System.out.println("짝");
			} while((tmp /=10) != 0);
			System.out.println();
		} //main
	}
}