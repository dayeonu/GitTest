
public class FlowEx13 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i =1; i<=10; i++) {
			sum += i;
		System.out.printf("1부터 %2d까지의 합: %2d%n", i, sum);
		}
		
		System.out.println("---------------------");
		sum = 0;
		for (int i = 1, j = 10; i<=100; i+=5) {
			sum += i; //sum = sum + i
			System.out.println("1부터 "+ i + " 까지의 합:" + sum );
		}
	
	} // main 의 끝 

}
