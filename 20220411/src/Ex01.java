
public class Ex01 {

	public static void main(String[] args) {

		int sum = 0;
		int i =1;

		for(i=1; i<=100; i++) { //100�� ȸ���ϴµ� sum���� 100 �ʰ� �Ǹ� break ��. 
			if(sum > 100) break; // �ݺ����� ����� ���ִ� break
			
			sum += i;
		}
			System.out.println("ȸ��Ƚ��:" + i + "," + "sum:" + sum);
			
			//if ( i%2 == 1) �������� 0�̸� ¦�� , �������� 1�̸� Ȧ�� 
			// continue; 
			//sum += i;  Ȧ���� ��
		}
	}

