
public class Ex01_3 {

	public static void main(String[] args) {
		//4. �Լ����� �Է°� ��� ��� �ִ� ��� 

		int a = 5;
		int b = 10;

		int result = sub(a , b); // �Լ� ȣ��  --> ���ڰ��̶�� �θ�.
		//��ȯ���� ����� ���� result�� ������ش�. 
		System.out.println("������� " + result); 
	
	}

	public static int sub(int a, int b) {	// --> sub()�� �Ű�������� �θ���.  
		//sub �Լ� 
		int inum = a * b;

//		return inum; 
		return a * b;  // �� ������.  ��ȯ��. 
	}
	
}

