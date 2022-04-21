
public class Ex04 {

	public static void main(String[] args) {

//		1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 떄, 몇 까지 더해야 총 합이 100 이상 되는지
	
	int sum = 0; //합계
	int i = 0;  
	int sign = 1; //양수, 정수 표시 
	int tmp=0;// 빈공간 
	
	for (i=1; true; i++, sign = -sign) { //sign 1, -1,1,-1....
		
		tmp = i*sign;
		sum += tmp;
		
		if(sum>=100) //합계가 100이 넘어가면 스톱
			break;
		
	}
	System.out.println(i);
	System.out.println(sum );
	
	}

	
}
