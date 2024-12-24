import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N, X, cnt = 0;
        N = s.nextInt();
        X = s.nextInt();
        int arr[] = new int[N];

        for (int i=0; i<N; i++) {
            int num = s.nextInt();
            if (num < X) {
                arr[cnt++] = num;
            }
        }

        for (int i=0; i<cnt; i++) {
            System.out.printf("%d ", arr[i]);
        }

        s.close();
    }
}