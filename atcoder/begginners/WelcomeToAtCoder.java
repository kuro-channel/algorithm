import java.util.*;

public class WelcomeToAtCoder {
    public static void main(String[] arg) {
        // https://atcoder.jp/contests/abs/tasks/practice_1

        // 標準入力を受け取り
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int product = a * b;
            String strProduct = product % 2 == 0 ? "Even" : "Odd";

            System.out.println(strProduct);
            scanner.close();

        } catch (InputMismatchException e) {
            System.out.println("数値を入力してください");
        }
    }
}
