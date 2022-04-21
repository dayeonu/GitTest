import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) { // jvm호출

		int[] iArr1 = new int[10]; //  iArr1 배열이 생성만 되어있음. 
		
		int[] iArr2 = new int[10];
		
//		int[] iArr3 = new int[] {100,95,80,70,60};
		
		int[] iArr3 = {100,95,80,70,60}; // iArr3 배열에 각 5개 방에 값이 들어가있는 상태. 
		char[] chArr = {'a', 'b', 'c', 'd'}; // char 배열에 총4개 방에 값이 들어가있는 상태 
	
		for (int i =0; i<iArr1.length; i++) {
			iArr1[i] = i + 1; //iArr1 배열의 각 방에 1~10의 숫자를 순서대로 배열에 넣는다. 
		}
		for (int i =0; i<iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10) +1; // 1~10의 값을 배열에 저장. 
		}	
		
		//배열에 저장된 값들을 출력한다. 
		for(int i = 0; i< iArr1.length; i++) {
				System.out.print(iArr1[i]+",");
		}
		
			System.out.println();
			System.out.println(Arrays.toString(iArr2)); // toString을 넣으면 한번에 값이 출력이 나오게 된다. 
			System.out.println(Arrays.toString(iArr3));
			System.out.println(Arrays.toString(chArr));
			System.out.println(iArr3); // 첫번째 주소값이 출력되어 나옴. 
			System.out.println(chArr); // 유일하게 char 형태는 값이 출력됨. 
	}

}
