import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();

        int result = 0;
        String injury = "*";
        for (int i=0; i<num.length(); i++) {
            if (num.charAt(i) == '*') {
                if (i % 2 == 1) injury = "***";
                continue;
            }

            int n = num.charAt(i) - '0';
            if (i % 2 == 0) result += n;
            else result += 3*n;

            result %= 10;
        }

        int mul = 1;
        if (injury.equals("***")) {
            mul = 3;
        }

        for (int i=0; i<10; i++) {
            if ((result + i*mul) % 10 == 0) {
                bw.write(String.valueOf(i));
                break;
            }
        }

        bw.flush();

        br.close();
        bw.close();
    }
}