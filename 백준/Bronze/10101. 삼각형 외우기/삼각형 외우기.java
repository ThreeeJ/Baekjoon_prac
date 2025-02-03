import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A,B,C;
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());

        if (A+B+C == 180) {
            if (A == B && A == C && A == 60) {
                bw.write("Equilateral");
            } else if (A == B || A == C || B == C) {
                bw.write("Isosceles");
            } else {
                bw.write("Scalene");
            }
        } else {
            bw.write("Error");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}