
public class Ex06 {

	public static void main(String[] args) {

//����1) ����*�� 10���� �·� �ٿ������, �Ʒ��� 5�� ���
//		for (int i =0; i<5; i++) { //��
//	
//			for(int j = 0; j<=10; j++) // ���� 10�� �ݺ���
//				System.out.print("*");
//				System.out.println(); //�� �ٲ�
	


//����2)2~9 ���� ������
//		for(int i = 2; i<10; i++) {
//			
//			for(int j = 1; j<10; j++)
//				System.out.println(i + "*" + j + "= " + i*j);
//			System.out.println();
//
//		

//����3) 2�� 2�ٸ� ���, 3���� 3�ܸ� ���, 4���� 4�ܸ� ���
//		for(int i = 2; i<10; i++) {
//			
//			for(int j = 1; j<=i; j++)
//				System.out.println(i + "*" + j + "= " + i*j);
//		
//			System.out.println(); //�� ���
		
//����4) 
//		*
//		**
//		***
//		****
//		*****  ��� ����ϱ�
		
		for(int i = 0; i<5; i++) {
			for (int j = 0; j<=i; j++)
				System.out.print("*");  // print�� println ����~
			System.out.println(); //�� ���
		
		}
	}
}


