package practice.Java;

public class ConstructorDemo {
	
	public ConstructorDemo()
	{
		System.out.println("I am in Constructor");
	}
	
	public ConstructorDemo(int a, int b)
	{
		System.out.println("I am in Parameterized Constructor");
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo c = new ConstructorDemo(1,2);
		
	}

}
