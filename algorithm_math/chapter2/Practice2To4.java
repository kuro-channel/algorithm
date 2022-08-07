import java.util.Random;

/**
 * 第2章 4: 計算回数を見積ろう～全探索と二分探索～
 */
public class Practice2To4 {

	public static void main(String[] arg) {
		Random rand = new Random();

		// 問題ID: 006
		int n = rand.nextInt(100);
		System.out.println("p.42 問題2.4.3");
		System.out.println("n：" + n);

		// 整数N: 2N+3の値を出力
		// 「計算回数はざっくり1回」⇒ アルゴリズムは「定数時間」
		int answer = 2 * n + 3;
		System.out.println("2N+3：" + answer);

		// 問題ID: 007
		int N = rand.nextInt(100);
		int X = rand.nextInt(100);
		int Y = rand.nextInt(100);
		// int N = 15;
		// int X = 3;
		// int Y = 5;

		System.out.println("p.42 問題2.4.4");
		System.out.println("N：" + N);
		System.out.println("X：" + X);
		System.out.println("Y：" + Y);

		// N以下の正の整数の中で、Xの倍数またはYの倍数であるものの個数
		// 例：N = 15, X = 3. Y = 5 / 7
		int count = 0;

		for (int i = 1; i <= N; i++) {
			// X, Yの倍数の場合はカウントアップ
			if (i % X == 0 || i % Y == 0) {
				count++;
			}
		}
		// 「計算回数はざっくりN回」⇒ アルゴリズムは「（Nに関して）線形時間である」
		System.out.println("個数：" + count);

		// 問題ID: 008
		N = rand.nextInt(100);
		int S = rand.nextInt(100);
		// N = 3;
		// int S = 4;

		System.out.println("p.44 問題2.4.5");
		System.out.println("N：" + N);
		System.out.println("S：" + S);

		// 赤、青1枚ずつ、それぞれのカードに1以上N以下の整数を書き込む
		// カードに書かれた整数の合計がS以下になるような書き方はいくつあるか？
		// 例：N = 3, S = 4 / 6
		count = 0;

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (i + j <= S) {
					count++;
				}
			}
		}
		// 「計算回数はざっくりNの二乗回」⇒ アルゴリズムは「全探索」
		System.out.println("個数：" + count);
	}
}
