import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int antenna = Integer.parseInt(br.readLine());
        int eyes = Integer.parseInt(br.readLine());

        boolean isCorrect = false;

        if (antenna >= 3 && eyes <= 4) {
            bw.write("TroyMartian\n");
            isCorrect = true;
        }

        if (antenna <= 6 && eyes >= 2) {
            bw.write("VladSaturnian\n");
            isCorrect = true;
        }

        if (antenna <= 2 && eyes <= 3) {
            bw.write("GraemeMercurian\n");
            isCorrect = true;
        }

        if (!isCorrect) {
            bw.write("");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}