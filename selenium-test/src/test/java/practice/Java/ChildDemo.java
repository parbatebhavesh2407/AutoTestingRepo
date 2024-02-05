package practice.Java;

public class ChildDemo extends ParentDemo {

	
	
	String name="QA_Automation";
	
	public ChildDemo() {
		super(); //this should be always be 1st line
		System.out.println("Child Class Constructor");
	}
	
	public void getStringData()
	{
		System.out.println(name);
		System.out.println(super.name);
		super.getParentData();
	}
	public static void main(String[] args) {
		ChildDemo cd=new ChildDemo();
		cd.getStringData();
		
	}

}
