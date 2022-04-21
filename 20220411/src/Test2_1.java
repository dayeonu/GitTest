
public class Test2_1 {

	public static void main(String[] args) {

			for(int i = 1; i<=10; i++) {
				System.out.printf("i=%d ", i);
				
				int tmp = i;
				
				for(;;) {
					if(tmp %10 %3 == 0 && tmp % 10 != 0) // 나머지 0 그리고 0이 아닌경우 
						System.out.println("짝");
					
					if((tmp /=10) ==0) 
						break;
				}
			} System.out.println();
	} //main의 끝 
}
