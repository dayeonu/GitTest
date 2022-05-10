package com.ezen.ex01;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {

		Queue<String> que = new LinkedList<String>();
		
		que.offer("box");
		que.offer("toy");
		que.offer("robot");
		System.out.println(que);
		System.out.println(que.peek());
	
		System.out.println(que);
		System.out.println(que.poll());
	
		System.out.println(que);
		System.out.println(que.poll());

		System.out.println(que);
		System.out.println(que.poll());
	
		System.out.println(que);
		System.out.println(que.poll());
	
		System.out.println(que);
		System.out.println(que.poll());
		System.out.println(que.peek()); // null 지정된 값이 없다고 표시됨. 
	
	}
}
