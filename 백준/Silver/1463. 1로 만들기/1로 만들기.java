import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int X = s.nextInt();

        int check[] = new int[X+1];
        check[1] = 0;

        if (X == 2) {
            check[2] = 1;
        } else if (X == 3) {
            check[2] = 1;
            check[3] = 1;
        } else if (X > 3) {
            check[2] = 1;
            check[3] = 1;

            for (int i=4; i<=X; i++) {
                if (i % 3 == 0 && i % 2 == 0) { // 2와 3으로 둘 다 나누어질 때
                    check[i] = Math.min(Math.min(check[i/3], check[i/2]), check[i-1]) + 1;
                } else if (i % 3 == 0) { // 3으로 나누어질 때
                    check[i] = Math.min(check[i/3], check[i-1]) + 1;
                } else if (i % 2 == 0) { // 2로 나누어질 때
                    check[i] = Math.min(check[i/2], check[i-1]) + 1;
                } else {
                    check[i] = check[i-1] + 1;
                }
            }
        }

        System.out.println(check[X]);
    }
}