public class AsciiArt {
	public static void main(String[] args) {
		int list[] = {2,5,8,6,4};
		System.out.println(getMax(list));
	}
	
	public static double getMax(int[] list) {
		int lastBiggest = 0;
		
		for(int i = 0; i < list.length-1; i++) {
			if (list[i] > lastBiggest)
					lastBiggest = list[i];
		}
		return lastBiggest;
	}
}

