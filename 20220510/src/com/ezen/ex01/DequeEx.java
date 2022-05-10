package com.ezen.ex01;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * 
 */
public class DequeEx {

	public static void main(String[] args) {

		Deque<String> deq = new ArrayDeque<String>();
		
//		deq.offerLast("1.box");
//		deq.offerLast("2.toy");
//		deq.offerLast("3.robot");
//		System.out.println(deq);
		deq.offerFirst("box");
		deq.offerFirst("toy");
		deq.offerFirst("robot");
		System.out.println(deq);
		
//poll로 동작하게 함 
//		System.out.println(deq.pollFirst());
//		System.out.println(deq.pollFirst());
//		System.out.println(deq.pollFirst());

//		//	 	que로 동작하게 함. 		
//		System.out.println(deq.pollLast());
//		System.out.println(deq.pollLast());
//		System.out.println(deq.pollLast());
	}
}
