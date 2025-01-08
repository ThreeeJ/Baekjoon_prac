import java.util.Scanner;

public class Main {
    static int sum(int k, int n) {
        if (n == 1) { // 1호
            return 1;
        } else if (k == 0) { // 0층
            return n;
        } else {
            return sum(k - 1, n) + sum(k, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int T, k, n, total;
        T = s.nextInt();

        for (int i=0; i<T; i++) {
            k = s.nextInt();
            n = s.nextInt();
            total = sum(k, n);
            System.out.println(total);
        }

        s.close();
    }
}