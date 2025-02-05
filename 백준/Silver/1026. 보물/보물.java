import java.io.*;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Vector<Integer> A = new Vector<>();
        Vector<Integer> B = new Vector<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());

        int sum = 0;
        for (int i=0; i<N; i++) {
            sum += A.get(i) * B.get(i);
        }
        
        bw.write(String.valueOf(sum));
        bw.flush();

        br.close();
        bw.close();
    }
}