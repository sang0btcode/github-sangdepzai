package Stringchuoi;

import java.util.ArrayList;
import java.util.Scanner;

public class video388 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student st1 = new Student("Nguyen Van Sang", "1");
		Student st2 = new Student("Nguyen Van Huong", "2");
		Student st3 = new Student("Nguyen Minh Truong", "3");
		Student st4 = new Student("Tran Quoc Tuan", "4");
		Student st5 = new Student("Le Minh Hanh", "5");

		ArrayList<Student> arr = new ArrayList();
		arr.add(st5);
		arr.add(st4);
		arr.add(st3);
		arr.add(st2);
		arr.add(st1);

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith("Sang")) {
				System.out.println("start with : " + arr.get(i));
			}

		}

	}

}
