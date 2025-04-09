import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Main{
    static int gcd(int a, int b) {
        while (b != 0) {
            int mod = a % b;
            a = b;
            b = mod;
        }

        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            while (a > 1) { // a == 1이 되는 순간 정지
                int x;
                if (b % a == 0) x = b/a;
                else x = (int)(b/a) + 1;

                a = (a*x)-b;
                b *= x;

                int temp = gcd(a,b);
                a /= temp;
                b /= temp;
            }

            bw.write(b + "\n");
        }
        
        bw.flush();

        bw.flush();
        bw.close();
    }
}