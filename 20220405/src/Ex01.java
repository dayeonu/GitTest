
public class Ex01 {

	public static void main(String[] args) {

		
//		3.14 ��� ����� 
		
//		**1��° ��� 
//		float pi = 3.14159f;
//		float result = 0.00159f;
//		System.out.println(pi-result);
		
//		**2��° ��� 
//		float pi = 3.14159f;
//		float result = (int)(pi*100) / 100f;
//		System.out.println(result);

		
//		3.141 ��� �����
		float pi = 3.14159f;

		float result = (int)(pi*1000) / 1000.0f;

		System.out.println(result);
		
//		rel3.142 ��� �����

		float result2 = (int)(pi*1000+0.5f) / 1000.0f;

		System.out.println(result2);
	}
}
