
public class Test2 {

	public static void main(String[] args) {
		
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long L = 1000L;
		
		// ���� ������ ���� ������ Ȯ���Ұ�
		b =	(byte)i; //�Ұ����ϴ�. byte�� ������ -128~ 127 int�� ������ -20��~ 20��.
		ch = (char)b;	//char 0~65535, byte -128 ~ 127 ����Ʈ�� ������ �־ ��		
		short s = (short)ch; // short -32768~32767 ���� ��ȣ��Ʈ�� �ִ�. char �� ��ȣ��Ʈ�� ���� 
		float f = (float)i; 	
		i = (int)ch;	// 0~65535 int���� ���ԵǹǷ� ������ �� �ִ�. 
	}

}

// ����ȯ�� ���� ���� �ٽ� �����ϱ�.
// 29������, ���� ������ Ȯ���� ��
