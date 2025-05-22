import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int bunza = 1;
        int bunmo = 1;
        for (int i=0; i<K; i++) { // 분자
            bunza *= (N-i);
        }
        for (int i=0; i<K; i++) { // 분모
            bunmo *= (K-i);
        }

        bw.write(String.valueOf(bunza/bunmo));

        bw.flush();

        bw.flush();
        bw.close();
    }
}