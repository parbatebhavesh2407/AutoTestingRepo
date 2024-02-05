//4) Compare same indexs of two arrays and create another array for matching values
package progJava;

import java.util.ArrayList;

public class CompareSameIndexOfArrays {

	public static void main(String[] args) {

		int[] a = { 1, 3, 5, 7, 9 };
		int length = a.length;
		int[] b = { 2, 4, 5, 8, 9 };
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < length; i++) {
			if (a[i] == b[i]) {

				al.add(a[i]);
			}
		}
		Object[] convertedArray = al.toArray();

		for (Object ary : convertedArray) {
			System.out.println(ary);
		}
	}

}
