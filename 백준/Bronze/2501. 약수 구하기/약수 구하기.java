import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Vector<Integer> v = new Vector<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i=1; i<=N; i++) {
            if (N % i == 0) {
                v.add(i);
            }
        }

        if (v.size() >= K) {
            bw.write(String.valueOf(v.get(K-1)));
        } else {
            bw.write(String.valueOf(0));
        }

        bw.flush();

        br.close();
        bw.close();
    }
}