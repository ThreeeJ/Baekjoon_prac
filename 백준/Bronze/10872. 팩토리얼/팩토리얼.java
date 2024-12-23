import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N, fac = 1;
        N = s.nextInt();

        for (int i=N; i>0; i--) {
            fac *= i;
        }
        System.out.println(fac);

        s.close();
    }
}