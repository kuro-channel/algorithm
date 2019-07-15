package algorithm;

public class Kuku {

	public static void main(String[] args) {

		// 九九の計算
		for (int step = 1; step <= 9; step++) {
			System.out.printf("%dの段", step);
			for (int num = 1; num <= 9; num++) {
				System.out.print(" " + step * num + " ");
			}
			System.out.println();
		}
	}
}
