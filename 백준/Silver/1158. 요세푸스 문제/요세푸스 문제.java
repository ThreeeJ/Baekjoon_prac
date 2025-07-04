import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // Queue 인터페이스를 LinkedList 구현체로 생성
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        bw.write("<");
        while (q.size() > 1) {

            for (int i = 0; i < K - 1; i++) {
                q.offer(q.poll());
            }

            bw.write(q.poll() + ", ");
        }
        bw.write(q.poll() + ">");

        bw.flush();

        br.close();
        bw.close();
    }
}