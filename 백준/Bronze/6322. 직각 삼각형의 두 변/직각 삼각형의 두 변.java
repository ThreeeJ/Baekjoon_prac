import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) { break; }

            if (cnt != 1) bw.write("\n\n");
            bw.write("Triangle #" + cnt + "\n");

            double temp;
            if (a == -1) {
                temp = Math.pow(c, 2) - Math.pow(b, 2);
                if (temp <= 0) bw.write("Impossible.");
                else bw.write( "a = "  + String.format("%.3f", Math.sqrt(temp)));
            } else if (b == -1) {
                temp = Math.pow(c, 2) - Math.pow(a, 2);
                if (temp <= 0) bw.write("Impossible.");
                else bw.write("b = "  + String.format("%.3f", Math.sqrt(temp)));
            } else if (c == -1) {
                temp = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

                bw.write("c = "  + String.format("%.3f", temp));
            }

            cnt++;
        }

        bw.flush();

        br.close();
        bw.close();
    }
}