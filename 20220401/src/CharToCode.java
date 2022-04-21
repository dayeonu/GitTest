
public class CharToCode {

	public static void main(String[] args) {

		char ch = 'A'; 			// char ch = 65;
		int code = (int)ch;		// ch에 저장된 값을 int타입으로 변환하여 저장한다.  'A' 문자는 컴퓨터가 인식할 수 없으므로, 유니코드인 65로 도출됨
		
		System.out.printf("%c=%d(%#x)%n", ch, code, code); 
		//'A'의 유니코드는 65이고 16진수로 0x41 이다.
		
		char hch = '가'; 		// char hch = 0xAC00;
		System.out.printf("%c=%d(%#x)%n", hch, (int)hch, (int)hch);
	}

}
