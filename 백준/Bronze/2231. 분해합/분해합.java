import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int num, total = 0;
        boolean is = false;

        for (int i=Integer.parseInt(s)-s.length()*9; i<Integer.parseInt(s); i++) {
            num = i;
            total = 0;
            total += i;
            for (int j=0; j<s.length(); j++) {
                total += num % 10;
                num /= 10;
            }

            if (total == Integer.parseInt(s)) {
                is = true;
                bw.write(String.valueOf(i));
                break;
            }
        }
        
        if (!is) {
            bw.write("0");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}