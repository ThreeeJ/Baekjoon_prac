import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String S;
        int i;

        S = s.next();
        i = s.nextInt();

        char ch = S.charAt(i-1);
        System.out.printf("%c", ch);

        s.close();
    }
}