
public class Test8 {

	public static void main(String[] args) {

		int fahrenheit = 100; //ȭ��         C = 5/9 *(f-32) 
		float celcius = (int)(((float)5/9 * (fahrenheit -32))*(100)+0.5f)/100f;
		
		
		System.out.println("Fahrenheit:"+ fahrenheit);
		System.out.println("Celcius:"+ celcius);
	
		
		/*ȭ���� ������ ��ȯ�ϴ� �ڵ�.
		 * C = 5/9 *(f-32) 
		 * �Ҽ��� 3��° �ڸ� �ݿø��ϱ�.
		 * Math.round ������� ����
		 */
	}

}
