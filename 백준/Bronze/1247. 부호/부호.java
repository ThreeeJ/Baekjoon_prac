import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i=0; i<3; i++) {
            int N = Integer.parseInt(br.readLine());
            BigInteger total = BigInteger.ZERO;
            for (int j=0; j<N; j++) {
                long n = Long.parseLong(br.readLine());
                total = total.add(BigInteger.valueOf(n));
            }

            if (total.compareTo(BigInteger.ZERO) == 0) bw.write(String.valueOf(total+"\n"));
            else if (total.compareTo(BigInteger.ZERO) > 0) bw.write(String.valueOf("+\n"));
            else bw.write(String.valueOf("-\n"));
        }

        bw.flush();

        br.close();
        bw.close();
    }
}