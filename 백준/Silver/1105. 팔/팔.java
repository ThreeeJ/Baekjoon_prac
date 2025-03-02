import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String L = st.nextToken(); // 작은 수
        String R = st.nextToken(); // 큰 수

        int cnt = 0; // 8의 개수

        if (L.length() == R.length()) { // 자리 수 비교
            for (int i=0; i<L.length(); i++) {
                if (L.charAt(i) == R.charAt(i)) { // 각 자리의 '수' 비교
                    if (L.charAt(i) == '8') {
                        cnt++;
                    }
                } else break;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();

        br.close();
        bw.close();
    }
}