
public class TestVariables {

	public static void main(String[] args) {

		Variables var = new Variables();
		var.iv++;	//인스턴스 변수는 따로 사용되어서 1로 저장
		
		Variables.cv++; //클래스 변수~~~
		
		var.cv++;	//클래스 변수 
		System.out.println("var : " + var.iv);
		System.out.println("var_cv: " + var.cv);
		
		Variables var2 = new Variables();
		var2.iv++;	//인스턴스 변수는 따로 사용되어서 1로 저장 
		var2.cv++;	//클래스 변수 
		System.out.println("var2 : " +var2.iv);
		System.out.println("var_cv2: " + var2.cv);
	
		Variables  var3 = new Variables();
		var3.iv++;	//인스턴스 변수는 따로 사용되어서 1로 저장
		var3.cv++;	//클래스 변수 
		System.out.println("var3 : " +var3.iv);
		System.out.println("var_cv3: " + var3.cv);
	
	
	Variables var4 = new Variables();
	System.out.println(var4.iv); // 인스턴스 변수는 객체 생성 후 불러올 수 있다.

	
	}
}
// 객체가 카운터 필요할 때, 
// 같이 사용할 변수가 뭐가 있을 까?

class Variables{
	int iv; //인스턴스 변수, 멤버 변수
	static int cv;	// 클래스변수, 정적 변수 : 클래스 변수는 객체 생성없이도 불러올 수 있다. 접근할 수 있다. 

	void method() {
	int iv=0;	//지역변수 
	}
}