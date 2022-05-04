package LGSamsung;

public class TvUser {

	public static void main(String[] args) {

		TV tv = new SamsungTV();
		tv.PowerOn();
		tv.PowerDown();
		tv.volumeUp();
		tv.volumeDown();
	
//		BeanFactory factory = new BeanFactory();
//		TV tv = (TV)factory.getBean(args[0]);
//		tv.PowerOn();
//		tv.PowerDown();
//		tv.volumeUp();
//		tv.volumeDown();
	}
}
