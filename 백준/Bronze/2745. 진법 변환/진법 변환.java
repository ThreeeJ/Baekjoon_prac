import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int num = Integer.parseInt(st.nextToken());
        long result = 0;

        for (int i=0; i<s.length(); i++) {
            int a = 0;
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                a = s.charAt(i) - 'A' + 10;
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                a = s.charAt(i) - '0';
            }
            result += Math.pow(num, s.length()-i-1) * a;
        }

        bw.write(String.valueOf(result));
        bw.flush(); // 출력

        br.close();
        bw.close();
    }
}