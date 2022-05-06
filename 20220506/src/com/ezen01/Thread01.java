package com.ezen01;

public class Thread01 {

	public static void main(String[] args) {
		
//		Thread ct = Thread.currentThread();
//		String name = ct.getName();
//		System.out.println(name);
		System.out.println("-----------------------------");
		//람다식
		//쓰레드 만들었음. 
//	Runnable task = () ->{
//		int n1 = 10;
//		int n2 = 20;
//		String name = Thread.currentThread().getName();
//		System.out.println(name + ",");
//	};
//	
//	Thread t = new Thread(task);
//	t.start();
//	System.out.println("end : " + Thread.currentThread().getName());
		System.out.println("-----------------------------");
		
		Runnable task1 = () ->{
			for(int i =0; i<20; i++) {
			if(i%2 ==0)
					System.out.println(i+ " ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};
		Runnable task2 = () ->{
			for(int i =0; i<20; i++) {
			if(i%2 == 1)
					System.out.println(i+ " ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
			}
		};
		 Thread r1 = new Thread(task1);
		 Thread r2 = new Thread(task2);
		 r1.start();
		 r2.start();
		 //task1 과 task2 가 함께 멀티로 실행된다는 내용!!!
		 
	}
}
