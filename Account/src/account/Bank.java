package account;

public class Bank {
	private Customer[] customers = new Customer[100];
	private int customerNum = customers.length;
	
	public Bank() {
		customerNum = 0;
	}
	
	public void addCustomer(String o, String t, double bal) {
		Customer cust = new Customer(o,t,bal);
		customers[customerNum] = cust;
		customerNum += 1;
	}
	
	public int getTotal() {
		return customerNum;
	}
	
	public Customer getCustomer(int i) {
		return customers[i];
	}
}
