
public class Ex01 {

	public static void main(String[] args) {

/* �ݺ��� 3������ ������ 
	for : ������ �����̸� ������ �� ���� �ȵ� �� �ִ�. 
	while : ������ �����̸� ������ �� ���� �ȵ� �� �ִ�. 
	do-while : ������ �����̿��� �ּ� 1ȸ�� ����
*/	
		
		int sum=0;
	// for (1ȸ�� ����; ������ true �϶� �ݺ�; ���� ����)
		
		for (int i = 10; i>0; i--)
			sum += i;
		// sum = sum + i 
		
		System.out.println("sum = " + sum);
	}

}
