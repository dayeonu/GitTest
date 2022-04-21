import java.util.Arrays;

public class test5 {

	public static void main(String[] args) {
/*
 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.변수
  money의 금액을 동전으로 바꾸었을 떄, 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
  단, 가능한 적은 수의 동전으로 거슬러야 한다.
  나눗셈 연산자와 나머지 연산자를 사용해야 한다.*/

	int[] coinUnit = {500, 100, 50, 10};
	int money = 2680;
	System.out.println("money=" + money);
	
	for(int i =0; i<coinUnit.length; i++) {
		int[] count = new int[coinUnit.length];
		count[i] = money / coinUnit[i];
		System.out.println("동전종류:"+ coinUnit[i]+ " 갯수:" + count[i] );
		money = money % coinUnit[i]; //money %= coinUnit[i]
		
}}}