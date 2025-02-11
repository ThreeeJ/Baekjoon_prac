import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());
        int cnt = 0; // 매수 횟수

        if (N == 1) {
            bw.write("0");
        } else {
            // 우선순위가 높은 숫자가 먼저 나옴 (큰 숫자) == 최대 힙처럼 사용 가능
            PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
            for (int i=1; i<N; i++) {
                q.offer(Integer.parseInt(br.readLine()));
            }
            
            while (dasom <= q.peek()) {
                int temp = q.poll(); // root 값 꺼내오기
                dasom++; // 매수 성공
                cnt++; // 매수 횟수
                q.offer(--temp);
            }

            bw.write(String.valueOf(cnt));
        }

        bw.flush();

        br.close();
        bw.close();
    }
}