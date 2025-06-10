import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str[] = br.readLine().split(" ");

            if (str[0].equals("#")) break;

            int age = Integer.parseInt(str[1]);
            int weight = Integer.parseInt(str[2]);

            if (age > 17 || weight >= 80) {
                bw.write(str[0] + " Senior\n");
            } else {
                bw.write(str[0] + " Junior\n");
            }

        }

        bw.flush();

        br.close();
        bw.close();
    }
}