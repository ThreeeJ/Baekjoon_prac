import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());
        String s = br.readLine();

        long total = 0;
        long pow = 1;
        for(int i = 0; i < L; i++) {
            total += ((s.charAt(i) - 'a' + 1) * pow);
            pow = (pow * 31) % 1234567891;
        }
        total %= 1234567891;

        bw.write(String.valueOf(total));

        bw.flush();

        br.close();
        bw.close();
    }
}