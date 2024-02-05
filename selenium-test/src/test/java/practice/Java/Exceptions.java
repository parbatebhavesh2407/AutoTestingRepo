package practice.Java;

public class Exceptions {

	public static void main(String[] args) {

		int a=9;
		int b=0;
		try {
		System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println("I catched exception");
		}
		finally
		{
			System.out.println("I am finally block");
		}
	}

}
