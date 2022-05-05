
public class Test {

	public static void main(String[] args) {
		
		
		Time[] t = new Time[3];
		
		t[0] = new Time();
		t[0].hour = 100;
		
		t[1] = new Time();
		t[2] = new Time();
		System.out.println(t[0].hour);
		System.out.println(t[1]);
		System.out.println(t[2]);
	}
}

class Time{
	int hour;
	int minute;
	int second;
}