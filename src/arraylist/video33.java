package arraylist;

import java.util.ArrayList;

public class video33 {
	public static void main(String[] args) {
		int a = 10;
		ArrayList<String> a1 = new ArrayList<String>();

		a1.add("check check");
		a1.add("Check Check 2");
		a1.add("Check Check 3");

		a1.remove(1);
		System.out.println(a1.toString() + " " + a1.get(1));
	}
}
