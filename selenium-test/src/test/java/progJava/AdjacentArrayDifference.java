//3) Maximum difference between any Adjacent index in array
package progJava;

public class AdjacentArrayDifference {

	public static void main(String[] args) {
		int[] a = { 1, 3, 6, 99, 9, 12, 15, 29, 55 }; // 2,3,3,3,3,14
		int diff = 0;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i + 1] - a[i] > diff) {
				diff = a[i + 1] - a[i];
			}
		}
		System.out.println(diff);

	}

}
