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

        int N = Integer.parseInt(br.readLine());
        TreeMap<Integer, Vector<Integer>> map = new TreeMap<>(Collections.reverseOrder());
        // TreeMap : key 값을 기준으로 정렬(내 코드에서는 key 값을 기준으로 내림차순 정렬)

        StringTokenizer st;
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            map.computeIfAbsent(k, key -> new Vector<>()).add(v); // 아주 중요
        }

        int totalScore = 0; // 과제 점수
        int longDay = map.firstKey(); // 제일 긴 날
        Vector<Integer> unselected = new Vector<>(); // 선택받지 못한 과제들의 점수 모임

        for (int i = longDay; i >= 1; i--) {
            Vector<Integer> temp = map.get(i); // i라는 key 값이 없으면 null 반환
            if (temp != null) {
                unselected.addAll(temp); // 기존꺼와 합치기
            }

            if (!unselected.isEmpty()) {
                int maxScore = Collections.max(unselected);
                totalScore += maxScore;
                unselected.remove(Integer.valueOf(maxScore)); // unselected.remove(maxScore) -> 이렇게 적으면 index로 접근
            }
        }

        bw.write(String.valueOf(totalScore));

        bw.flush();
        bw.close();
    }
}