class Mytv2{
	boolean isPoweron;
	int channel;
	int volume;
	int PrevChannel; //이전 채널 변경 하는 변수 
	
	final int MAX_VOLUME =100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL =100;
	final int MIN_CHANNEL =1;
	
	public boolean isPoweron() {
		return isPoweron;
	}
	public void setPoweron(boolean isPoweron) {
		this.isPoweron = isPoweron;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		PrevChannel = this.channel;
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getMAX_VOLUME() {
		return MAX_VOLUME;
	}
	public int getMIN_VOLUME() {
		return MIN_VOLUME;
	}
	
	void gotoPrevChannel(){
		setChannel(PrevChannel);
	}
}

public class test7_10 {
	public static void main(String[] args) {
		Mytv2 t = new Mytv2();
		 
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
		t.gotoPrevChannel();
		System.out.println("CH:" +t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
	}
}
