import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(st.nextToken());

            if (N == a) cnt++;
        }

        bw.write(String.valueOf(cnt));

        bw.flush();

        br.close();
        bw.close();
    }
}