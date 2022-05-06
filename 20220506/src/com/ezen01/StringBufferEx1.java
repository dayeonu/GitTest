package com.ezen01;

public class StringBufferEx1 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		
		System.out.println("sb == sb2 ? " + (sb == sb2)); // 주소값을 비교. 
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2)); //문자열을 비교하지 못하고 toString에 넣어서 값을 비교할 수만 있다. 
		
		String s = sb.toString();  // 문자열 값을 비교하기 위해서 toString을 선언했다. 
		String s2 = sb2.toString();
	
		System.out.println("s.equals(s2) ? " + s.equals(s2));
	}

}
