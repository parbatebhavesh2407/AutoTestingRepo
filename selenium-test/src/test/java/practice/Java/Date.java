package practice.Java;

import java.text.SimpleDateFormat;
import java.util.*;

public class Date {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat t = new SimpleDateFormat("M/d/YYYY");
		System.out.println(t.format(d));
		
		//Calendar c = new Calendar.getInstance();
		//c.getTime();
	}

}
