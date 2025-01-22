    import java.io.*;
    import java.util.StringTokenizer;
    import java.util.Vector;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n[] = new int[4];

            int T = Integer.parseInt(br.readLine());

            for (int i=0; i<T; i++) {
                int money = Integer.parseInt(br.readLine());

                if (money >= 25) {
                    n[0] = money / 25;
                    money %= 25;
                }

                if (money >= 10) {
                    n[1] = money / 10;
                    money %= 10;
                }

                if (money >= 5) {
                    n[2] = money / 5;
                    money %= 5;
                }

                if (money >= 1) {
                    n[3] = money / 1;
                    money %= 1;
                }


                bw.write(n[0] + " ");
                bw.write(n[1] + " ");
                bw.write(n[2] + " ");
                bw.write(n[3] + "\n");

                for (int j=0; j<4; j++) { // 초기화
                    n[j] = 0;
                }
            }

            bw.flush(); // 출력

            br.close();
            bw.close();
        }
    }