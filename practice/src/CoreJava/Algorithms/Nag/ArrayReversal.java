package CoreJava.Algorithms.Nag;

public class ArrayReversal {
	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40 };
		int n = 1;
		array = reverse(array, n);
		System.out.println(array);
	}

	private static int[] reverse(int[] array, int n) {
		int temp[] = new int[array.length];
		if (array.length >= n && n > 0) {
			for (int i = 0; i < array.length; i++) {
				if (i < n) {
					temp[n - i - 1] = array[i];
				} else {
					temp[i] = array[i];
				}
			}
			return temp;
		} else
			return array;
	}
}
