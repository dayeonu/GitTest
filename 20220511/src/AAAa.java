import java.util.ArrayList;
import java.util.Iterator;
public class AAAa {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList();
	
	list.add("1");
	list.add("2");
	list.add("3");
	list.add("4");
	list.add("5");
	
	Iterator<String> it = list.iterator();
	while(it.hasNext()) {
		String obj = it.next();
		System.err.println(obj);
	}

}
}
