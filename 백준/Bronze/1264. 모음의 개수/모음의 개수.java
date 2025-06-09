import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String s = br.readLine();

            if (s.equals("#")) break;

            s = s.toLowerCase();
            int cnt = 0;
            for (int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    cnt++;
            }

            bw.write(cnt + "\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}