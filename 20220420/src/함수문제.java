import java.util.Scanner;

public class �Լ����� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float age = sc.nextFloat();
		float feeCalcRate = sc.nextFloat();
		/*		
			�����Լ�
			input�Լ��� ���� ���̸� �Է� �޾ƾ���.
			feeCalcRate �Լ��� ���� ������ ����� �޾ƾ���.
			output �Լ��� ���� ����� ��� 

		 */	

		float num = add(age,feeCalcRate);
		System.out.println(num);
	}

	static float add(int i, int j ) { //��ȯŸ��(�ڷ���)�� �����ؾ���, int i, int j�� �Ű�����
		float result = i*j;
		return result; // �����Ҷ�, num���� ���� �Ѿ 	
	}
}