
public class Ex01_1 {
	// 2��° �Լ����� �Է��� �ְ� ����� ���� ��� 
	public static void main(String[] args) {
		
		double dnum = 2.0;
		int num2 = 5;
		
		System.out.println("main() �Լ�!!");
		
		sub(dnum, num2); // �Լ� ȣ��  --> ���ڰ��̶�� �θ�.

		System.out.println("main()2 �Լ�!!"); // 5�� 
	}

	
	//public  �� �ƹ��ų� ���� �� �� �ִٴ� ��. 
	//�Լ��� �����ϸ� �ݵ�� �ٸ� ��(main ���) ȣ���� �ؾ��Ѵ�. �ҷ��´ٴ� ��. 
	public static void sub(double i , int j) { //�Լ��� Ÿ�Ե� �����ؾ� �Ѵ�. ū -> ���� �������� �� ��ȯ����. �ݴ�� ��������ȯ�ؾ���. 
					//(double i , int j) --> �Ű� ������� �θ�.
		// �Ű� ���� Ÿ�԰� ���� ���� Ÿ���� �����ؾ��Ѵ�.
		
		System.out.println("�� ���� ����" + (i+j)); // �߰�ȣ�����, �����ڰ���� �ʿ��ϱ⶧����.
	} 
}
