import java.util.Arrays;

public class Q_ex03 {

	public static void main(String[] args) {


		double[] dArr1 = new double[10];
		double[] tmp = new double[20];

			for(int i = 0; i < dArr1.length; i++) {
				dArr1[i] = (int)(Math.random()*5)+1;
			}

			System.out.println(Arrays.toString(dArr1));


			for(int i = 0; i < dArr1.length; i++) {
				tmp[i] = dArr1[i];  //dArr1 는 날아감 
			}

		dArr1 = tmp;
		
			System.out.println(Arrays.toString(dArr1));

	}

	//		for (double i = 0; i < iArr1.length; i++) {
	//			iArr1[i] = (Math.random()*10)+1;
	//		}


	//		tmp[i] = iArr1[i];
	//		 
	//		 iArr1 = tmp;
	//		 
	//		 System.out.println(Array.toString(iArr1));
}

