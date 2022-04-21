
public class Ex01 {

	public static void main(String[] args) {

/* 반복문 3종류의 차이점 
	for : 조건이 거짓이면 실행이 한 번도 안될 수 있다. 
	while : 조건이 거짓이면 실행이 한 번도 안될 수 있다. 
	do-while : 조건이 거짓이여도 최소 1회는 실행
*/	
		
		int sum=0;
	// for (1회만 실행; 조건이 true 일때 반복; 값을 변동)
		
		for (int i = 10; i>0; i--)
			sum += i;
		// sum = sum + i 
		
		System.out.println("sum = " + sum);
	}

}
