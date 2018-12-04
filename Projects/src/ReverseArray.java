
public class ReverseArray {
	public static void main (String [] args) {
		int[]Array = {1,2,3,4,5,6};
		reverse(Array);
	}
	
	public static int[] reverse(int[] array) {
		
		int revIndex;
		int[] revArray = new int[array.length];
		
		for(int i = 0; i <= array.length; i++) {
			revIndex = array.length - i;
			System.out.println(i);
			revArray[i] = array[array.length-i];
		
			}
		return revArray;
	}
}
 