import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if (A >= B+C) {
            A = B+C-1;
        } else if (B >= A+C) {
            B = A+C-1;
        } else if (C >= A+B) {
            C = A+B-1;
        }

        bw.write(String.valueOf(A+B+C));
        bw.flush();

        br.close();
        bw.close();
    }
}