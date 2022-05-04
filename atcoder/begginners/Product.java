import java.util.*;

public class Product {
    public static void main(String[] arg) {
        // https://atcoder.jp/contests/abs/tasks/abc086_a

        // 標準入力を受け取り
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            String s = scanner.next();
            System.out.println((a + b + c) + " " + s);
            
            scanner.close();

        } catch (InputMismatchException e) {
            System.out.println("数値を入力してください");
        }
    }
}
