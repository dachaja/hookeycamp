package jasper.k.casestudy;

public class AccountTest {
	
	public static void main(String[] args) {
		Account ac = new Account();
		double balance = ac.getBalance();
		System.out.println("Balance = " + balance);
		
		ac.credit(234.78);
		ac.debit(100.12);
		
		balance = ac.getBalance();
		System.out.println("Balance = " + balance);
		
	
		ac.credit(-234.90);
		ac.debit(-474.76);
		
		balance = ac.getBalance();
		System.out.println("Balance = " + balance);
		
		ac.debit(2000.00);
		balance = ac.getBalance();
		System.out.println ("Balance = " + balance);
	}
	
	
}
