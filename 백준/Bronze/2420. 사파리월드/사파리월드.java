import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long N, M; // int -> long
        N = s.nextLong(); // nextInt -> nextLong
        M = s.nextLong();
        long NM = N - M;

        if (NM < 0) {
            NM = -NM;
        }
        System.out.println(NM);

        s.close();
    }
}