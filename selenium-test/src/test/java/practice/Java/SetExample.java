package practice.Java;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("CAN");
		hs.add("CAN");
		System.out.println(hs);
		// hs.remove("UK");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());

		// iterator
		Iterator<String> he = hs.iterator();
		while(he.hasNext())
		{
			System.out.println(he.next());
		}
		System.out.println("while loop ended");
		/*
		 * System.out.println("----"); System.out.println(he.next());
		 * System.out.println(he.next()); System.out.println(he.next());
		 * System.out.println("----");
		 */
		
	}
}