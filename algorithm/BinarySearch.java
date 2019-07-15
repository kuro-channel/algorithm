package algorithm;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// 昇順にソート済み
		int[] array = { 39, 41, 53, 55, 68, 72, 84, 88, 92, 97 };

		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int pos = -1;
		int left = 0;
		int right = array.length - 1;

		System.out.println("X = " + x);

		// a[middle]とxを比較する
		while (pos == -1 && left <= right) {
			int middle = (left + right) / 2;
			if (array[middle] == x) {
				pos = middle;
			} else if (array[middle] > x) {
				right = middle - 1;
			} else if (array[middle] < x) {
				left = middle + 1;
			}
		}
		System.out.println("pos = " + pos);

	}

}
