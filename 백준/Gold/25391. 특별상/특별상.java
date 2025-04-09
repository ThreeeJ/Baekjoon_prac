import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Vector<Vector<Integer>> v = new Vector<>();
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());

            Vector<Integer> temp = new Vector<>();
            temp.add(Integer.parseInt(st.nextToken()));
            temp.add(Integer.parseInt(st.nextToken()));

            v.add(temp);
        }

        // O(nlogn)
        v.sort((o1, o2) -> o2.get(1) - o1.get(1)); // 심판 점수 내림차순

        long total = 0; // 주최자가 매긴 점수의 합

        for (int i=0; i<K; i++) { // O(n^2)
            total += v.get(i).get(0); // O(1)
        }

        // 심판 점수로 상을 탄 사람들 제외하기
        // "O(m)"(m은 복사할 요소의 개수), 최악의 경우 : O(n)
        Vector<Vector<Integer>> v2 = new Vector<>(v.subList(K, N)); // 복사본 만들기

        // O(nlogn)
        v2.sort((o1, o2) -> o2.get(0) - o1.get(0)); // 주최자 점수 내림차순

        for (int i=0; i<M; i++) {
            total += v2.get(i).get(0); // O(1)
        }

        bw.write(String.valueOf(total));
        bw.flush();

        bw.flush();
        bw.close();
    }
}