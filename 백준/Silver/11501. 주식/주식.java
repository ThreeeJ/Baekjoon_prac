import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());

            Vector<Integer> v = new Vector<>();

            long profit = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; j++) {
                v.add(Integer.parseInt(st.nextToken()));
            }

            int max = v.lastElement();
            for (int j = v.size()-2; j>=0; j--) {
                if (v.get(j) < max) {
                    profit += (max - v.get(j));
                } else if (v.get(j) > max){
                    max = v.get(j);
                }
            }

            bw.write(String.valueOf(profit));
            if (i != T-1) { // 마지막 줄은 제외
                bw.newLine();
            }
        }

        br.close();
        bw.close();
    }
}