//1)Sum of Elements in Array
//2)Multiply without using multiple operator

package progJava;

public class SumOfArrays {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 9 };
		int sum = sumArray(a);
		System.out.println("Sum of Arrays: " + sum);

		// 2 -Multiply without using multiple operator
		int result = multiple(2, 10);
		System.out.println("Result : " + result);
	}

	public static int sumArray(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			// System.out.println(i);
			sum = sum + a[i];
		}
		// System.out.println(sum);
		return sum;
	}

	public static int multiple(int c, int d) {
		int mult;
		int k = 1;
		int sum1 = 0;
		while (k <= d) {
			sum1 = sum1 + c;
			k++;
		}
		return sum1;

	}
}
