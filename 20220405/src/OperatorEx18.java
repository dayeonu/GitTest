
public class OperatorEx18 {

	public static void main(String[] args) {

		double pi = 3.141592; 		//3.142
		double shortPi = Math.round(pi*1000)/1000.0; // Mate.round 첫번쨰 자리에서 반올림 해준다. 
		System.out.println(shortPi);
		
		shortPi = Math.round(pi * 1000);
		System.out.println(shortPi);   //3142.0
		
		shortPi = Math.round(pi*1000)/1000.0;
		System.out.println(shortPi);	//3.142 첫번째 자리에서 반올림 됨.
		
				
	}

}
