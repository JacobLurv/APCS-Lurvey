import java.io.*;
import java.util.ArrayList;

public class Inventory {

	ArrayList<Drink> products;
	
	public Inventory() {
		products = new ArrayList<Drink>();
	}
	
	public void addItem(Drink d) {
		products.add(d);
	}
	
	public void removeItem(Drink d) {
		products.remove(d);
	}
	
	int getID(int i) {
		return products.get(i).getID();
	}
	
	public String getName(int i) {
		return products.get(i).getName();
	}
	
	public int getQty(int i) {
		return products.get(i).getQty();
	}
	
	public int getSize(int i) {
		return products.get(i).getSize();
	}
	
	public double getPrice(int i) {
		return products.get(i).getPrice();
	}
	
	public int findIndexByID(int id) {
		for(int i = 0; i <= products.size(); i++) {
			if((products.get(i).getID()) == id) {
				return i;
			}
		}
		return-1;
	}
	
	public int findIndexByName(String Name) {
		for(int i = 0; i <= products.size(); i++) {
			if((products.get(i).getName()).equals(Name))
				return i;
		}
		return -1;
	}
	
	
	
	public void writeData() {
		
		try {
			FileWriter file = new FileWriter("output.txt");
			
			for(Drink it: products) {
				file.write(it.getQty() + ":" + it.getSize() + ":" + it.getPrice() + ":" + it.getName() + ":" + it.getID());
			}
			
			file.close();
		}catch(Exception failiure) {
			System.out.println("failiure");
		}
	}
	
	public void readData() {
		try {
			FileReader file = new FileReader("output.txt");
			BufferedReader buff = new BufferedReader(file);
			
			String read;
			while((read = buff.readLine()) != null) {
				String[] parts = read.split(":");
				
				int quant = Integer.parseInt(parts[0]);
				int size = Integer.parseInt(parts[1]);
				double price = Double.parseDouble(parts[2]);
				String name = parts[3];
				int id = Integer.parseInt(parts[4]);
				
				Drink newDrink = new Drink(quant,size,price,name,id);
				products.add(newDrink);
				
				System.out.println(quant + ":" + size + ":"  + price + ":" + name + ":" + id);
			}
			file.close();
			
		}catch (Exception failiure) {
			System.out.println("failiure");
		 }
	}
}
