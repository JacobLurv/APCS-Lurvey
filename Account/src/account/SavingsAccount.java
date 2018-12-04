package account;

public class SavingsAccount extends Account {
	
	protected double interestRate;
	
	public SavingsAccount(double balance, double rate) {
		super(balance + (balance * rate));
		interestRate = rate;
	}
}
