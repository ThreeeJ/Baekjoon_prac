import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String licensePlate = br.readLine();
        char pre = ' ';
        long total = 1;

        for (int i=0; i<licensePlate.length(); i++) {
            char ch = licensePlate.charAt(i);

            if (ch == 'c') {
                total *= pre == ch ? 25 : 26;
                total %= 1000000009;
                pre = ch;
            } else if (ch == 'd') {
                total *= pre == ch ? 9 : 10;
                total %= 1000000009;
                pre = ch;
            }
        }
        
        bw.write(String.valueOf(total));
        bw.flush();

        br.close();
        bw.close();
    }
}