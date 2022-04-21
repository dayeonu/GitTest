import java.util.Arrays;

public class ArrayEx10 {

	public static void main(String[] args) {
		
		//정수의 배열 5개 생성, 초기화는 랜덤함수 통해서 1~100 사이값을 저장 및 출력
		int[] num = new int[5];

		for(int i =0; i<num.length;  i++)
			num[i] = (int)(Math.random()*99)+1;

		System.out.println(Arrays.toString(num));
		
		
	//sort(작은 순 정렬)
		
		for( int i = 0; i<num.length-1; i++) { // 0~4 
			
			for( int j= i + 1;  j<num.length; j++) { //4
				
				if( num[i] > num[j] ) {	//왼쪽의 값이 크면 두수를 비교해서 바꾼다 
					int tmp = num[i]; 	
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		} System.out.println(Arrays.toString(num));
		
		
}}