package practice.Java;

public class ChildAirCraft extends ParentAirCraft {

	public static void main(String[] args) {
		ChildAirCraft c = new ChildAirCraft();
		c.bodyColor();
		c.engine();
		c.safetyGuidline();
	}

	@Override
	public void bodyColor() {
		System.out.println("Red Color on the Body");
	}

}
