package REFACTOR;

import java.util.Scanner;

public class Equation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số bậc 2, a = ");
		float a = scanner.nextFloat();
		System.out.print("Nhập hệ số bậc 1, b = ");
		float b = scanner.nextFloat();
		System.out.print("Nhập hằng số tự do, c = ");
		float c = scanner.nextFloat();
		Equation.Quadratic(a, b, c);
		Equation.Linear(a, b);
		scanner.close();
	}

	public static void Linear(float a, float b) {
		if (a == 0) {
			if (b == 0)
				System.out.println("Phương trình vô số nghiệm");

			else
				System.out.println("Phương trình vô nghiệm!");
		} else {
			System.out.println("Phương trình có một nghiệm: " + "x = " + (-b / a));
		}

	}

	/**
	 * Giải phương trình bậc 2: ax2 + bx + c = 0
	 *
	 * @param a: hệ số bậc 2
	 * @param b: hệ số bậc 1
	 * @param c: số hạng tự do
	 * @param d: hệ số bậc 0
	 */
	public static void Quadratic(float a, float b, float c) {

		// kiểm tra các hệ số
		if (a == 0) {
			Linear(b, c);
			return;
		}
		// tính delta
		float delta = b * b - 4 * a * c;
		float x1;
		float x2;
		// tính nghiệm
		if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 *

					a));

			x2 = (float) ((-b - Math.sqrt(delta)) / (2 *

					a));

			System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);

		} else if (delta == 0) {
			x1 = (-b / (2 * a));
			System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);

		} else {
			System.out.println("Phương trình vô nghiệm!");
		}
	}
}
