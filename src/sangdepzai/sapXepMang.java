package sangdepzai;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class sapXepMang {
	public static void main(String[] args) {
		try {
			FileInputStream input = new FileInputStream("input.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			int n = Integer.parseInt(reader.readLine());
			System.out.println(n);
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(reader.readLine());
			}
			quicksort(arr, 0, n - 1);
			for (int i = 0; i < n; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static void quicksort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = handle(arr, low, high);
			quicksort(arr, low, pi - 1);
			quicksort(arr, pi + 1, high);
		}
	}

	private static int handle(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		return i;
	}
}
