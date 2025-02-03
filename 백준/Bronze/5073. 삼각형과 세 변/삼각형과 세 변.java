import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A,B,C;
        boolean first = true;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0 && C == 0) break;

            if (first) {
                first = !first;
            } else {
                bw.newLine();
            }

            if (A >= B+C || B >= A+C || C >= A+B) {
                bw.write("Invalid");
            } else {
                if (A == B && A == C) {
                    bw.write("Equilateral");
                } else if (A == B || A == C || B == C) {
                    bw.write("Isosceles");
                } else {
                    bw.write("Scalene");
                }
            }
        }

        bw.flush();

        br.close();
        bw.close();
    }
}