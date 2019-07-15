package algorithm;

public class InsertionSort {

	public static void pringArray(int[] array, String part) {
		System.out.printf(part + ":");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[" + array[i] + "]");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		// 挿入法（ソートアルゴリズム）
		int[] array = { 72, 68, 92, 88, 41, };
		int ins, comp, temp;

		// 外側のループ：挿入するデータの添字 昇順ソート①
		pringArray(array, "part1（昇順ソート前）");
		for (ins = 1; ins <= array.length - 1; ins++) {
			// 挿入する値を一時退避
			temp = array[ins];
			// 内側のループ：挿入する要素を比較する要素の添字（すでにソート済みの要素）
			for (comp = ins - 1; comp >= 0; comp--) {
				if (temp < array[comp]) {
					array[comp + 1] = array[comp];
				} else {
					// ループ終了
					break;
				}
			}
			array[comp + 1] = temp;
		}
		pringArray(array, "part1（昇順ソート後）");

		// 外側のループ：挿入するデータの添字 降順ソート
		pringArray(array, "part2（降順ソート前）");
		for (ins = 1; ins <= array.length - 1; ins++) {
			// 挿入する値を一時退避
			temp = array[ins];
			// 内側のループ：挿入する要素を比較する要素の添字（すでにソート済みの要素）
			for (comp = ins - 1; comp >= 0; comp--) {
				if (temp > array[comp]) {
					array[comp + 1] = array[comp];
				} else {
					// ループ終了
					break;
				}
			}
			array[comp + 1] = temp;
		}
		pringArray(array, "part2（降順ソート後）");

		// 外側のループ：挿入するデータの添字 昇順ソート（break使わない）
		pringArray(array, "part3（昇順ソート前）");
		for (ins = 1; ins <= array.length - 1; ins++) {
			// 挿入する値を一時退避
			temp = array[ins];
			// 内側のループ：挿入する要素を比較する要素の添字（すでにソート済みの要素）
			for (comp = ins - 1; comp >= 0 && temp < array[comp]; comp--) {
				array[comp + 1] = array[comp];
			}
			array[comp + 1] = temp;
		}
		pringArray(array, "part3（昇順ソート後）");
	}
}
