
public class Test11 {

	public static void main(String[] args) {
	
//		1������ int�� ���� x�� 10 ���� ũ�� 20���� ���� �� True�� ���ǽ� �����
		int x = 0;
		boolean a = x>10 && x<20;
		System.out.println(a);
	
	
//		2������ char�� ���� ch�� �����̳� ���� �ƴ� �� true�� ���ǽ� �����
		char ch ='a';
		System.out.println(ch!=' ' && ch!='\t');

//	  	3������ char�� ���� ch�� 'x'�Ǵ� 'X'�� �� true�� ���ǽ� 
		char ch2 = 'x';
		System.out.println((ch2 =='x') || (ch2 =='X'));
	 
//		4������ char �� ���� ch�� ���� '0'~'9' �ϴ� true�� ���ǽ�
		char ch3 = '5';
		System.out.println((ch3>='0' && ch3<='9'));
	
//		5������ char�� ����ch�� ������(�빮�� �Ǵ� �ҹ���) �ϋ� true�� ���ǽ�
		char ch4  = 'a';
		System.out.println(ch4 >='A' && ch4 <='z' || (ch4 >='a' && ch4 <='z'));
	
//		6������ int�� ���� year�� 400���� �����������ų� �Ǵ� 4�� ������������ 100���� ������������
//		���� �� true �� ���ǽ�
		int year = 2022;
//		System.out.println((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0 ));
		System.out.println(year % 100 != 0);

//		7������ boolean�� ���� powerOn�� flase�� �� true�� ���ǽ�
		boolean powerOn = true;
		System.out.println("7 :" + !powerOn); 
		
//		8�� ���� ���ڿ� �������� str�� "yes"�� �� true�� ���ǽ�
		String str = "yes";
		System.out.println("s:" + str.equals("yes"));
	
	}

}
