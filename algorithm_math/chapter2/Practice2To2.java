import java.util.Random;
import java.util.stream.IntStream;

/**
 * 第2章 2: アルゴリズムのための数学の基本知識
 */
public class Practice2To2 {

	public static void main(String[] arg) {
		Random rand = new Random();

		// 問題ID: 005
		int n = rand.nextInt(10);
		System.out.println("p.30 問題2.2.4");
		System.out.println("n：" + n);

		int[] nArray = new int[n];
		for (int i = 0; i < n; i++) {
			int tmpNum = rand.nextInt(100);
			nArray[i] = tmpNum;
			System.out.println("nArray" + "[" + i + "]:" + nArray[i]);
		}
		practice(nArray);
	}

	/**
	 * p.30 章末問題 005
	 * 
	 * @param aArray 整数A1,A2・・・
	 */
	private static void practice(int[] aArray) {
		int sum = IntStream.of(aArray).reduce(0, (a, b) -> a + b);
		System.out.println("合計:" + sum);
		// 余りを出力
		System.out.println("余り：" + sum % 100);
	}
}
