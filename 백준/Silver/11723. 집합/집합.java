import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        boolean num[] = new boolean[21]; // 1~20까지, 0제외하기 위해 1 추가<

        Arrays.fill(num, false); // 배열의 모든 값 초기화

        for (int i=0; i<M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            if (s.equals("all")) {
                Arrays.fill(num, true);
                continue;
            } else if (s.equals("empty")) {
                Arrays.fill(num, false);
                continue;
            }

            int n = Integer.parseInt(st.nextToken());
            switch (s) {
                case "add":
                    if (!num[n]) // num[n] == false
                        num[n] = true;
                    break;
                case "remove":
                    if (num[n]) // num[n] = true
                        num[n] = false;
                    break;
                case "check":
                    if (num[n]) bw.write(1 + "\n");
                    else bw.write(0 + "\n");
                    break;
                case "toggle":
                    num[n] = !num[n];
                    break;
            }
        }

        bw.flush();

        br.close();
        bw.close();
    }
}