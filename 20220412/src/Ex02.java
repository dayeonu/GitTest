
public class Ex02 {

	public static void main(String[] args) {
		// �Է����ְ� ����� ����
		// ������ �Լ� 
		
		int input = 4;
		
		int i = 100;
		
		sub(input);
		
		System.out.println("���α׷� ����");
		 
	}

	public static void sub(int n) {
		//���� �Լ� ���� ���������� ���. => �������� 
		//int i = 0; ������ ������ ���� sub �Լ��ȿ� �����.  
		//���� �̸� �ߺ��Ǹ� �ȵ�. 
		System.out.println("�Է���" + n + "�� ���");		
		
		for(int i = 1; i<=9; i++) // for �ȿ� �ִ� i ������ for�� �ȿ����� ����. 
			System.out.println((n * i) + " = " + n + " * " + i);
	}
}
