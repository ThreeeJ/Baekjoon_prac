import javax.management.StringValueExp;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 자리 수
        int K = Integer.parseInt(st.nextToken()); // 빼야 할 수
        int Ktemp = K;
        String num = br.readLine();

        Vector<Character> result = new Vector<>();

        for (int i = 0; i < N; i++) {
            char ch = num.charAt(i);

            // 안전한 lastElement() 방식 사용
            while (!result.isEmpty() && result.lastElement() < ch && K > 0) {
                result.remove(result.size() - 1);
                K--;
            }

            if (result.size() < N - K) {
                result.add(ch);
            }
        }

        // 필요한 개수만큼만 출력 (N-K개)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N-Ktemp; i++) {
            sb.append(result.get(i));
        }

        bw.write(String.valueOf(sb));
        bw.flush();

        br.close();
        bw.close();
    }
}