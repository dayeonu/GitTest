
public class OperatorEx1 {

	public static void main(String[] args) {
		
		int i = 5;
		int j = 0;

		++i; 	// 5값에 1이 증가   => 6
		i++;	// 6값에 1이 증가   => 7
		i += 1; // 7값에 1이 증가	 => 8

		System.out.println(i);  // i의 값은 8
				
		
		++j;	// 0값에 1이 증가 => 1
		j++;	// 1값에 1이 증가 => 2
		j += 1; // 2값에 1이 증가 => 3
		System.out.println(j);	// j의 값은 3
		
		// i = i + 1 식은 간단하게 표현하기 위해 += 를 사용한다. i += 1 간단식 
		// ++i 는  i = i + 1 과 같은 의미이다. 전위형 표시.
		
		
		
	
	}

}
