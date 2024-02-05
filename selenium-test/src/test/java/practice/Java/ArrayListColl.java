package practice.Java;

import java.util.ArrayList;

public class ArrayListColl {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("AAA");
		a.add("BBB");
		a.add("CCC");
		a.add("DDD");
		System.out.println(a);
		a.add(0, "LLL");
		System.out.println(a);
		a.remove(0);
		a.remove("CCC");
		System.out.println(a);
		//a.removeAll(a);
		System.out.println(a);
		System.out.println(a.get(1));
		// to check wether CCC is present in arrayList
		System.out.println(a.contains("CCC"));
		System.out.println(a.isEmpty());;
		System.out.println(a.size());

	}

}
