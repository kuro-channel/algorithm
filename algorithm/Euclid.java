package algorithm;

import java.util.Scanner;

public class Euclid {

	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int a, b;

		// ユークリッドの互除法
		a = scanner.nextInt();
		b = scanner.nextInt();

		// aとbの最大公約数を求める
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		System.out.println(a);
	}
}
