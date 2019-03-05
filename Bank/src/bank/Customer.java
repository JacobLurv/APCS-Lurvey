package bank;


public class Customer {
	private String name1;
	private String name2;
	private Account account;
	
	public Customer(String o, String t, double bal) {
		name1 = o;
		name2 = t;
		account = new Account(bal);
	}
	
	public String get1stName() {
		return name1;
	}
	
	public String getLastName() {
		return name2;
	}
	
	public Account getAccount() {
		return account;
	}
}
