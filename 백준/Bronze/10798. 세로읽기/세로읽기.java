import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        char arr[][] = new char[5][15];

        for (int i=0; i<5; i++) {
            String s = br.readLine();

            if (max < s.length())
                max = s.length();

            for (int j=0; j<s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<max; i++) {
            for (int j=0; j<5; j++) {
                if (arr[j][i] != '\0') {
                    sb.append(arr[j][i]);
                }
            }
        }

        bw.write(sb.toString());

        bw.flush(); // 출력

        br.close();
        bw.close();
    }
}