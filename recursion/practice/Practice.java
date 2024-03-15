package practice;

/**
 * Recursion：アルゴリズム練習
 */
public class Practice {

	public static void main(String[] arg) {
		System.out.println(gcd(44, 242));
		System.out.println(gcd(3355, 2379));
		System.out.println(summation(5));
		System.out.println(subtractBy3Count(12));
		System.out.println(divideBy3Count(243));
	}

	/**
	 * 最大公約数を求める（再帰）
	 * https://recursionist.io/dashboard/course/2/lesson/133
	 * 
	 * @param m 整数m
	 * @param n 整数n
	 */
	private static int gcd(int m, int n) {
		if (n == 0) return m;
		return gcd(n, m % n);
	}

	/**
	 * 1+2+3・・・（再帰）
	 * https://recursionist.io/dashboard/course/2/lesson/142
	 * 
	 * @param m 整数m
	 * @param n 整数n
	 */
	private static int summation(int m) {
		if (m == 0) {
			return 0;
		}
		return summation(m - 1) + m;
	}

	/**
	 * n を受け取り、3 未満になるまで 3 を再帰的に引き続ける（再帰）
	 * https://recursionist.io/dashboard/course/2/lesson/142
	 * 
	 * @param m 整数m
	 * @param n 整数n
	 */
	private static int subtractBy3Count(int n) {
		if (n < 3) {
			return 0;
		}
		return subtractBy3Count(n - 3) + 1;
	}

	/**
	 * n を受け取り、1 以下になるまで 3 で再帰的に割り続ける（再帰）
	 * https://recursionist.io/dashboard/course/2/lesson/142
	 * 
	 * @param m 整数m
	 * @param n 整数n
	 */
	private static int divideBy3Count(int n) {
		if (n <= 1) {
			return 0;
		}
		return divideBy3Count(n / 3) + 1;
	}
}
