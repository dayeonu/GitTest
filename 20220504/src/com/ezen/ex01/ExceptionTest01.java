package com.ezen.ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest01 {
//비정상적으로 종료되지 않게 하기 위한 예외처리 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력: ");
		int sum = 0;
		
//		int a = 10/num; //예외가 발생한 부분을 try로 감싸준다.
//		에러가 발생할 수 있는 부분에 대해 catch 사용 한다. try와 짝꿍  
		try {
			int num = sc.nextInt();
			int a = 10/num;
			
		} catch(ArithmeticException e) {
			 e.printStackTrace(); 	//e.printStackTrace();는 에러 내용을 찍어준다.  
		} catch(InputMismatchException e) { // 문자열 입력을 가능하게 해준다. 
			e.printStackTrace();
		} catch(Exception e) { //Exception 최상위 클래스라고 봐도 됨 // 어떤처리를 해야할지 알수있기 때문에 하위 예외처리 클래스를 쓴다. 
			e.printStackTrace(); // 예외처리 아이들 을 상단에 배치하고 Exception을 가장 아래 둔다. 
		}finally {
			//예외상황이 발생해서 catch를 타던 안타던, 반드시 실행해야하는 문을 넣는것이 finally이다.
			sc.close();
		}
		
		for(int i = 0; i<=100; i++) 
			sum += i;
			System.out.println("sum =" + sum);
			
		}
	}
