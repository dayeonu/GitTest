
public class BankAccount2 { //클래스 => 클래스 설계는 추상화개념 

	int balance; 	//잔액__멤버변수, 인스턴스변수 원칙; 변수는 외부에서 직접 접근을 금지... 

	int deposit(int amount) { //입금
		
		if(amount<0)
			return 0;
		balance += amount;
		return balance;
	}
	int withdraw(int amount) { //출금
		balance -= amount;
		return balance;
	}
	int cheakBalance() {
		System.out.println("잔액: " + balance);
		return 0;
	}
}
class MainClass2{
	public static void main(String[] args) {
	
		BankAccount2[] bank = new BankAccount2[3];// 객체 생성 되지 않음 
		
		bank[0] = new BankAccount2();
		bank[1] = new BankAccount2();
		bank[2] = new BankAccount2();
		
		bank[0].deposit(100000);
		bank[0].withdraw(7000);
		System.out.println(bank[0].cheakBalance());
//		bank[0].cheakBalance();
	}
}