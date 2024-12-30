import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N, M;
        double sum = 0;

        N = s.nextInt();
        int arri[] = new int[N];
        double arrd[] = new double[N];

        for (int i = 0; i<N; i++) {
            arri[i] = s.nextInt();
        }

        M = arri[0];
        for (int n : arri) { // 최대값 구하기
            if (n > M) M = n;
        }

        for (int i=0; i<N; i++) { // 세준이식 환산
            arrd[i] = (double)arri[i] / M * 100;
        }

        for (double n : arrd) { // 모든 값 더하기
            sum += n;
        }

        System.out.println(sum/N);

        s.close();
    }
}