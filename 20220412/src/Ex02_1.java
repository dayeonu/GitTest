
public class Ex02_1 {
//
//	public static void main(String[] args) {
//	1) 입력x, 출력x 형태문. 
//	
//		gugudan(); // 호출문
//	}
//	
//
//	public static void gugudan() { // 기본 함수 포맷 , 반환 값이 없으므로 return값 쓸필요없다.
////		반환 값이 int형 이라면, void 자리도 int인 동일한 자료값으로 변경해줘야한다. 
////		
////		return 10; 
//		int n = 3;
//		
//		System.out.println("입력한"+ n + "단 출력");
//		for(int i =1; i<=9; i++)
//			System.out.println(n*i);
//	}
//}

//public static void main(String[] args) {
////2)입력o, 출력x 형태문. 
//
//	int input= 3;
//	gugudan(input); // 호출문
//}
//
//public static void gugudan(int n) { // 기본 함수 포맷 , 반환 값이 없으므로 return값 쓸필요없다.
////	반환 값이 int형 이라면, void 자리도 int인 동일한 자료값으로 변경해줘야한다. 
//	
//	System.out.println("입력한"+ n + "단 출력");
//	for(int i =1; i<=9; i++)
//		System.out.println(n*i);
//}
//}
//	
//public static void main(String[] args) {
//// 3)입력o, 출력o 형태문. 
//
//	int input=3;
//
//	boolean flag = gugudan(input); // 호출문
//
//		if(flag == true)
//			System.out.println("출력성공");
//		else
//			System.out.println("출력실패");
//}
//
//public static boolean gugudan(int n) { 
//
//	boolean flag = true;
//
//	System.out.println("입력한"+ n + "단 출력");
//	
//		for(int i =1; i<=9; i++) 
//			System.out.println(n*i);
//
//	return flag; 
//}
//}

public static void main(String[] args) {
	// 4)입력x, 출력o 형태문. 

	boolean flag = gugudan(); // 호출문

		if(flag == true)
			System.out.println("출력성공");
		else
			System.out.println("출력실패");
}

public static boolean gugudan() { 

	boolean flag = true;
	int n = 3;

	System.out.println("입력한"+ n + "단 출력");
	for(int i =1; i<=9; i++) 
		System.out.println(n*i);

	return flag; 
}
}