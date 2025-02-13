import java.io.*;
import java.util.Collections;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Vector<Integer> v = new Vector<>();
        for (int i=0; i<N; i++) {
            v.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(v); // 오름차순

        int totalWeight = 0; // 총 무게
        for (int i=0; i<N; i++) {
            if (v.get(i) * (N-i) > totalWeight) {
                totalWeight = v.get(i) * (N-i);
            }
        }

        bw.write(String.valueOf(totalWeight));

        bw.flush();

        br.close();
        bw.close();
    }
}