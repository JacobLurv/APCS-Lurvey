import java.util.Scanner;

public class FizzBuzz {
	public static void main(String [] args) {
		
		int start = 5;
		int end = 30;
	int length = end- start;

		 
		String[] evaluated = evaluate(start, end);
		for(int i = 0; i < length; i++) {
			System.out.println(evaluated[i]);
		}
		
		
	}
	
	public static String[] evaluate(int start, int end) {
		int length = end - start;
		String[] toEval = new String[length];
	  
		for(int i = 0; i < length; i++){
			int current = start + i;
			
			if(current % 3 == 0 && current % 5 == 0){
				toEval[i] = "FizzBuzz";
		    }
		    else if(current  % 3 == 0){
		    	toEval[i] = "Fizz";
		    }
		    else if(current % 5 == 0){
		    	toEval[i] = "Buzz";
		    }
		    else{
		    	toEval[i] = String.valueOf(current);
		    }
		}
		return toEval;
	}
}
