import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int check = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            int a = Integer.parseInt(st.nextToken());
            int cnt = 1;

            for (int j=2; j<=a; j++) {
                if (a % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) check++;
        }

        bw.write(String.valueOf(check));

        bw.flush();

        br.close();
        bw.close();
    }
}