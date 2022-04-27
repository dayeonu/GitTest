
public class Ex03 {

	public static void main(String[] args) {

			Car c1 = new Car(); // 객체생성 주소만 생성 
			Car c2 = new Car();	// 객체생성 주소만 생성
			Car c3 = new Car();	// 객체생성 주소만 생성
			c1.num++;
			System.out.println(c1.num);
			System.out.println(c2.num);
			System.out.println(c3.num);
			
			Car2 c10 = Car2.getInstance();	//싱글톤 사용하면 값을 공유함. 
			//외부에서 객체를 생성하려면 getInstance통해서만 가능하다.
			
			c10.num++;
			System.out.println(c10.num);
			
			Car2 c11 = Car2.getInstance();
			c11.num++;
			System.out.println(c11.num);
			System.out.println(c10.num);
			
	}
}

class Car{
	int num =10;
	public Car() {}	//매개변수 없음 
}

class Car2{ //디자인 패턴 -> 싱글톤 

	private static Car2 car2 = null;		//클래스변수.  싱글톤은 생성자 private -> 외부 접근 불가능 . 공유 안됨 
											// getInstance메소드에서 객체를 생성하고 있다. 
	int num = 100;

	private Car2() {						//싱글톤은 생성자 private -> 외부 접근 불가능 . 공유 안됨

		System.out.println("car2 생성자");
	}	// 매개변수 없음 

	public static Car2 getInstance() {	//클래스변수,,
		//static 메소드는 객체를 생성하지 않고서도 접근 가능하다. 따라서 getInstance를 static 메소드로 변경한다. 
		if(car2 == null)
			car2 = new Car2();	//생성자 호출 

		return car2;
	}
}