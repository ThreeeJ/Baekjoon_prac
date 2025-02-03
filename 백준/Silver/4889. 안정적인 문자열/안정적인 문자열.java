import java.io.*;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 1;
        while (true) {
            String s = br.readLine();
            if (s.contains("-")) break;
            else if (cnt != 1) {
                bw.newLine();
            }

            Vector<Character> v = new Vector<>();
            int len = s.length();
            int change = 0;

            for (int i=0; i<len; i++) {
                char c = s.charAt(i);

                if (c == '{') v.add(c);
                else if (v.size() == 0) { // c = '}'
                    v.add('{');
                    change++;
                } else { // c = '}' && v.size() != 0
                    v.remove(v.size()-1);
                }
            }

            bw.write(String.valueOf(cnt) + ". " + String.valueOf(change+v.size()/2));
            cnt++;
        }

        bw.flush();

        br.close();
        bw.close();
    }
}