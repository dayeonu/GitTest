
public class Ex01_2 {
public static void main(String[] args) {
		//3번 함수에서 입력은 없고 출력만 있는 경우.
		
		System.out.println("main() 함수!!");
		
		double n = sub(); // 함수 호출  --> 인자값이라고 부름.
		
		System.out.println("결과값은 " + n); // 5번 
	}

	//void 자리에는 반환형이 온다. --> void는 반환값이 없다는 것을 명시.
	//void 함수 이름--> 변수이름 중에서 명명한다. 
	public static double sub() {	// --> sub()는 매개변수라고 부른다.  
		// 반환을 int num = 10000을 하려면 ,void자리에 int를 입력한다. 
		
		double dnum = 12.5;
		System.out.println("sub()함수 ....." );  
		
		return dnum; // num을 출력하게 한다.  반환하기 해서 변수에서 받아줘야하니까 . void
	} 
}

