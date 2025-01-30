import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int arr[][] = new int[2][N];
        for (int i=0; i<N; i++) {
            arr[0][i] = Integer.parseInt(br.readLine());
            arr[1][i] = 0;
        }

        for (int i=N-1; i>=0; i--) {
            if (K <= 0) break;
            else if (K >= arr[0][i]) {
                arr[1][i] = K / arr[0][i];
                K %= arr[0][i];
            }
        }

        int sum = 0;
        for (int i=0; i<N; i++) {
            sum += arr[1][i];
        }
        bw.write(String.valueOf(sum));

        bw.flush();

        br.close();
        bw.close();
    }
}