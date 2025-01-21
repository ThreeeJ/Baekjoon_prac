import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int alpha[] = new int[26]; // 알파벳 개수
        int maxCount = 0;
        char maxAlpha = '?';

        String str = br.readLine();
        str = str.toUpperCase(); // 대문자로 변환

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            ++alpha[ch-'A'];
            if (maxCount < alpha[ch-'A']) {
                maxCount = alpha[ch-'A'];
                maxAlpha = str.charAt(i);
            } else if (maxCount == alpha[ch - 'A']) {
                maxAlpha = '?';
            }
        }

        bw.write(maxAlpha);
        bw.flush(); // 출력

        br.close();
        bw.close();
    }
}