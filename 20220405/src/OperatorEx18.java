
public class OperatorEx18 {

	public static void main(String[] args) {

		double pi = 3.141592; 		//3.142
		double shortPi = Math.round(pi*1000)/1000.0; // Mate.round ù���� �ڸ����� �ݿø� ���ش�. 
		System.out.println(shortPi);
		
		shortPi = Math.round(pi * 1000);
		System.out.println(shortPi);   //3142.0
		
		shortPi = Math.round(pi*1000)/1000.0;
		System.out.println(shortPi);	//3.142 ù��° �ڸ����� �ݿø� ��.
		
				
	}

}
