import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            char ch[] = br.readLine().toCharArray();
            StringBuilder after = new StringBuilder();
            for (int i=0; i<ch.length; i++) {
                int X = ch[i] - 'A';
                after.append((char)(((a*X+b) % 26) + 'A'));
            }

            bw.write(after + "\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}