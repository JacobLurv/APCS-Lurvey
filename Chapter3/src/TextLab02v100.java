// TextLab02st.java
// Student starting version of the TextLab02 assignment.
// Resave this program as TextLab02v80 for the 80 point version.
// Resave this program as TextLab02v100 for the 100 point version.


public class TextLab02v100
{
	public static void main(String args[])
	{
		System.out.println("TextLab02, 100 Point Version\n");
		
		int milliSeconds = 10000123;
		int seconds;
		int remainderMilliseconds;
		int remainderMinutes;
		int remainderSeconds;
		int minutes;
		int hours;
	
		seconds = (int) milliSeconds / 1000;
		
		hours = seconds / 3600;
		
		remainderMinutes = seconds % 3600;
		
		minutes = remainderMinutes / 60;
		
		remainderSeconds = remainderMinutes % 60;
		
		remainderMilliseconds = milliSeconds % 1000;
		
		System.out.println("Starting Milliseconds : " + milliSeconds);
		System.out.println("Milliseconds " + remainderMilliseconds);
		System.out.println("Seconds : " + remainderSeconds);
		System.out.println("Minutes : " + minutes);
		System.out.println("Hours : " + hours);
		
	}
}

