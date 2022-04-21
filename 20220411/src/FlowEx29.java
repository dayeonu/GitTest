
public class FlowEx29 {

	public static void main(String[] args) {

		// 3의 배수 3,6,9 등이 포함 되어있으면 포함된 갯수만큼 박수를 치는 369게임
		// 1부터 100까지  허용.
		
		for(int i = 1; i<=100; i++) {
			System.out.printf("i=%d", i);
			
			int tmp = i;
			//tmp(3, 4)
			do { 
				// tmp%10 이 3의 배수인지 확인 0은 제외
				if((tmp %10) %3 == 0 && tmp %10 != 0) //tmp값이 0, 0이 아닐경우 
					// true && true 이면 짝 입력 
					System.out.print(" 짝 ");
				//tmp /= 10은 tmp = tmp /10과 동일
				
			} while((tmp/=10) != 0); 
			 //tmp = tmp/ 10
			// tmp = 0.으로 나오니까 정수 0만 나옴. 
			System.out.println();

		}
	} //main
}
