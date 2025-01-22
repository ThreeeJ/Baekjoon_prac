import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lineNum = 0;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) break;

            if (lineNum != 0) {
                bw.newLine();
            }
            lineNum++;

            if (b % a == 0) { // 약수, factor
                bw.write("factor");
            } else if (a % b == 0) { // 배수, multiple
                bw.write("multiple");
            } else { // 둘 다 아님, neither
                bw.write("neither");
            }
        }

        bw.flush();

        br.close();
        bw.close();
    }
}