
public class CharToCode {

	public static void main(String[] args) {

		char ch = 'A'; 			// char ch = 65;
		int code = (int)ch;		// ch�� ����� ���� intŸ������ ��ȯ�Ͽ� �����Ѵ�.  'A' ���ڴ� ��ǻ�Ͱ� �ν��� �� �����Ƿ�, �����ڵ��� 65�� �����
		
		System.out.printf("%c=%d(%#x)%n", ch, code, code); 
		//'A'�� �����ڵ�� 65�̰� 16������ 0x41 �̴�.
		
		char hch = '��'; 		// char hch = 0xAC00;
		System.out.printf("%c=%d(%#x)%n", hch, (int)hch, (int)hch);
	}

}
