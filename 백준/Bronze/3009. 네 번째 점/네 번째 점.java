import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Vector<Integer> X = new Vector<>();
        Vector<Integer> Y = new Vector<>();
        int needX, needY;

        for (int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            X.add(Integer.parseInt(st.nextToken()));
            Y.add(Integer.parseInt(st.nextToken()));
        }

        // X비교
        if ((int)X.get(0) == (int)X.get(1)) {
            needX = X.get(2);
        } else if ((int)X.get(0) == (int)X.get(2)) {
            needX = X.get(1);
        } else {
            needX = X.get(0);
        }

        // Y비교
        if ((int)Y.get(0) == (int)Y.get(1)) {
            needY = Y.get(2);
        } else if ((int)Y.get(0) == (int)Y.get(2)) {
            needY = Y.get(1);
        } else {
            needY = Y.get(0);
        }

        bw.write(needX + " " + needY);

        bw.flush();

        br.close();
        bw.close();
    }
}