package pumpkinProject;

public class Pumpkin {
	double weight = 0;
	double priceLB = 0;
	
	public Pumpkin(double lbs) {
		weight = lbs;
	}
	
	public void setWeight(double lbs) {
		if(lbs > 0 && lbs < 100)
		weight = lbs;
	}
	
	public double getWeight() {
		return weight;
	}
}
