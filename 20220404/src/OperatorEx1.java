
public class OperatorEx1 {

	public static void main(String[] args) {
		
		int i = 5;
		int j = 0;

		++i; 	// 5���� 1�� ����   => 6
		i++;	// 6���� 1�� ����   => 7
		i += 1; // 7���� 1�� ����	 => 8

		System.out.println(i);  // i�� ���� 8
				
		
		++j;	// 0���� 1�� ���� => 1
		j++;	// 1���� 1�� ���� => 2
		j += 1; // 2���� 1�� ���� => 3
		System.out.println(j);	// j�� ���� 3
		
		// i = i + 1 ���� �����ϰ� ǥ���ϱ� ���� += �� ����Ѵ�. i += 1 ���ܽ� 
		// ++i ��  i = i + 1 �� ���� �ǹ��̴�. ������ ǥ��.
		
		
		
	
	}

}
