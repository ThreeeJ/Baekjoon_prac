import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0 && k == 0) break;

            int half = n / 2 + 1;
            int anththr = n - m - k;

            if (m >= half)
                bw.write("0\n");
            else {
                if (half - m <= anththr)
                    bw.write((half - m) + "\n");
                else
                    bw.write("-1\n");
            }
        }
        
        bw.flush();

        br.close();
        bw.close();
    }
}