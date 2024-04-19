package Stringchuoi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class video402 {
	public static void main(String[] args) {
		System.out.println("run video");
		Pattern pattern = Pattern.compile("\\d{12}");
		Matcher matcher = pattern.matcher("123456789012b");
		System.out.println("Input String matches regex - " + matcher.matches());
	}
}
