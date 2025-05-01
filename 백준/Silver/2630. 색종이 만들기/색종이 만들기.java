import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Main{
    static int cnt[] = new int[2]; // 0번은 white, 1번 blue

    static void count(int N, int arr[][], int X, int Y) {
        int white = 0;
        int blue = 0;
        boolean isOne = true;

        if (N == 1) {
            if (arr[X][Y] == 0) white++;
            else blue++;

            cnt[0] += white;
            cnt[1] += blue;

            return; // 끝
        } else {
            int color = arr[X][Y];

            for (int i=X; i<X+N; i++) {
                for (int j=Y; j<Y+N; j++) {
                    if (color != arr[i][j]) {
                        isOne = false;
                        break;
                    }
                }
                if (!isOne) break;
            }

            if (isOne) {
                if (color == 0) cnt[0] += (++white);
                else cnt[1] += (++blue);

                return;
            } else {
                count(N/2, arr, X, Y); // N=4, X=0, Y=0;
                count(N/2, arr, X + N/2, Y); // N=4, X=4, Y=0;
                count(N/2, arr, X, Y + N/2); // N=4, X=0, Y=4;
                count(N/2, arr, X + N/2, Y + N/2); // N=4, X=4, Y=4;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[N][N];
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

       count(N, arr, 0, 0);

        bw.write(String.valueOf(cnt[0]));
        bw.newLine();
        bw.write(String.valueOf(cnt[1]));

        bw.flush();

        bw.flush();
        bw.close();
    }
}