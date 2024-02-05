package practice.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest {
	public static void main(String[] args) {
		// Arrays
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 144 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
				break;
			} else {
				System.out.println("Not multiple of 2");
			}
		}

		// ArrayList
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("abc");
		alist.add("xyz");
		alist.add("www");
		alist.add("ttt");
		alist.add("yyy");
		alist.add("uuu");
		System.out.println(alist.get(2));

		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		// to check item present in ArrayList
		System.out.println(alist.contains("uuu"));

		// Convert Arrays to ArrayList
		String[] arrStr = { "ABC", "ZZZ", "QQQ", "FFF", "DDD" };
		List<String> ArraysToArrayList = Arrays.asList(arrStr);
		System.out.println(ArraysToArrayList.contains("QQQs"));
	}
}
