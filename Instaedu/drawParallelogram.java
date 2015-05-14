public class Draw {
	public static void main(String args[]) {
		for (int h = 1; h <= 5; h++) {
			int stop = 10 - h*2;
			for (int s = 0; s < stop; s++) {
				System.out.print(" ");
			}
			
			for (int a = 0; a < 10 - stop; a++) {
				System.out.print("*");
			}
		}
	}
}