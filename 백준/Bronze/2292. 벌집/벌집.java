    import java.io.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int count = 1;
            int start = 2, end = 7;
            int sgap = 6, egap = 12;

            int num = Integer.parseInt(br.readLine());

            while (true) {
                if (num == 1) break;

                count++;
                if (num >= start && num <= end) {
                    break;
                } else {
                    start += sgap;
                    end += egap;
                    sgap = egap;
                    egap += 6;
                }
            }

            bw.write(String.valueOf(count));
            bw.flush(); // 출력

            br.close();
            bw.close();
        }
    }