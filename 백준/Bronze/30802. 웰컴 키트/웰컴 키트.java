import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N;
        int size[] = new int[6]; // S, M, L, XL, XXL, XXXL
        int T, P;

        N = s.nextInt();
        for (int i=0; i<6; i++) {
            size[i] = s.nextInt();
        }
        T = s.nextInt();
        P = s.nextInt();

        int Tcnt = 0;

        for (int i=0; i<6; i++) {
            if (size[i] % T == 0)
                Tcnt += size[i] / T;
            else {
                Tcnt += size[i] / T + 1;
            }
        }

        System.out.println(Tcnt);
        System.out.printf("%d %d", N/P, N%P);

        s.close();
    }
}