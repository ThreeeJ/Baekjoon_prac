import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int P = Integer.parseInt(br.readLine());
        int arr[] = new int[4];
        // 0 : 소프트웨어개발과
        // 1 : 임베디드소프트웨어개발과
        // 2 : 인공지능소프트웨어개발과
        // 3 : 1학년 학생의 수

        for (int i=0; i<P; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int G = Integer.parseInt(st.nextToken()); // 학년
            int C = Integer.parseInt(st.nextToken()); // 반
            int N = Integer.parseInt(st.nextToken()); // 번호

            if (G == 1) arr[3]++;
            else {
                if (C == 1 || C == 2) arr[0]++;
                else if (C == 3) arr[1]++;
                else if (C == 4) arr[2]++;
            }
        }

        for (int i=0; i<arr.length; i++) {
            bw.write(arr[i] + "\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}