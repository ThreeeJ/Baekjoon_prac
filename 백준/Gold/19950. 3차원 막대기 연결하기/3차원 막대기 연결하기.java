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

        int xyz[] = new int[6]; // 두 점 x y z 좌표 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<6; i++) {
            xyz[i] = Integer.parseInt(st.nextToken());
        }
        double distance = Math.sqrt(Math.pow(xyz[3] - xyz[0], 2) + Math.pow(xyz[4] - xyz[1], 2)+ Math.pow(xyz[5] - xyz[2], 2));

        int N = Integer.parseInt(br.readLine());

        Vector<Integer> len = new Vector<>();
        int totalLen = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            len.add(Integer.parseInt(st.nextToken()));
            totalLen += len.get(i);
        }

        if ((double)totalLen >= distance) {
            int longer = Collections.max(len);
            if ((double)(longer - (totalLen-longer)) <= distance) {
                bw.write("YES");
            } else {
                bw.write("NO");
            }
        } else {
            bw.write("NO");
        }

        bw.flush();

        bw.flush();
        bw.close();
    }
}