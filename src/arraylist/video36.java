package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class video36 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Double> arrNumber = new ArrayList();

		while (true) {
			System.out.print("Nhập vào 1 số thực bất kì: ");
			double input = scanner.nextDouble();
			arrNumber.add(input);
			scanner.nextLine();
			System.out.print("Continue ? Y or N ??? ");
			String option = scanner.nextLine();
			if (option.equals("N") || option.equals("n")) {
				break;
			}

		}
		System.out.println(" Check array: " + arrNumber);
		double sum = 0;
		for (int i = 0; i < arrNumber.size(); i++) {
			sum += arrNumber.get(i);
		}
		System.out.println("sum array" + sum);

	}
}
