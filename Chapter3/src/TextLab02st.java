// TextLab02st.java
// Student starting version of the TextLab02 assignment.
// Resave this program as TextLab02v80 for the 80 point version.
// Resave this program as TextLab02v100 for the 100 point version.


public class TextLab02st
{
	public static void main(String args[])
	{
		System.out.println("TextLab02, 80 Point Version\n");
		
		long milliSeconds = 10000000000;
		int seconds;
		int remainderMinutes;
		int remainderSeconds;
		int minutes;
		int hours;
	
		seconds = (int) milliSeconds / 1000000;
		
		hours = seconds / 3600;
		
		remainderMinutes = seconds % 3600;
		
		minutes = remainderMinutes / 60;
		
		remainderSeconds = remainderMinutes % 60;
		
		System.out.println("Milliseconds : " + milliSeconds);
		System.out.println("Seconds : " + seconds);
		System.out.println("Minutes : " + minutes);
		System.out.println("Hours : " + hours);
	}
}

