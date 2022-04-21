
import java.util.Arrays;

public class Ex03 {

			public static void main(String[] args) { // jvm호출

				int[] iArr1 = new int[5]; //  iArr1 배열이 5개 생성. 방이 5칸 10칸으로 확장 공사 
				
				int[] tmp = new int[iArr1.length * 2]; //배열 *2 를 하면 10칸이 됨. 
			
				for (int i =0; i < iArr1.length; i++) { // iArr1은 5이고 i는 0
					iArr1[i] = (int) (Math.random()*10) +1;  //iArr1 배열의 각 방에 1~10의 숫자를 순서대로 배열에 넣는다. 
				}
				
				System.out.println(Arrays.toString(iArr1));
				
				//배열에 저장된 값들을 출력한다. 
			
				for(int i = 0; i < iArr1.length; i++) 
						tmp[i]  = iArr1[i];
						
					iArr1 = tmp;
					
					System.out.println(Arrays.toString(iArr1));
					
					}

			}
