package CoreJava.Algorithms;

public class SolveMeFirst {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		// Code here
		for (int i = 0; i < 5; i++) {
			System.out.println(">" + i);
		}

		long stopTime = System.currentTimeMillis();
		long timeTaken = stopTime - startTime;
		System.out.println(timeTaken);
	}
}
