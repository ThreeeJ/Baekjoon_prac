import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int Y = 0, M = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            int a = Integer.parseInt(st.nextToken());

            Y += ((a / 30) + 1) * 10;
            M += ((a / 60) + 1) * 15;
        }

        if (Y == M) {
            bw.write("Y M " + String.valueOf(Y));
        } else if (Y < M) {
            bw.write("Y " + String.valueOf(Y));
        } else {
            bw.write("M " + String.valueOf(M));
        }

        bw.flush();

        br.close();
        bw.close();
    }
}