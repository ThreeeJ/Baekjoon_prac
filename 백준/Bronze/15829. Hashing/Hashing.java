import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());
        String s = br.readLine();

        long total = 0;
        for (int i=0; i<s.length(); i++) {
            int n = s.charAt(i) - 'a' + 1;
            total += n * (long)Math.pow(31, i);
        }

        bw.write(String.valueOf(total));

        bw.flush();

        br.close();
        bw.close();
    }
}