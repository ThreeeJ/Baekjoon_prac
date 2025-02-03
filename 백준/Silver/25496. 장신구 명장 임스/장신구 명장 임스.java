import java.io.*;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int P = 200 - Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        Vector<Integer> v = new Vector<>();
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            v.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(v); // 오름차순 정렬

        int cnt = 0;
        for (int i=0; i<N; i++) {
            if (P <= 0) break;
            
            cnt++;
            P -= v.get(i);
        }

        bw.write(String.valueOf(cnt));
        bw.flush();

        br.close();
        bw.close();
    }
}