import java.util.Arrays;

public class Q_ex05 {

	public static void main(String[] args) {

		//������ �迭 5�� �����ϰ�
		// �ʱ�ȭ�� �����Լ� ���ؼ� 1~100 ���� ����� ���̰��� ���� �� ���
		
		int[] num = new int[5];
		
		for(int i =0; i<num.length;  i++)
			num[i] = (int)(Math.random()*100)+1;
			
			System.out.println(Arrays.toString(num));

//�ִ밪 �� �ּҰ� ��� �� ���
//[44,81,95,61,14]
			
//	ī���� �ϸ� ī�峢�� ���ؼ�, ���� ū���� ������ ���� ã�����

			int max = num[0];
			int min = num[0];

// �ִ밪 ���
			for(int i =0; i<num.length; i++) {
				if(max < num[i]) // true
					max = num[i]; //false 
			}
			System.out.println("Max : " + max);

// �ּҰ� ��� 
			for(int i = 0; i<num.length; i++) {

				if(min > num[i]) //true
					min = num[i]; //false 
			}
			System.out.println("min: " + min);

	}}


