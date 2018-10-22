// Java0401.java
// This program shows how to use the <sqrt> method of the Math
// class.  The Math class is part of the java.lang package, which is
// automatically loaded (imported) by the compiler.
// Math.sqrt returns the square root of the argument.


public class Java0401
{
	public static void main (String[] args)
	{
		float sum = 0;
		for(float i = 1; i <= 12; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
   }
}