
public class OperatorEx19 {

	public static void main(String[] args) {

		int x = 10;
		int y = 8;
		
//		System.out.printf("%d�� %d�� ������, %n", x,y);
//		System.out.printf("���� %d�̰�, �������� %d�Դϴ�. %n", x/y,x%y);
//		
//		System.out.println(x / y);   //������
//		System.out.println(x % y);	//������ ��
//		System.out.println(x % -y); //��ȣ�� ���õȴ�. 
//		
		System.out.println( x > y);
		System.out.println( x < y);
		System.out.println( x >= y);  //��ȣ�� ũ�ų� ���� �� ǥ���ؾ� ��. => �� ǥ���� Ʋ��.
		System.out.println( x <= y);  // ��ȣ�� �۰ų� ���� �� ǥ���ؾ� ��. =< �� ǥ���� Ʋ��.
	
		System.out.println( x == y);  // false -- x�� y���� ���� ��� false
		System.out.println( x != y);  // true  -- x�� y���� �ٸ� ��� true
		
		
		
	}
}
