package account;

public class Account {
	protected double balance;
	
	public Account (double newBalance) {
		balance = newBalance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean withdraw (double money) {
		if(balance - money < 0) 
			return false;
		else{
			balance -= money;
			return true;
		}
	}
	
	public void deposit (double money) {
		balance += money;
	}
	
	
}
