    import java.io.*;
    import java.util.StringTokenizer;
    import java.util.Vector;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


            StringTokenizer st = new StringTokenizer(br.readLine());
            long num = Long.parseLong(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            Vector<Long> v = new Vector<>();
            while (num > 0) {
                v.add(num % n);
                num /= n;
            }

            StringBuilder sb = new StringBuilder();
            for (int i=v.size()-1; i>=0; i--) {
                char ch;
                long a = v.get(i);

                if (a >= 10 && a <= 35) {
                    ch = (char)(a - 10 + 'A');
                } else {
                    ch = (char)(a + '0');
                }

                sb.append(ch);
            }

            bw.write(sb.toString());
            bw.flush(); // 출력

            br.close();
            bw.close();
        }
    }