
public class Ex06 {

	public static void main(String[] args) {

//문제1) 문자*을 10개를 좌로 붙여서출력, 아래로 5줄 출력
//		for (int i =0; i<5; i++) { //줄
//	
//			for(int j = 0; j<=10; j++) // 열을 10번 반복함
//				System.out.print("*");
//				System.out.println(); //줄 바꿈
	


//문제2)2~9 까지 구구단
//		for(int i = 2; i<10; i++) {
//			
//			for(int j = 1; j<10; j++)
//				System.out.println(i + "*" + j + "= " + i*j);
//			System.out.println();
//
//		

//문제3) 2단 2줄만 출력, 3단은 3단만 출력, 4단은 4단만 출력
//		for(int i = 2; i<10; i++) {
//			
//			for(int j = 1; j<=i; j++)
//				System.out.println(i + "*" + j + "= " + i*j);
//		
//			System.out.println(); //줄 띄움
		
//문제4) 
//		*
//		**
//		***
//		****
//		*****  모양 출력하기
		
		for(int i = 0; i<5; i++) {
			for (int j = 0; j<=i; j++)
				System.out.print("*");  // print와 println 차이~
			System.out.println(); //줄 띄움
		
		}
	}
}


