package practice.Java;

public class TestBasic {

	public static void main(String[] args) {
		int[] ary = { 11, 22, 33 };
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
		
		//enhanced for loop
		for(int one:ary) 
		{
			System.out.println(one);
		}
	}

}
