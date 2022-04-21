import java.util.Arrays;
import java.util.Scanner;

public class for문합계평균_테스트 {

	public static void main(String[] args) {

		{
			int i;
			int sum=0;
			double avr=0;

			for(i=1; i <=100; i++) {
				sum += i;
			} avr = sum/100.0;
			System.out.println("계:" + sum);
			System.out.printf("평균:%.1f%n",avr);
			System.out.println("-----------------");	
		}

	{
		int i;
		int sum=0;
		int count =0;
		
		for(i=1; i<=100; i++) {
			if( i%2 == 0 && i%7 == 0 ) {
				count++;
				sum += i; //sum = sum+i 
	
				int[] arr = {i};
				System.out.print(Arrays.toString(arr));
				System.out.println();

//쌤 풀이.				
//	int[] nArr = new int[count];
//	int j= 0;
//	for(i=1; i<=100; i++) {
//		if( i%2 == 0 && i%7 == 0 ) {
//			sum += i;
//			nArr[j++] = i	 		j-> 0~6

		}
		System.out.println("---------------");
		System.out.println("카운트:" +count);
		System.out.println("계:" + sum);
	}
	} //end of main
	}}
