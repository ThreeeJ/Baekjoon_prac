import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int T, A, B;
        T = s.nextInt();

        for (int i=0; i<T; i++) {
            A = s.nextInt();
            B = s.nextInt();
            System.out.println(A+B);
        }

        s.close();
    }
}