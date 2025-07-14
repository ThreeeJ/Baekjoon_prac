import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        int rnrdj = (A % C == 0) ? A / C : A / C + 1;
        int tngkr = B % D == 0 ? B / D : B / D + 1;

        int day = Math.max(rnrdj, tngkr);

        bw.write(String.valueOf(L - day));

        bw.flush();

        br.close();
        bw.close();
    }
}