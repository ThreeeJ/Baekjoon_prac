import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int xMin = (x < w-x) ? x : w-x;
        int yMin = (y < h-y) ? y : h-y;

        if (xMin < yMin)
            bw.write(String.valueOf(xMin));
        else bw.write(String.valueOf(yMin));

        bw.flush();

        br.close();
        bw.close();
    }
}