package jasper.k.casestudy;

public class Account {
	private double balance;
	
	public double getBalance() {
		return this.balance;
		
	}
	public int credit(double amount) {
		if (amount < 0.0 || Double.isNaN(amount)||Double.isInfinite(amount)) {
			System.out.println("Invaild credit amount : " + amount);
			return -1;
		}
		System.out.println("Crediting amount: " + amount);
		this.balance = this.balance + amount;
		return 1;
	}
	public int debit(double amount) {
		if (amount < 0.0 || Double.isNaN(amount)||Double.isInfinite(amount)) {
			System.out.println("Invaild credit amount : " + amount);
			return -1;
	}
	System.out.println("Debiting amount: " + amount);
	this.balance = this.balance - amount;
	return 1;
	
}
}
