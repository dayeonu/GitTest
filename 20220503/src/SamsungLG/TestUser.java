package SamsungLG;

public class TestUser {

	public static void main(String[] args) {
//		SamsungTV tv = new SamsungTV();
//		tv.powerOn();
//		tv.powerOff();
//		tv.VolumeUp();
//		tv.VolumeDown();
		
		LgTv tv = new LgTv();
		tv.turnOn();
		tv.turnOff();
		tv.SoundUp();
		tv.SoundDown();
	}
}
//삼성-> 엘지로 변경할때 모든 내용을 수정해야하므로 번거롭다,, 
//그래서 인터페이스를 사용함 
