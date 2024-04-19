package Stringchuoi;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		System.out.println("Nhập số lượng thành viên");
		int n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.println("Nhập tên thứ " + i);
			String name = scanner.nextLine();
			arr.add(name);
		}
		System.out.println("Nhập họ cần tìm");
		String ho = scanner.nextLine();
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).startsWith(ho)) {
				System.out.println("Danh sách bạn cần tìm: " + arr.get(i));
			}

		}

	}
}
