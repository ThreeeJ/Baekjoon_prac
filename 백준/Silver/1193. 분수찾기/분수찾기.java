    import java.io.*;
    import java.util.StringTokenizer;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());
            int a = 1, b = 1;
            int gap = 0;

            while (true) {
                if (n >= a && n <= b) {
                    if (gap % 2 == 0) {
                        bw.write(String.valueOf(b-n+1));
                        bw.write("/");
                        bw.write(String.valueOf(n-a+1));
                    } else {
                        bw.write(String.valueOf(n-a+1));
                        bw.write("/");
                        bw.write(String.valueOf(b-n+1));
                    }
                    break;
                } else {
                    gap++;
                    a = b + 1;
                    b = a + gap;
                }
            }

            bw.flush();

            br.close();
            bw.close();
        }
    }