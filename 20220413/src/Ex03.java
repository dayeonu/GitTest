
import java.util.Arrays;

public class Ex03 {

			public static void main(String[] args) { // jvmȣ��

				int[] iArr1 = new int[5]; //  iArr1 �迭�� 5�� ����. ���� 5ĭ 10ĭ���� Ȯ�� ���� 
				
				int[] tmp = new int[iArr1.length * 2]; //�迭 *2 �� �ϸ� 10ĭ�� ��. 
			
				for (int i =0; i < iArr1.length; i++) { // iArr1�� 5�̰� i�� 0
					iArr1[i] = (int) (Math.random()*10) +1;  //iArr1 �迭�� �� �濡 1~10�� ���ڸ� ������� �迭�� �ִ´�. 
				}
				
				System.out.println(Arrays.toString(iArr1));
				
				//�迭�� ����� ������ ����Ѵ�. 
			
				for(int i = 0; i < iArr1.length; i++) 
						tmp[i]  = iArr1[i];
						
					iArr1 = tmp;
					
					System.out.println(Arrays.toString(iArr1));
					
					}

			}
