
public class Test {

	public static void main(String[] args) {

		System.out.println("1" + "2");	//���� 
		System.out.println(true + "");	//���ڿ� "true"
		System.out.println('A' + 'B');	//char 65 + 66 
		System.out.println('1' + 2);	// 49 + 2 = 51 char < int  ����ȯ int�� �ٲ� 
		System.out.println('1' + '2');  // 49 + 50 = 99
		System.out.println('J' + "ava"); // ���ڿ�
//		System.out.println(true + null); --- ���� �߻�!
		// ���� 0�� �ƽ�Ű ������ 48  __ 0x30 
		// �빮�� A�� �ƽ�Ű ������ 65
		// �ҹ��� a�� �ƽ�Ű ������ 97
		
	}

}
