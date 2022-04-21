import java.util.Arrays;

public class Q_ex05 {

	public static void main(String[] args) {

		//정수형 배열 5개 선언하고
		// 초기화는 랜덤함수 통해서 1~100 까지 만들기 사이값을 저장 및 출력
		
		int[] num = new int[5];
		
		for(int i =0; i<num.length;  i++)
			num[i] = (int)(Math.random()*100)+1;
			
			System.out.println(Arrays.toString(num));

//최대값 및 최소값 계산 및 출력
//[44,81,95,61,14]
			
//	카드라고 하면 카드끼리 비교해서, 가장 큰수오 ㅏ작은 수를 찾으면됨

			int max = num[0];
			int min = num[0];

// 최대값 출력
			for(int i =0; i<num.length; i++) {
				if(max < num[i]) // true
					max = num[i]; //false 
			}
			System.out.println("Max : " + max);

// 최소값 출력 
			for(int i = 0; i<num.length; i++) {

				if(min > num[i]) //true
					min = num[i]; //false 
			}
			System.out.println("min: " + min);

	}}


