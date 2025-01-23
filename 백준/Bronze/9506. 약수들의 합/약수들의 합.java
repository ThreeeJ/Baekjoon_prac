import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }

            Vector<Integer> v = new Vector<>();
            int sum = 0;

            for (int i=1; i<n; i++) {
                if (n % i == 0) {
                    sum += i;
                    v.add(i);
                }
            }

            if (n == sum) {
                bw.write(n + " = ");
                for (int i=0; i<v.size(); i++) {
                    bw.write(String.valueOf(v.get(i)));
                    if (i != v.size()-1) {
                        bw.write(" + ");
                    }
                }
            } else {
                bw.write(n + " is NOT perfect.");
            }
            bw.newLine();
        }

        bw.flush();

        br.close();
        bw.close();
    }
}