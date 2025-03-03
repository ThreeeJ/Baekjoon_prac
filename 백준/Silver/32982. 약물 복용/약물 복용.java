import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int start[] = new int[3];
        int end[] = new int[3];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<3; i++) {
            start[i] = Integer.parseInt(st.nextToken());
            end[i] = Integer.parseInt(st.nextToken());
        }

        int i;
        int now = -1;
        for (i = 0; i<N; i++) {
            if (now != -1) { // 첫 날 아침 제외
                if (now+K-1440 >= start[0]) { // 아침 시간 검사
                    now = Math.min(now+K-1440, end[0]);
                } else break;
            } else { // 첫 시작은 아침먹고 난 후
                now = end[0];
            }

            // 점심 검사
            if (now+K >= start[1]) { //
                now = Math.min(now+K, end[1]);
            } else break;

            // 저녁 검사
            if (now+K >= start[2]) { //
                now = Math.min(now+K, end[2]);
            } else break;
        }

        if (i == N) bw.write("YES");
        else bw.write("NO");

        bw.flush();

        br.close();
        bw.close();
    }
}