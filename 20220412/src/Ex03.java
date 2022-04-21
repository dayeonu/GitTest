
public class Ex03 {

	public static void main(String[] args) {

		int n1, n2; // 지역변수같은 경우 함수문 따로 돌며, 영향을 안준다. static은 영향을 받게 한

		n1 = 10;
		n2 = 20;
		
		System.out.println("before: "+ n1 + "," + n2);
		
		swap(n1, n2); // 두 수 교환
		
		System.out.println("after: " + n1 + "," + n2);
	}

	public static void swap(int n1, int n2) {

		int tmp;

		tmp = n1;
		n1 = n2;
		n2 = tmp; // 두 수를 교환해주기 위해서 tmp 변수를 생성해서 교환함. 
		System.out.println("swap:" + n1 + "," +n2);
		
	}
}
