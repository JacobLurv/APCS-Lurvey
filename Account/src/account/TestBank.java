package account;

public class TestBank{
	public static void main(String [] args) {
		Bank capitalOne = new Bank();
		capitalOne.addCustomer("John", "Doe", 100);
		capitalOne.addCustomer("Jane", "Eyre", 50);
		capitalOne.addCustomer("Peter", "Benton", 500);
		capitalOne.addCustomer("Carol", "Hathaway", 10);
		
		for(int i = 0; i < 4; i++) {
			System.out.print(capitalOne.getCustomer(i).get1stName()+ " ");
			System.out.print(capitalOne.getCustomer(i).getLastName()+ " has $");
			System.out.println(capitalOne.getCustomer(i).getAccount().getBalance());
		}
		
	}
}
