
public class Ex04 {

	public static void main(String[] args) {

//		1+(-2)+3+(-4)+... �� ���� ������ ��� ���س����� ��, �� ���� ���ؾ� �� ���� 100 �̻� �Ǵ���
	
	int sum = 0; //�հ�
	int i = 0;  
	int sign = 1; //���, ���� ǥ�� 
	int tmp=0;// ����� 
	
	for (i=1; true; i++, sign = -sign) { //sign 1, -1,1,-1....
		
		tmp = i*sign;
		sum += tmp;
		
		if(sum>=100) //�հ谡 100�� �Ѿ�� ����
			break;
		
	}
	System.out.println(i);
	System.out.println(sum );
	
	}

	
}
