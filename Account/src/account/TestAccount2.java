package account;

public class TestAccount {

	public static void main(String[] args) {
		CheckingAccount jonDoe = new CheckingAccount(500.00);
		
		CheckingAccount janeDoe = new CheckingAccount(500.00, 500.00);
		
		jonDoe.withdraw(150);
		jonDoe.deposit(22.55);
		jonDoe.withdraw(47.62);
		jonDoe.withdraw(400);
		System.out.println("Jon Doe's Balance: $" + jonDoe.getBalance());
		
		janeDoe.withdraw(150);
		janeDoe.deposit(22.5);
		janeDoe.withdraw(47.62);
		janeDoe.withdraw(400);
		System.out.println("Jane Doe's Balance: $" + janeDoe.getBalance());
		System.out.println("Jane Doe's Overdraft Balance: $" + janeDoe.getOverdraft());
	}

}
