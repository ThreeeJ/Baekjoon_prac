import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int []arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int n = 1;
        while (true) {
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if (n % arr[i] == 0) {
                    cnt++;
                }
            }

            if (cnt >= 3) {
                break;
            }

            n++;
        }

        bw.write(String.valueOf(n));
        bw.flush();

        br.close();
        bw.close();
    }
}