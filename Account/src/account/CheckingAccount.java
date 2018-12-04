package account;

public class CheckingAccount extends Account{
	private double overdraftAmount;
	
	public CheckingAccount (double balance, double overdraft) {
		super(balance);
		overdraftAmount = overdraft;
	}
	
	public CheckingAccount(double balance) {
		super(balance);
	}
	
	public double getOverdraft() {
		return overdraftAmount;
	}
	
	public boolean withdraw(double money) {
		if(balance - money < -overdraftAmount) {
			return false;
		}
		else if(balance - money < 0) {
			overdraftAmount += (balance - money);
			balance = 0;
			return true;
		}	
		else {
			balance -= money;
			return true;
		}
	}
}
