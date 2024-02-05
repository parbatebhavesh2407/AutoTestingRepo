package practice.Java;

public class ThisDemo {
	int a = 3;

	public void getData() {
		int a = 2;
		System.out.println(a);
		// this - refer to current object
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		ThisDemo d = new ThisDemo();
		d.getData();

	}
}
