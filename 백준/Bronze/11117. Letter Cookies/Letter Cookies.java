import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int t=0; t<T; t++) {
            String s = br.readLine();
            int []alphabet = new int[26];

            for (int i = 0; i < s.length(); i++) {
                alphabet[s.charAt(i) - 'A']++;
            }

            int W = Integer.parseInt(br.readLine());
            for (int i = 0; i < W; i++) {
                boolean isSuccess = true;
                int[] copy = Arrays.copyOf(alphabet, alphabet.length);

                String word = br.readLine();
                for (int j = 0; j < word.length(); j++) {
                    char c = word.charAt(j);
                    if (copy[c - 'A'] <= 0) {
                        isSuccess = false;
                        break;
                    } else {
                        copy[c - 'A']--;
                    }
                }

                if (isSuccess) {
                    bw.write("YES\n");
                } else {
                    bw.write("NO\n");
                }
            }
        }

        bw.flush();

        br.close();
        bw.close();
    }
}