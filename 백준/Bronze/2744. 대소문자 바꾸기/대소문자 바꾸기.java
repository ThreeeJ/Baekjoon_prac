import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                sb.append(Character.toLowerCase(c));
            } else if (c >= 'a' && c <= 'z') {
                sb.append(Character.toUpperCase(c));
            }
        }

        bw.write(String.valueOf(sb));

        bw.flush();

        br.close();
        bw.close();
    }
}