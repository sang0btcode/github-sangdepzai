package sangdepzai;

import java.util.Scanner;

public class tinhTienDien {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soDien, thanhTien = 0;

		System.out.print("Nhập số điện đã sử dụng: ");
		soDien = sc.nextInt();

		if (soDien <= 100) {
			thanhTien = soDien * 1000;
		} else if (soDien <= 250) {
			thanhTien = 100000 + (soDien - 100) * 1500;
		} else {
			thanhTien = 275000 + (soDien - 250) * 2000;
		}

		System.out.printf("Số tiền điện phải trả là: %,dđ", thanhTien);
	}
}
