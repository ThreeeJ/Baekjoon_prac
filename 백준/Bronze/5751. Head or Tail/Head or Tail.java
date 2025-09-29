import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;

            int mary = 0;
            int john = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i=0; i<N; i++) {
                int fb = Integer.parseInt(st.nextToken());

                if (fb == 0) mary++;
                else john++;
            }

            bw.write("Mary won " + mary + " times and John won " + john + " times\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}