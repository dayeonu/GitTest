
public class Ex02 {

	public static void main(String[] args) {

//		int a = 1;
//		int b = 0;
//		
//		int i = 18;
//		System.out.println(a>0 && b>0); //�ΰ��� ���� �߿� �ϳ��� false�� false�� ������� ����
//		System.out.println(a>0 || b>0); //�ΰ��� ���� �߿� �ϳ��� ���̸� true �� ������� ����
//		System.out.println(!(a>0 || b>0)); //�ΰ��� ���� �߿� ����
//		System.out.println( i%3 == 0 || ( i%3 == 0 && i%6 !=0) );

		char ch = 95;
		 
		System.out.println( ('a' <= ch && ch >= 'z')  || ('A'<=ch && ch <= 'Z'));
							//�ƽ�Ű�ڵ� a�� 97, z�� 122 �̹Ƿ� 
							// 97~ 122 ||  65~ 90 ���� ���ؼ� a �� 97 �̸� true �� �ȴ�.
							// 95 �̸� false 
	}

}
