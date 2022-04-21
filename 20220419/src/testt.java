
public class testt {

	public static void main(String[] args) {
		int[] arr = { 10,20,30,40,50 };
		int sum = 0;
//		첫번째 방법.		
		for(int i = 0; i<arr.length; i++)
			sum += arr[i];
//			sum = sum + arr[i]
		System.out.println("sum=" +sum);
	

//		두번째 방법.
		int sum2=0;
		for(int i : arr)
			sum2 += i;
		
		System.out.println("sum2=" + sum2);
	}
}
