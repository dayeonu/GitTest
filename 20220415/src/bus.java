import java.util.Scanner;

public class bus {

	public static void main(String[] args) {

		int age;
		int charge = 1500;
		double rate = 0;
		age = (int)(Math.random()*99)+1; 
		
		if(age>=65)
			rate = 0.0;
		
		else if(age>=20)
			rate = 1.0;
		
		else if(age>=14)
			rate = 0.75;
		
		else if(age>=4)
			rate = 0.5;
		
		System.out.println("����: " + age +"�ݾ�: "+ (int)rate*charge );
	}
}