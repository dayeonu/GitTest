
public class Test10 {

	public static void main(String[] args) {

		char ch = 'K';
		
		//				1������ ���� ���, 2������, �����ϰ�� ch���� 
		//char lowerCase = (1) ? (2) : ch;
		
		
		char lowerCase = ('A' <= ch && ch <='Z') ? (char)(ch+32) :ch;		
		
		System.out.println("ch:"+ ch);
		System.out.println("ch to lowerCase:"+ lowerCase);
	}
	/* �빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ��ε�,
	 * ���� ch�� ����� ���ڰ� �빮�� �� ��쿡�� �ҹ��ڷ� �����Ѵ�.
	 * �����ڵ�� �ҹ��ڰ� �빮�ں��� 32��ŭ �� ũ��. 
	 * ���� ��� 'A'�� �ڵ�� 65�̰� 'a'�� �ڵ�� 97 �̴�.
	 */

}
