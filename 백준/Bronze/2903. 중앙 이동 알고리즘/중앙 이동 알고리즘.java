    import java.io.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int start = 4;
            int sr = (int)Math.sqrt(start); // 2
            int result = 1;

            int N = Integer.parseInt(br.readLine());
            for (int i=0; i<N; i++) {
                sr += (sr-1);
                result = sr*sr;
            }

            bw.write(String.valueOf(result));
            bw.flush(); // 출력

            br.close();
            bw.close();
        }
    }