import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A, B;

        while (true) {
            A = s.nextInt();
            B = s.nextInt();

            if (A == 0 && B == 0)
                break;

            System.out.println(A+B);
        }

        s.close();
    }
}