
public class Ex02 {

	public static void main(String[] args) {
		// 입력은있고 출력은 없음
		// 구구단 함수 
		
		int input = 4;
		
		int i = 100;
		
		sub(input);
		
		System.out.println("프로그램 종료");
		 
	}

	public static void sub(int n) {
		//서브 함수 안의 변수에서만 허용. => 지역변수 
		//int i = 0; 변수를 밖으로 빼야 sub 함수안에 적용됨.  
		//변수 이름 중복되면 안됨. 
		System.out.println("입력한" + n + "단 출력");		
		
		for(int i = 1; i<=9; i++) // for 안에 있는 i 변수는 for문 안에서만 사용됨. 
			System.out.println((n * i) + " = " + n + " * " + i);
	}
}
