class Tv3 {
		//tv의 속성(멤버변수)
		String color;	//색상
		boolean power;	//전원상태 on,off
		int channel;	//채널 번호 저장 
		
		//tv의 기능(메서드)
		void power()	{ power = ! power; }	//tv를 켜거나 끄는 기능을 하는 메서드
		void channelUp()	{ ++channel; }		//tv의 채널을 높이는 기능을 하는 메서드
		void channelDown()	{ --channel; }		//tv의 채널을 낮추는 기능을 하는 메서드
	}

public class TvTest4 {

	public static void main(String[] args) {
		Tv3[] tvArr = new Tv3[3];
		
		for(int i = 0; i<tvArr.length; i++) {
			tvArr[i]=new Tv3();
			tvArr[i].channel = i +10;
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
		for(int i =0; i<tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
	
		}
	}
}
