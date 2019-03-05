
public class Drink {
	private int qty;
	private int size;
	private double price;
	private String name;
	private int orderNum;


	public Drink(int q, int s, double p, String n, int o) {
		qty = q;
		size = s;
		price = p;
		name = n;
		orderNum = o;
	}
	
	public int getQty() {
		return qty;
	}
	
	public int getSize() {
		return size;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return orderNum;
	}

} 