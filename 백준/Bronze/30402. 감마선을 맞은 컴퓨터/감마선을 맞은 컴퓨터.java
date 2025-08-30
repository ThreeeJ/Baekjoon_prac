import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean isBreak = false;
        for (int i=0; i<15; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j=0; j<15; j++) {
                char ch = st.nextToken().charAt(0);

                if (ch == 'w') {
                    bw.write("chunbae");
                    isBreak = true;
                    break;
                }
                else if (ch == 'b') {
                    bw.write("nabi");
                    isBreak = true;
                    break;
                }
                else if (ch == 'g') {
                    bw.write("yeongcheol");
                    isBreak = true;
                    break;
                }
            }

            if (isBreak) {
                break;
            }
        }

        bw.flush();

        br.close();
        bw.close();
    }
}