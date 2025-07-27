import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int minus = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(br.readLine());
            total += t;
            if (total < 0) {
                if (total < minus) {
                    minus = total;
                }
            }
        }

        bw.write(Math.abs(minus) + "\n");

        bw.flush();

        br.close();
        bw.close();
    }
}