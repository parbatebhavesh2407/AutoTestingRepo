package practice.Java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Zero");
		hm.put(1, "First");
		hm.put(2, "Second");
		hm.put(3, "Third");
		System.out.println(hm.get(1));
		hm.remove(0);
		System.out.println(hm.get(0));
		Set es = hm.entrySet();
		Iterator it = es.iterator();
		while (it.hasNext()) {
			Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

	}

}
