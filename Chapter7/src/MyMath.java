import java.util.Scanner;

public class MyMath {

	public static void main(String[] args) {
		System.out.println(pythag());
	}

	
	public static double pythag() {
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Missing Side (1 if a or b, 2 if c) ->");
		int sideGone = keyboard.nextInt();
			
			if(sideGone == 2) {
				System.out.println("Input side A ->");
				double a = keyboard.nextDouble();
				
				System.out.println("Input side B ->");
				double b = keyboard.nextDouble();
				
				return (Math.sqrt((a*a)+(b*b)));
			}
			else {
				System.out.println("Input side C ->");
				double c = keyboard.nextDouble();
				
				System.out.println("Input side A or B ->");
				double a = keyboard.nextDouble();
				
				return (Math.sqrt((c*c)-(a*a)));
			}
	}
}