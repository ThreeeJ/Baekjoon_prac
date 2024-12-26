import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int T;
        String S;
        T = s.nextInt();

        for (int i=0; i<T; i++) {
            S = s.next();
            int len = S.length();
            char c1 = S.charAt(0);
            char c2 = S.charAt(len-1);
            System.out.printf("%c%c\n", c1, c2);
        }

        s.close();
    }
}