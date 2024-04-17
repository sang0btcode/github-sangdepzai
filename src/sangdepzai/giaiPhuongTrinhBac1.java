package sangdepzai;

import java.util.Scanner;

public class giaiPhuongTrinhBac1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào biến a =");
		int a = scanner.nextInt();
		System.out.println("Nhập vào biến b =");
		int b = scanner.nextInt();

		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nhiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình không có nhiệm");
		} else {
			float x = (float) -b / a;
			System.out.printf("Phương trình có nhiệm = %.3f", x);

		}

	}
}
