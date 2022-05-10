//https://docs.oracle.com/javase/8/docs/api/
// Interface Queue<E> 에 관련한 API 들 모음 

package com.ezen.ex01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

	public static void main(String[] args) {

		Stack st = new Stack();
		Queue q = new LinkedList();  //Queue 인터페이스의 구현체인 LinkedList를 사용
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("=stack =");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		System.out.println("=Queue=");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
