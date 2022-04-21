
public class Test2 {

	public static void main(String[] args) {
		
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long L = 1000L;
		
		// 저장 가능한 값의 범위를 확인할것
		b =	(byte)i; //불가능하다. byte의 범위는 -128~ 127 int의 범위는 -20억~ 20억.
		ch = (char)b;	//char 0~65535, byte -128 ~ 127 바이트는 음수가 있어서 ㅎ		
		short s = (short)ch; // short -32768~32767 범위 부호비트가 있다. char 는 부호비트가 없음 
		float f = (float)i; 	
		i = (int)ch;	// 0~65535 int값에 포함되므로 생략할 수 있다. 
	}

}

// 형변환에 대한 내용 다시 공부하기.
// 29페이지, 값의 범위를 확인할 것
