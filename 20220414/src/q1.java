import java.util.Arrays;

public class q1 {

	public static void main(String[] args) {

		// ÃÑ ÇÕ°ú Æò±Õ //·£´ı 1~ 100 
		
		int[] num = new int[10];
		int sum=0;
		
		//·£´ıÀÔ·Â
		for(int i = 0; i<num.length; i++) {
			num[i]= (int)(Math.random()*99)+1;
			sum += num[i];

			System.out.println(sum);

	}
	
		
	}

}
