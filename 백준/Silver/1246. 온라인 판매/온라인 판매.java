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
        for (int i=0; i<M; i++) {
            v.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(v); // 오름차순

        int minCost = 0; // 최소 가격
        int maxTotal = 0; // 총 가격
        for (int i=0; i<M; i++) {
            int x = (M-i <= N ? M-i : N);
            if (v.get(i) * x > maxTotal) {
                minCost = v.get(i);
                maxTotal = minCost * x;
            }
        }

        bw.write(String.valueOf(minCost));
        bw.write(" ");
        bw.write(String.valueOf(maxTotal));

        bw.flush();

        br.close();
        bw.close();
    }
}