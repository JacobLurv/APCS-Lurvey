package account;

public class TestAccount {
	public static void main(String[] args) {
		Account jonDoe = new Account(100);
		
		jonDoe.deposit(50);
		jonDoe.withdraw(147);
		
		System.out.println(jonDoe.getBalance());
	}
}
