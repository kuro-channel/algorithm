import java.util.*;
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
		int[] aArray = { a1, a2, a3 };
		practice2(aArray);

		// 問題ID: 003
		int n = rand.nextInt(100);
		System.out.println("N:" + n);
		List<Integer> nList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int tmpNum = rand.nextInt(100);
			nList.add(tmpNum);
			System.out.println("tmpNum:" + tmpNum);
		}
		practice3(n, nList);
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

	/**
	 * p.17~18 整数NとN個の整数
	 * A1+A2・・・AのNを出力
	 * 
	 * @param n     整数N
	 * @param nList N個の整数
	 */
	private static void practice3(int n, List<Integer> nList) {
		int sum = 0;

		// N個の整数分ループ
		for (Integer num : nList) {
			sum += num;
		}
		System.out.println("003 合計：" + sum);
	}
}
