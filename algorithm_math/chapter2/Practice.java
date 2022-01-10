import java.util.Arrays;
import java.util.Random;

public class Practice {

	public static void main(String[] arg) {
		Random rand = new Random();

		// 問題ID: 001
		int orangeCount = rand.nextInt(100);
		System.out.println("オレンジ個数：" + orangeCount);
		practice1(orangeCount);

		// 問題ID: 002
		int a1 = rand.nextInt(100);
		int a2 = rand.nextInt(100);
		int a3 = rand.nextInt(100);
		System.out.println("A1：" + a1);
		System.out.println("A2：" + a2);
		System.out.println("A3：" + a3);
		int[] aArray = {a1, a2, a3};
		practice2(aArray);
	}


	/**
	 * p.16 リンゴが5個, みかんがN個
	 * リンゴとみかんの個数を出力するプログラム
	 * 
	 * @param orangeCount みかんの個数
	 */
	private static void practice1(int orangeCount) {
		int appleCount = 5;
		int sum = orangeCount + appleCount;
		System.out.println("001 合計：" + sum + "個");
	}

	/**
	 * p.17 整数A1,A2,A3
	 * A1+A2+A3を出力
	 * 
	 * @param aArray 整数A1,A2,A3
	 */
	private static void practice2(int[] aArray) {
		int sum = Arrays.stream(aArray).sum();
		System.out.println("002 合計：" + sum + "個");
	}
}
