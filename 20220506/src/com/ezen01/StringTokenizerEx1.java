package com.ezen01;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String source = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(source, ","); //참조변수
		System.out.println(source + "," + st);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
