package algorithm;

import java.util.Scanner;

public class SequentialSearch {
	// 線形探索のアルゴリズム
	// 1. posを-1で初期化する。（添字の初期化）
	// 2. ループカウンタiを0~9まで変化させる繰り返し。
	//    比較の結果、同じだったらposを要素番号iで上書き、表示
	public static void main(String args[]) {
		int[] array = { 72, 68, 92, 88, 41, 53, 97, 84, 39, 55 };

		Scanner scn = new Scanner(System.in);
		int x, pos;
		pos = -1;
		x = scn.nextInt();

		// 同じ値があった時点で繰り返し終了
		for (int i = 0; i < array.length && pos == -1; i++) {
			if (x == array[i]) {
				pos = i;
			}
		}
		// 画面に表示
		System.out.println("X = " + x);
		System.out.println("pos = " + pos);

		// 配列の最大値と最小値を求めるアルゴリズム
		int max, min;
		// 先頭の要素を仮の最大・最小値とする
		max = array[0];
		min = array[0];

		for (int i = 1; i < array.length; i++) {
			// 最大値を更新する
			if(array[i] > max) {
				max = array[i];
			}
			// 最小値を更新する
			if(array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("MAX : " + max);
		System.out.println("MIN : " + min);
	}
}
