package sangdepzai;

import java.util.Scanner;

public class NhapSoDung {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soCanNhap, dem = 0;
		boolean ketQua = false;

		System.out.print("Nhập số cần nhập: ");
		soCanNhap = sc.nextInt();

		while (!ketQua && dem < 5) {
			if (sc.hasNextInt()) {
				int soNhap = sc.nextInt();
				if (soNhap == soCanNhap) {
					ketQua = true;
					System.out.println("Nhập thành công!");
				} else {
					System.out.println("Sai rồi! Vui lòng nhập lại: ");
					dem++;
				}
			} else {
				System.out.println("Dữ liệu nhập không hợp lệ! Vui lòng nhập lại: ");
				sc.next(); // Xóa dữ liệu sai
				dem++;
			}
		}

		if (!ketQua) {
			System.out.println("Đã hết số lần nhập tối đa. Chương trình kết thúc!");
		}
	}
}