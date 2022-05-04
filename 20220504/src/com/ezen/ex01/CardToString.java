package com.ezen.ex01;
import java.util.*;

class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE", 1);
	}
	Card(String kind, int number){
		this.kind =kind;
		this.number = number;
	}

@Override
public String toString() {
//	return getClass().getName()+@Integer.toHexString(hashCode()); 
// 클래스를 작성할 때 toString 을 오버라이딩 하지 않는 다면, 위와 같은내용이 그대로 사용될 것이다.
// 즉 , toString()호출하면 클래스 이름에 16진수의 해시코드를 얻게 될 것. 
	return "kind:" + kind + ", number:" + number;
	}
}

public class CardToString {

	public static void main(String[] args) {

		Card c1 = new Card("red",10);
		Card c2 = new Card();
		
		System.out.println(c1.toString());// toString은 꼭 오버라이딩 해줘야 결과 나옴 
		System.out.println(c2.toString());
	
	
		java.util.Date today = new java.util.Date(); // 자바 유틸리티에 내장 되어있는 date가 있다. 
		System.out.println(today);
	}

}
