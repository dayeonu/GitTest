public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit)	// 참조변수f가 Unit을 참조하거나 Unit를 상속하는 클래스를 참조하면 OK.
			System.out.println("f는 Unit클래스의 자손입니다.");

		if(f instanceof Fightable) // 참조변수f가 Fightable을 참조하거나 Fightable를 상속하는 클래스를 참조하면 OK.
			System.out.println("f는 Fightable인터페이스를 구현했습니다.");
	
		if(f instanceof Movable) // 참조변수f가 Movable을 참조하거나 Movable를 상속하는 클래스를 참조하면 OK.
			System.out.println("f는 Movable인터페이스를 구현했습니다.");
	
		if(f instanceof Attackable) // 참조변수f가 Attackable을 참조하거나 Attackable를 상속하는 클래스를 참조하면 OK.
			System.out.println("f는 Attackable인터페이스를 구현했습니다.");
	
		if(f instanceof Object)
			System.out.println("f는 Object클래스의 자손입니다.");
		
	} //main
}

class Fighter extends Unit implements Fightable{
	public void move(int x, int y) {}
	public void attack (Unit u) {}
}

class Unit{
	int currentHP;
	int x;
	int y;
}

interface Fightable extends Movable, Attackable{}
interface Movable { void move (int x, int y);}
interface Attackable { void attack(Unit u);}