import java.io.*;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Vector<Integer> v = new Vector<>();

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            v.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(v, Collections.reverseOrder()); // 내림차순

        int sum = 0;
        for (int i=0; i<M; i++) {
            if (v.size() == 0) break;

            if (v.get(0) > 0) {
                sum += v.remove(0); // 제일 큰 수 더하기
                if (v.size() != 0) {
                    v.remove(v.size()-1); // 제일 작은 수 주기
                }
            } else { // 음수라면 턴 건너뛰기
                continue;
            }
        }

        bw.write(String.valueOf(sum));
        bw.flush();

        br.close();
        bw.close();
    }
}