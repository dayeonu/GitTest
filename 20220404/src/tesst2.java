
public class tesst2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		int i = 10;
//		
//		int j = 0;
//		
//		i = i-1;
//		i -=1;
//		
//		i--;
//		--i;
//		
//		System.out.println(i);
//		
//		j = i--;
//		
//		System.out.println(j + " , " + i); 
		
		int value7 = 3;
		int value8 = 4;
		int value9 = 2 + value7-- + ++value8; // 후위형 --는 값을 먼저 가져온다. .. value7의 값은3 이다. 
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
	}

}
