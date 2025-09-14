import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        char[] str = br.readLine().toCharArray();
        int bCnt = 0;
        int sCnt = 0;
        int aCnt = 0;

        for (int i = 0; i < N; i++) {
            if (str[i] == 'B') {
                bCnt++;
            } else if (str[i] == 'S') {
                sCnt++;
            } else if (str[i] == 'A') {
                aCnt++;
            }
        }

        int max = Math.max(bCnt, Math.max(sCnt, aCnt));

        if (bCnt == sCnt && sCnt == aCnt) {
            bw.write("SCU");
        } else {
            if (bCnt == max) {
                bw.write("B");
            }
            if (sCnt == max) {
                bw.write("S");
            }
            if (aCnt == max) {
                bw.write("A");
            }
        }

        bw.flush();

        br.close();
        bw.close();
    }
}