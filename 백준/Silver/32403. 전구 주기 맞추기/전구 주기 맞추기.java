import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int cnt = 0; // 몇 번의 작업을 하는지 카운트 하는 변수
        st = new StringTokenizer(br.readLine()); // 전구 주기 입력받기
        for (int i=0; i<N; i++) {
            int a = Integer.parseInt(st.nextToken());
            int z = 0; // z만큼 감소하거나 증가시켜서 0이 될때까지 증가시키는 변수

            while (true) {
                if (a > T) {
                    cnt += a - T;
                    break;
                }
                else if (T % a == 0) break;
                else {
                    if (T % (a-z) == 0 || T % (a+z) == 0) {
                        cnt += z;
                        break;
                    }
                }

                z++;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();

        br.close();
        bw.close();
    }
}