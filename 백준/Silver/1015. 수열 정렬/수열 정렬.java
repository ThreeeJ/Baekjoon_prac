import java.io.*;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Vector<Integer> v1 = new Vector<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            v1.add(Integer.parseInt(st.nextToken()));
        }

        Vector<Integer> v2 = new Vector<>(v1);
        Collections.sort(v2);

        for (int i = 0; i < N; i++) {
            int a = v1.get(i);
            int index = v2.indexOf(a);

            bw.write(index + " ");

            v2.set(index, -1);
        }

        bw.flush();

        br.close();
        bw.close();
    }
}