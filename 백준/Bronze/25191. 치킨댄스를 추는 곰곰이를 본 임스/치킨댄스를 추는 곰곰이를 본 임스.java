import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int chicken = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int cola = Integer.parseInt(st.nextToken());
        int beer = Integer.parseInt(st.nextToken());

        int eat = Math.min((cola / 2) + beer, chicken);
        bw.write(String.valueOf(eat));

        bw.flush();

        br.close();
        bw.close();
    }
}