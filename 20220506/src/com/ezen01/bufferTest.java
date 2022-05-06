package com.ezen01;

public class bufferTest {

	public static void main(String[] args) {

		String subsString = "Java/Programming!!";
		String str = subsString;
		String s = str.substring(5);
		System.out.println(s);
//		String subsString1 = "Java/Programming!!";
//		subsString1.(0,4);
//		System.out.println(subsString1);
		
		StringBuffer sb = new StringBuffer("0123456");
//		sb.delete(3,5);
//		System.out.println(sb);
		
//		sb.insert(3, ".");
//		System.out.println(sb);
//		sb.insert(1,10.5);
//		System.out.println(sb);
		
//		sb.replace(1, 4, "abcd");
//		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	
	}
}
