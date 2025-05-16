import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        for (int i=N; i>0; i--) {
            for (int j=0; j<N-i; j++) {
                System.out.print(" ");
            }
            for (int j=i; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        s.close();
    }
}
