import java.util.*;

public class PlacingMarbles {
    public static void main(String[] arg) {
        // https://atcoder.jp/contests/abs/tasks/abc081_a

        // 標準入力を受け取り
        Scanner scanner = new Scanner(System.in);

        String inputStr = scanner.next();

        // 入力した文字列を配列に分解
        String[] inputArr = inputStr.split("");

        // 結果格納変数
        int result = 0;

        for (String input : inputArr) {
            if (Integer.valueOf(input) == 1) {
                result++;
            }
        }

        System.out.println(result);
        scanner.close();
    }
}
