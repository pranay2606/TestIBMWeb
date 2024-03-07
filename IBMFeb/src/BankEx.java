
public class BankEx {
	
	void savings() {
		System.out.println("No Min Balance");
	}
	void current() {
		System.out.println("Min Bal as 10000 and no txn limit");
	}
	void fd() {
		System.out.println("5% Interest Rate");
	}
	
	public static void main(String[] args) {
		BankEx obj1 = new BankEx();
		//BankEx1 obj2 = new BankEx1();
	}
}
abstract class BankEx1{
	abstract void loans();
	void creditcards() {
		System.out.println("Credit Cards");
	}
}









