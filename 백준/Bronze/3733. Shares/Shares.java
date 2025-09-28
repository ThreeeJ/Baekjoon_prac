import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        while ((str = br.readLine()) != null && !str.isEmpty()) {
            StringTokenizer st = new StringTokenizer(str);

            long N = Long.parseLong(st.nextToken());
            long S = Long.parseLong(st.nextToken());

            long share = S / (N + 1);
            
            bw.write(String.valueOf(share) + "\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}