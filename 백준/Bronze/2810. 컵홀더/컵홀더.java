import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int cup = 1;

        String s = br.readLine();
        boolean isCouple = false;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'S') {
                cup++;
            } else if (s.charAt(i) == 'L') {
                if (isCouple) {
                    isCouple = false;
                    cup++;
                }
                else {
                    isCouple = true;
                }
            }
        }

        int people = Math.min(N, cup);
        bw.write(String.valueOf(people));

        bw.flush();

        br.close();
        bw.close();
    }
}