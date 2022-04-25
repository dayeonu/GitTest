class Tv {
		//tv의 속성(멤버변수)
		String color;	//색상
		boolean power;	//전원상태 on,off
		int channel;	//채널 번호 저장 
		
		//tv의 기능(메서드)
		void power()	{ power = ! power; }	//tv를 켜거나 끄는 기능을 하는 메서드
		void channelUp()	{ ++channel; }		//tv의 채널을 높이는 기능을 하는 메서드
		void channelDown()	{ --channel; }		//tv의 채널을 낮추는 기능을 하는 메서드
	}

class TvTest {
//		public static void main(String args[]) {
			
		Tv t;
		t = new Tv();		//tv인스턴스를 생성한다.
		t.channel = 7;		//tv인스턴스의 멤버변수 channel의 값을 7로 한다.
		t.channelDown();	//tv인스턴스의 메서드 channelDown()을 호출한다. 
		System.out.println("현재 채널은 "+ "t.channel + 입니다.");
	}
		
}

			
//			//tv라는 객체를 만들고 싶다. ---> 객체를 만들려면 클래스(설계도)가 있어야 한다. 
//			String str = "korea";
//			System.out.println(str);
//			
//			TvTest3 t = new TvTest3();				//tv인스턴스를 참조하기 위한 변수 t를 선언
//			
//			t.channel = 7;
//			t.channelDown();
//			System.out.println("t : " + t.channel);
//			
//			TvTest3 t2 = new TvTest3();
//			t2.channel = 10;
//			t2.channelUp();
//			System.out.println("t2 : " + t2.channel);
//			
//			TvTest3 t3 = t2;
//			System.out.println("t3 : " + t3.channel);
//	}
//}
