//count repeated numbers in array
//print unique number

package practice.Java;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		int a[] = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 9 };

		ArrayList<Integer> ary = new ArrayList<Integer>();
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (!ary.contains(i)) {
				ary.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				System.out.println(a[i]);
				if (k == 1) {
					System.out.println(a[i] + "is unique number");
				}

			}

		}

	}

}
