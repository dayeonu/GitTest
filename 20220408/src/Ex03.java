
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1~20 정수중 2 와 3의 배수 뺀 나머지의 총합.

		int sum = 0;
		for( int i = 1; i<=20; i++) { // 1~20까지의 총 합을 구하고, 2의 배수,3의 배수 총합을 뺴면 
//			sum = 210 
			if(i%2 != 0 && i%3 != 0) // 
				sum += i;

		} System.out.println("sum:" + sum);
	
	}

}

