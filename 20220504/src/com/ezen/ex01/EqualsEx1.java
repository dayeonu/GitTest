package com.ezen.ex01;

public class EqualsEx1 {

	public static void main(String[] args) {

		Value v1 = new Value(10);
		Value v2 = new Value(10);
	
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
		
		v2 = v1;
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	}
}

class Value{
	int value;
	
	Value(int value){
		this.value = value;
	}
	
	public boolean equals(Object obj) { // 타입이 어떤게 넘어올지 몰라서 object를 사용함. 
		
		if(obj instanceof Value) {
				// v1에는 10 들어가있음. 
			return value == ((Value)obj).value; // 형변환 한 것, ((Value)obj).value 
		}
		return false;
	}
}
