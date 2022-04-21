
public class Ex01 {

	/*
	 * 메서드: 함수에서 입력과 출력이 둘다 없는경우 
	*/
	
	//메인함수. 
	// 중복되는 문장을 뽑아 사용하기 위해  함수를 ㅅㅏ용한다. 
	public static void main(String[] args) {
		
		System.out.println("main() 함수!!");
		sub2(); // 1번실행. 서브 함수를 호출함. 서브 함수로 제어권이 넘어감. 메인 자리에서 호출해야 콘솔창에 나옴. 
				// 서브 함수내용이 호출되면 다시 메인으로 돌아온다. 
		System.out.println("끝"); // 5번 
	}

	
	//public  은 아무거나 접근 할 수 있다는 뜻. 
	//함수가 존재하면 반드시 다른 곳(main 등에서) 호출을 해야한다. 불러온다는 뜻. 
	public static void sub() {
		System.out.println("서브 함수 입니다.");//3번 
	} 
	public static void sub2() { 
		sub(); // 2번. 호출된 sub로 올라 갔다가, 아래 문장으로 내려온다. 
		System.out.println("서브 함수2 입니다. "); //4번 
	}
}
