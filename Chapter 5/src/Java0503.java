// Java0503.java
// This program demonstrates <String> objects concatenation with 
// keyboard entered data.                                                    


import java.util.Scanner;

public class Java0503
{
	public static void main (String args[]) 							
	{  
 		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st Side  ===>>  ");										
		int number1 = input.nextInt();
		System.out.print("Enter 2nd Side  ===>>  ");										
		int number2 = input.nextInt();
		System.out.print("Enter 3rd Side  ===>>  ");
		int number3 = input.nextInt();
		
		if(number1 == number2 && number2 == number3) {
			System.out.println("\n"+"Equilateral");
		}
		else if(number1 != number2 && number1 != number3 && number2 != number3){
			System.out.println("\n"+"Scalene");
		}
		else {
			System.out.println("\n" + "Isoscoles");
		}
	}
}
