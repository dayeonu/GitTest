import java.util.Arrays;

public class ArrayEx10 {

	public static void main(String[] args) {
		
		//������ �迭 5�� ����, �ʱ�ȭ�� �����Լ� ���ؼ� 1~100 ���̰��� ���� �� ���
		int[] num = new int[5];

		for(int i =0; i<num.length;  i++)
			num[i] = (int)(Math.random()*99)+1;

		System.out.println(Arrays.toString(num));
		
		
	//sort(���� �� ����)
		
		for( int i = 0; i<num.length-1; i++) { // 0~4 
			
			for( int j= i + 1;  j<num.length; j++) { //4
				
				if( num[i] > num[j] ) {	//������ ���� ũ�� �μ��� ���ؼ� �ٲ۴� 
					int tmp = num[i]; 	
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		} System.out.println(Arrays.toString(num));
		
		
}}