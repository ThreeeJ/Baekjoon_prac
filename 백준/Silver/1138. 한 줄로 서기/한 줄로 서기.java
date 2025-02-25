import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[N];
        Arrays.fill(arr, -1); // 비어있는 자리는 -1
        for (int i = 0; i<N; i++) {
            int leftBig = Integer.parseInt(st.nextToken()); // 왼쪽에 큰 애 몇명
            int cnt = -1; // 빈자리 카운트
            for (int j=0; j<N; j++) {
                if (arr[j] == -1) {
                    cnt++;
                }

                if (cnt == leftBig) {
                    arr[j] = i + 1;
                    break;
                }
            }
        }

        for (int i=0; i<N; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}