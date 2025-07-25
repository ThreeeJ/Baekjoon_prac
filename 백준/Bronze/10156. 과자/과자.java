import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken()); // 과자 가격
        int N = Integer.parseInt(st.nextToken()); // 과자 개수
        int M = Integer.parseInt(st.nextToken()); // 가진 돈

        if (K * N >= M) {
            bw.write(String.valueOf(K*N-M) + "\n");
        } else {
            bw.write("0\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}