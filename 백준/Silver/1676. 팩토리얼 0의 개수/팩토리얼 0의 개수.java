import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int two = 0;
        int five = 0;

        for (int i=N; i>1; i--) {
            int j = i;
            while (j % 2 == 0 || j % 5 == 0) {
                if (j % 2 == 0) {
                    two++;
                    j /= 2;
                }

                if (j % 5 == 0) {
                    five++;
                    j /= 5;
                }
            }
        }

        bw.write(String.valueOf(Math.min(two, five)));

        bw.flush();

        br.close();
        bw.close();
    }
}