package practice.Java;

public class Methods {

	public static void main(String[] args) {
		Methods m1 = new Methods();
		m1.getData();
		m1.getValue();
	}
	
	public void getData()
	{
		System.out.println("Get Data from this method");
	}
	public String getValue()
	{
		System.out.println("Return Value");
		return "ReturnValue";
		
	}

}
