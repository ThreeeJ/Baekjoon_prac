import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int g = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int people = g * p;
        int group = g + (t * p);

        if (people < group) { // 개별 검사가 더 적을 때
            bw.write("1");
        } else if (people > group) { // 그룹 검사가 더 적을 때
            bw.write("2");
        } else { // 둘이 같을 때
            bw.write("0");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}