import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x, y;
        x = s.nextInt();
        y = s.nextInt();

        int gcd = 1; // 최대공약수
        int lcm = 1; // 최소공배수

        int i = 2;
        while (true) {
            if (i > x || i > y) { // 최소공배수 구하고 끝
                lcm *= x;
                lcm *= y;
                break;
            }
            else {
                if (x % i == 0 && y % i == 0) {
                    gcd *= i;
                    lcm *= i;
                    x /= i;
                    y /= i;
                    i = 2;
                    continue;
                }
            }
            i++;
        }

        System.out.printf("%d\n%d\n", gcd, lcm);

        s.close();
    }
}