package practice.Java;

public class Strings {

	public static void main(String[] args) {
		String s1 = "welcome 2024.Bye bye 2023 == xx ==";
		String s2 = "welcome 2024.Bye bye 2023";
		System.out.println(s1 + " " + s2);
		String s = new String("Learn Java 2024");
		System.out.println(s);
		String[] indvStr = s.split("Java");
		System.out.println(indvStr[0]);
		System.out.println(indvStr[1]);
		System.out.println(indvStr[1].trim());
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
			System.out.println();
		}
		System.out.println("========================");
		
		// print in reverse order
		for(int j=s.length()-1;j>=0;j--)
		{
			System.out.println(s.charAt(j));
		}

	}

}
