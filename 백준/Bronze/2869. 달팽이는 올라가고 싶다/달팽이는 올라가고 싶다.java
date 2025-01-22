    import java.io.*;
    import java.util.StringTokenizer;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            int day = (V - A) / (A - B);

            if (((V - A) % (A - B)) != 0) { // 아직도 이해가 잘 안됌
                day += 2;
            } else {
                day++;
            }

            bw.write(String.valueOf(day));
            bw.flush(); // 출력

            br.close();
            bw.close();
        }
    }