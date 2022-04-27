// 310페이지. 상속 1.1 상속의 정의와 장점

public class CarTest {

	public static void main(String[] args) {
		
		Sedan se = new Sedan("white", 5, 4);
		
//		se.color = "white";
//		se.passenger = 5;
//		se.tire = 4;
		System.out.println("세단: "+ se.color + "," + se.passenger + "," + se.tire);
		
		Bus bu = new Bus();
		bu.passenger = 15;
		bu.tire = 6;
		System.out.println("버스 :" + bu.passenger + "," + bu.tire);

	
		Sports ss = new Sports(2,4,2,"red",1000);
		System.out.println(ss.color + ","  +ss.passenger + "," + ss.tire +","+ ss.seat + "," + ss.sports);
	}
}

	class Sedan extends car_{ // 상속 하기.  
		String color;
		
		public Sedan(String color, int passenger, int tire) {
			super(passenger,tire,4); // 상위 클래스 생성자 호출 .. 가장 상단에 기재되어야 함 
			this.color = color;
			//		this.passenger = passenger;
			//		this.tire = tire; 
			System.out.println("Sedan()생성자");	// 하위(자식) 클래스임으로, 상위클래스 수행문 먼저 되고   프린트가 나중에 된다. 
		}
		
			public Sedan( int passenge, int tire, int seat, String color, int sports) {
			super(passenge, tire, seat);
			this.color = color;
		}
		
			public Sedan() {}
//		int passenger;
//		int tire;
//		int seat;
//		void run() {}
//		void stop() {}
		
	}
	

class Sports extends Sedan{
	int sports;

	public Sports() {} // 디폴트 생성자 만들어주면 상속-상속 
	
	public Sports(int passenge, int tire, int seat, String color, int sports) {
//		super(passenge, tire, seat, color);
		this.sports = sports;
	}
}
class car_ { 	//공통된 변수와 메서드들 함수 만들기
// 상위(부모)클래스가 먼저 존재해야하고, 하위(자식) 클래스가 존재하게 된다. 
	
 
	int passenger;
	int tire;
	int seat;
	public car_(int passenger, int tire, int seat) {
		this.passenger = passenger;
		this.tire = tire; // 직접 
		this.seat = seat;
		System.out.println("car_ 생성자");
	}
	public car_() {};

	void run() {
		System.out.println("run()");
	}
		
	void stop() {}
	}

class Bus extends car_{
//	int passenger;	
//	int tire;
//	int seat;
//	void run() {}
//	void stop() {}
	void passengerLoad() {}
}

class Truck extends car_{
//	int passenger;	
//	int tire;
//	int seat;
//	void run() {}
//	void stop() {}
	void objectLoad() {}
}