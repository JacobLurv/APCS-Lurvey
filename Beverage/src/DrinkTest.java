import java.util.*;

public class DrinkTest {
	public static void main(String [] args) {
		Inventory test = new Inventory();
		
		Drink dTest = new Drink(20, 16, 25.00, "Sprite", 12345);

		test.addItem(dTest);
		
		test.writeData();
		
		test.readData();
	}
}