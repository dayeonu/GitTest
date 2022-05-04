package com.ezen.ex01;

import java.util.HashSet; // 

public class HashSetEqulasTesst {

	public static void main(String[] args) {

//		HashSet <Num> set = new HashSet(); 
//		set.add(new Num(100)); 
//		set.add(200);
//		set.add(300);
//		set.add(100);
//		for(int i =0; i<set.size(); i++)
//			System.out.println(set.toString);
		
		HashSet<Num> set = new HashSet<>(); // 데이타가중복되지 않게 처리하는 기법 e
		//클래스에 있는 값을 가져오게 되면 중복값을 체크해주지 못하기때문에 hashSet을 사용한다. 
		
		set.add(new Num(100));
		set.add(new Num(200));
		set.add(new Num(300));
		set.add(new Num(100));
		
		for(Num n : set)
			System.out.println(n.toString());
	}
}

class Num{
	private int num;

	public Num(int n) {
		num = n;
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode");
		return num % 3;
	}
	
	@Override
	public boolean equals(Object obj){
		System.out.println("equals");
		return num == ((Num)obj).num;
	}
	
//컨트롤 스페이스바 눌러서 toString을 오버라이드 한다. 	
	@Override
	public String toString() {
		return String.valueOf(num); //valueOf: 입력받은 인자값을 지정된 정수형으로 변환해줌 / 문자열을 숫자로 변환해주는 것. 
	}
	
}