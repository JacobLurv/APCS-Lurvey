// Java0403.java
// This program demonstrates the <floor> <ceil> and <round> methods.
// The <floor> method returns the truncation down to the next lower integer.
// The <ceil> method returns the next higher integer.
// The <round> method returns the closest integer.


public class Java0403
{
	public static void main (String args[])
	{
		int current = 0;
		int last = 1;
		int penLast = 0;
		System.out.println("1");
		for(int i = 1; i <= 20; i++) {
			current = last + penLast;
			penLast = last;
			last = current;
			System.out.println(current);
		}
	}
}

