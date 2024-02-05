package practiceSelenium;

import java.util.Arrays;

public class arrayShift0 {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 1, 0 };
		int count1 = 0, count2 = 0;
	//	int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count1++;
			}
			if (arr[i] == 0) {
				count2++;
			}
		}
		for (int j = 0; j < count2; j++) {
			arr[j] = 0;
		}
		for (int j = 0; j < count1; j++) {
			arr[arr.length - 1 - j] = 1;
		}
		System.out.print(Arrays.toString(arr));
	}
}
