
public class Ex01 {

	public static void main(String[] args) {

		int sum = 0;
		int i =1;

		for(i=1; i<=100; i++) { //100번 회전하는데 sum값이 100 초과 되면 break 됨. 
			if(sum > 100) break; // 반복문을 벗어나게 해주는 break
			
			sum += i;
		}
			System.out.println("회전횟수:" + i + "," + "sum:" + sum);
			
			//if ( i%2 == 1) 나머지가 0이면 짝수 , 나머지가 1이면 홀수 
			// continue; 
			//sum += i;  홀수의 합
		}
	}

