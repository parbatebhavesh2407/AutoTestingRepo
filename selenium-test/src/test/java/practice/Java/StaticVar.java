package practice.Java;

public class StaticVar {

	
	String name; //instance variable
	String address;
	static String city="Pune"; // class variable
	
	StaticVar(String name, String address)
	{
	this.name = name;
	this.address = address;
	this.city = city;
	}
	
	public void address()
	{
		System.out.println(address + city);
	}
	
	public static void getCity()
	{
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		StaticVar obj = new StaticVar("bob","yerawada");
		StaticVar obj1 = new StaticVar("rob","Sadashiv Nagar");
		obj.address();
		obj1.address();
		StaticVar.getCity();
		
	}

}
