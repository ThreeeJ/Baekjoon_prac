import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int R = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());
        int student = 28;

        int leavings = R * 8 + S * 3 - student;

        bw.write(String.valueOf(leavings));

        bw.flush();

        br.close();
        bw.close();
    }
}