
public class BankAccount { //클래스 => 클래스 설계는 추상화개념 

	int balance; 	//잔액__멤버변수, 인스턴스변수 원칙; 변수는 외부에서 직접 접근을 금지... 
	private int sum;
	//getter, setter ==> get은 값을 출력할 때 set은 값을 입력할 떄 사용한다. 
//	void setSum(int sum) {
//		this.sum = sum;
//	}
//	int getSum() {
//		return this.sum;
//	}
//	
//	
	int deposit(int amount) { //입금
		balance += amount;
		return balance;
	}
	int withdraw(int amount) { //출금
		balance -= amount;
		return balance;
	}
	void cheakBalance() {
		System.out.println("잔액: " + balance);
	}
}
class MainClass{
	public static void main(String[] args) {
	
//잔액: 10,000
//잔액: 	7,000
		
		//BankAccount인스턴스를 참조하기 위해 변수bank 를 선언했다.
		BankAccount kim = new BankAccount(); 	//생성자 호출 , 현재는 디폴트 생성자 호출됨. //  
		kim.deposit(10000);
		kim.cheakBalance();
		kim.withdraw(3000);
		kim.cheakBalance();
		System.out.println("---kim통장");
		System.out.println();
		
		BankAccount yoo = new BankAccount();	//yoo계좌개설 
		yoo.deposit(5000);	// 5천원 입금
		yoo.cheakBalance();	// 잔고 찍기
		yoo.withdraw(1000); // 3천원 출금 
		yoo.cheakBalance(); // 잔고찍기
		System.out.println("---yoo통장");
		System.out.println();
		
		BankAccount park= new BankAccount();
		park.deposit(100000);
		park.deposit(170000);
		park.cheakBalance();
		park.withdraw(25000);
		park.cheakBalance();
		System.out.println("---park통장");
		System.out.println();
		
		BankAccount lee= new BankAccount();
		lee.deposit(7000);
		lee.cheakBalance();
		lee.withdraw(200);
		lee.cheakBalance();
		System.out.println("---lee통장");
		System.out.println();
//		
//		//BankAccount 인스턴스의 멤버변수 deposit의 값을 10000원으로 한다.
//		bank.deposit(10000); 
//		bank.cheakBalance();
//		
//		//BankAccount 인스턴스의 멤버변수 withdraw의 값을 3000원으로 한다.
//		bank.withdraw(3000);
//		bank.cheakBalance();
//		인스턴스는 참조변수를 통해서 읽어와야 한다. 
//		직접 읽어오면 안됨.
//		bank.setSum(100);
//		bank.getSum();
//			
	}
}