package practice.Java;

public class NestedExample2 {

	public static void main(String[] args) {
		//int k = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(j);
				System.out.print("\t");
				//k++;
			}
			System.out.println("");
		}
	}
}
