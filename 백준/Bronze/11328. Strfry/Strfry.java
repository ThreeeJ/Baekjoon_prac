import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int n=0; n<N; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            StringBuilder sb1 = new StringBuilder(st.nextToken());
            StringBuilder sb2 = new StringBuilder(st.nextToken());

            boolean isPossible = true;
            int len = 0;

            if (sb1.length() == sb2.length()) {
                len = sb1.length();
            } else {
                bw.write("Impossible\n");
                continue;
            }

            for (int i=0; i<len; i++) {
                char a = sb1.charAt(0);

                int index = sb2.indexOf(String.valueOf(a)); // 문자의 인덱스 찾기

                if (index != -1) { // 존재 O
                    sb1.deleteCharAt(0);
                    sb2.deleteCharAt(index); // 해당 인덱스 문자 삭제
                } else { // 존재 X
                    isPossible = false;
                    break;
                }
            }

            if (isPossible) {
                bw.write("Possible\n");
            } else {
                bw.write("Impossible\n");
            }
        }

        bw.flush();

        br.close();
        bw.close();
    }
}