
public class Ex01_3 {

	public static void main(String[] args) {
		//4. 함수에서 입력과 출력 모두 있는 경우 

		int a = 5;
		int b = 10;

		int result = sub(a , b); // 함수 호출  --> 인자값이라고 부름.
		//반환값이 저장될 변수 result를 만들어준다. 
		System.out.println("결과값은 " + result); 
	
	}

	public static int sub(int a, int b) {	// --> sub()는 매개변수라고 부른다.  
		//sub 함수 
		int inum = a * b;

//		return inum; 
		return a * b;  // 도 가능함.  반환값. 
	}
	
}

