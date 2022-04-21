
public class Ex01_1 {
	// 2번째 함수에서 입력이 있고 출력은 없는 경우 
	public static void main(String[] args) {
		
		double dnum = 2.0;
		int num2 = 5;
		
		System.out.println("main() 함수!!");
		
		sub(dnum, num2); // 함수 호출  --> 인자값이라고 부름.

		System.out.println("main()2 함수!!"); // 5번 
	}

	
	//public  은 아무거나 접근 할 수 있다는 뜻. 
	//함수가 존재하면 반드시 다른 곳(main 등에서) 호출을 해야한다. 불러온다는 뜻. 
	public static void sub(double i , int j) { //함수의 타입도 동일해야 한다. 큰 -> 작은 형식으로 는 변환가능. 반대는 강제형변환해야함. 
					//(double i , int j) --> 매개 변수라고 부름.
		// 매개 변수 타입과 인자 값의 타입은 동일해야한다.
		
		System.out.println("두 수의 합은" + (i+j)); // 중괄호사용은, 연산자계산이 필요하기때문에.
	} 
}
