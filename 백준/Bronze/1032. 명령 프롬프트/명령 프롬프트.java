import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();
        char b[] = new char[str.length()];
        for (int i=0; i<str.length(); i++) {
            b[i] = str.charAt(i);
        }

        for (int i=0; i<N-1; i++) {
            str = br.readLine();
            for (int j=0; j<str.length(); j++) {
                if (b[j] != str.charAt(j)) b[j] = '?';
            }
        }

        for (int i=0; i<b.length; i++) {
            bw.write(String.valueOf(b[i]));
        }
        bw.flush();

        bw.flush();
        bw.close();
    }
}