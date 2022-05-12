import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
//set인터페이스를 구현한 가장 대표적인 컬렉션이다. 
//중복되지 않고 순서가 없다. 

class Car{
	
	private String model;
	private String color;
	private Integer price;
	
	public Car(String model, String color, Integer price) {
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	public String toString() {
		return model + "," + color + "=> 금액:" + price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(model, color);
	}
	
	@Override
	public boolean equals(Object obj) {
		String m = ((Car)obj).model;
		String c = ((Car)obj).color;
		int p = ((Car)obj).price;
		
//		if(model.equals(m) && color.equals(c))
//			return true;
//		else 
//			return false;
		
		//3항 연산자로 비교 하기  
		return (model.equals(m) && color.equals(c) && price==(p)) ? true : false;
	}
	
//}
//class Num{
//	
//	private int num;
//	public Num(int num) {this.num = num; }
//	
//	//숫자로 변환
//	@Override
//	public String toString() {
//		return  String.valueOf(num);
//	}
//	
//	@Override
//	//나머지를 가지고 
//	public int hashCode() {	
//	return num % 3;
//	}
//
//	//값을 비교해서 해당되는 0,1,2 방에 데이타를 넣는다.
//	@Override
//	public boolean equals(Object obj) {
//	if(this.num == ((Num)obj).num)	
//		return true;
//	else 
//		return false;
//}

public class HastSexEx01 {

	public static void main(String[] args) {

		
		//set을 사용한다는 건, 중복을 허용하지 않겠다라는 의도가 있는 것.
		Set<Car> set = new HashSet<Car>();
		
		//타입을 Num으로 줘서 아래 오류 생긴다.
		//set.add(new Num(5)); --> 중복데이타 출력된다. 
		set.add(new Car("현대","흰색",400));
		set.add(new Car("현대","검은색",500));
		set.add(new Car("Y202","white",200));
		set.add(new Car("Y202","Black",1000));
		set.add(new Car("Y201","Red",800));
		set.add(new Car("Y201","Red",800));

// 		중복값을 넣으면 걸러져서 출력 된다. 
//		int, String 넣어도 됨 
//		set.add(5);
//		set.add(5);
//		set.add(5);
//		set.add("box");
//		set.add("robot");
//		set.add("box");
//		set.add("Toy");
//		set.add("Robot");

		System.out.println("cnt : " + set.size());
		
		for(Iterator<Car> itr= set.iterator(); itr.hasNext();){
			System.out.print(itr.next() + " \t");
		}
//		System.out.println();
//		
//		for(Car s : set)
//			System.out.print(s + " \t");
	}
}}
