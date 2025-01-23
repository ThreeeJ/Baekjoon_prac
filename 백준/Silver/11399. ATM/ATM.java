import java.io.*;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Vector<Integer> v = new Vector<>();

        for (int i=0; i<N; i++) {
            v.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(v); // 오름차순 정렬


        int time = 0; // 한 사람이 걸리는 시간
        int total = 0; // 모든 사람들의 총 시간
        for (int i=0; i<N; i++) {
            time += v.get(i);
            total += time;
        }

        bw.write(String.valueOf(total));

        bw.flush();

        br.close();
        bw.close();
    }
}