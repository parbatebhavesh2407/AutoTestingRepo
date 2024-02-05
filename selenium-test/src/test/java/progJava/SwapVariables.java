package progJava;

public class SwapVariables {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println(a);
		System.out.println(b);

		// without temp

		int c = 10;
		int d = 20;
		c = c + d; // a=15
		d = c - d; // b=5
		c = c - d; // a=15-5=10

		System.out.println("---without temp variable");
		System.out.println("value of a:" + c);
		System.out.println("value of b:" + d);

	}

}
