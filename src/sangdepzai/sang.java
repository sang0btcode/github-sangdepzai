package sangdepzai;

import java.util.Scanner;

public class sang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soCanNhap = 123, soNhap, dem = 0;
		boolean ketQua = false;

		System.out.print("Nhập số cần nhập: ");

		while (true) {
			soNhap = sc.nextInt();
			if (soNhap == soCanNhap) {
				ketQua = true;
				System.out.println("Nhập thành công!");
				break;
			} else {
				System.out.println("Sai rồi!");
				dem++;
			}

			if (dem == 5) {
				System.out.println("Đã hết số lần nhập tối đa. Chương trình kết thúc!");
				break;
			}
		}

	}
}
