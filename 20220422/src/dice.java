
public class dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 주사위 2개를 던진다.
		// (1,2)
		// (4,5)
		// (6,6)
		// (3,2) ==> break 두 수 합이 5가 되면 종료.

		/*
		 * 랜덤 2번 받기. 더한 두 수가 5가 넘으면 종료
		 * 
		 * set1 = 랜덤함수 set2 = 랜덤함수
		 * 
		 * total = set1 + set2 합계가 = 5 이면 break
		 * 
		 */
		
		while(true) {
			
		int set1 = (int)(Math.random()*7);
		int set2 = (int)(Math.random()*7);
		
		System.out.println("(" + set1 + "," + set2 + ")");

		if((set1 + set2) == 5) break;
		}
	}
}
		
//		do {
//		while ( set1 + set2 != 5)
//			break;
//		System.out.println(set1 + "," + set2);
		
