package sangdepzai;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int key = arr[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > key) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}
			arr[j + 1] = key;
		}
		for (int i = 0; i < n; i++) {
			System.out.printf(" " + arr[i]);
		}
	}
}
