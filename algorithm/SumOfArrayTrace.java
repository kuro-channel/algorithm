package algorithm;

public class SumOfArrayTrace {

	public static void main(String args[]) {
		// ループ処理 変数の変化を感じること
		int[] array = { 72, 68, 92, 88, 41, 53, 97, 84, 39, 55 };
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println(sum);
	}
}
