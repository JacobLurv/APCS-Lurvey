import java.util.Scanner;

public class Java0301
{
	public static void main (String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		int input;
		int evens;
		
		System.out.println("Enter your number");
		input = keyboard.nextInt();
		evens = countEvens(input);
		System.out.println(evens);
	}
	
	public static int countEvens(int input) {
		int increment = 0;
		
		for(int i = 1; i <= input; i++) {
			if(i % 2 == 0)
				increment++;
		}
		
		return increment;
	}
}

