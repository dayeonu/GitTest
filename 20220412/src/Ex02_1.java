
public class Ex02_1 {
//
//	public static void main(String[] args) {
//	1) �Է�x, ���x ���¹�. 
//	
//		gugudan(); // ȣ�⹮
//	}
//	
//
//	public static void gugudan() { // �⺻ �Լ� ���� , ��ȯ ���� �����Ƿ� return�� ���ʿ����.
////		��ȯ ���� int�� �̶��, void �ڸ��� int�� ������ �ڷᰪ���� ����������Ѵ�. 
////		
////		return 10; 
//		int n = 3;
//		
//		System.out.println("�Է���"+ n + "�� ���");
//		for(int i =1; i<=9; i++)
//			System.out.println(n*i);
//	}
//}

//public static void main(String[] args) {
////2)�Է�o, ���x ���¹�. 
//
//	int input= 3;
//	gugudan(input); // ȣ�⹮
//}
//
//public static void gugudan(int n) { // �⺻ �Լ� ���� , ��ȯ ���� �����Ƿ� return�� ���ʿ����.
////	��ȯ ���� int�� �̶��, void �ڸ��� int�� ������ �ڷᰪ���� ����������Ѵ�. 
//	
//	System.out.println("�Է���"+ n + "�� ���");
//	for(int i =1; i<=9; i++)
//		System.out.println(n*i);
//}
//}
//	
//public static void main(String[] args) {
//// 3)�Է�o, ���o ���¹�. 
//
//	int input=3;
//
//	boolean flag = gugudan(input); // ȣ�⹮
//
//		if(flag == true)
//			System.out.println("��¼���");
//		else
//			System.out.println("��½���");
//}
//
//public static boolean gugudan(int n) { 
//
//	boolean flag = true;
//
//	System.out.println("�Է���"+ n + "�� ���");
//	
//		for(int i =1; i<=9; i++) 
//			System.out.println(n*i);
//
//	return flag; 
//}
//}

public static void main(String[] args) {
	// 4)�Է�x, ���o ���¹�. 

	boolean flag = gugudan(); // ȣ�⹮

		if(flag == true)
			System.out.println("��¼���");
		else
			System.out.println("��½���");
}

public static boolean gugudan() { 

	boolean flag = true;
	int n = 3;

	System.out.println("�Է���"+ n + "�� ���");
	for(int i =1; i<=9; i++) 
		System.out.println(n*i);

	return flag; 
}
}