
public class Ex01_2 {
public static void main(String[] args) {
		//3�� �Լ����� �Է��� ���� ��¸� �ִ� ���.
		
		System.out.println("main() �Լ�!!");
		
		double n = sub(); // �Լ� ȣ��  --> ���ڰ��̶�� �θ�.
		
		System.out.println("������� " + n); // 5�� 
	}

	//void �ڸ����� ��ȯ���� �´�. --> void�� ��ȯ���� ���ٴ� ���� ���.
	//void �Լ� �̸�--> �����̸� �߿��� ����Ѵ�. 
	public static double sub() {	// --> sub()�� �Ű�������� �θ���.  
		// ��ȯ�� int num = 10000�� �Ϸ��� ,void�ڸ��� int�� �Է��Ѵ�. 
		
		double dnum = 12.5;
		System.out.println("sub()�Լ� ....." );  
		
		return dnum; // num�� ����ϰ� �Ѵ�.  ��ȯ�ϱ� �ؼ� �������� �޾�����ϴϱ� . void
	} 
}

