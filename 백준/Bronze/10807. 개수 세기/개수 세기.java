import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N, v, cnt = 0;
        N = s.nextInt();
        int arr[] = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = s.nextInt();
        }
        v = s.nextInt();

        for (int i=0; i<N; i++) {
            if (arr[i] == v) cnt++;
        }

        System.out.println(cnt);

        s.close();
    }
}