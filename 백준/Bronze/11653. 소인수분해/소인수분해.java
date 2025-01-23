import java.io.*;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Vector<Integer> v = new Vector<>();

        boolean isPrime[] = new boolean[N+1];
        for (int i=2; i<N+1; i++) isPrime[i] = true; // 초기화

        for (int i=2; i*i<=N; i++) { // 에라토스테네스의 체
            if (isPrime[i]) {
                for (int j=i*i; j<=N; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        int num = N;
        for (int i=2; i<=N; i++) {
            if (num == 1) break;

            if (isPrime[i]) {
                while (true) {
                    if (num % i == 0) {
                        v.add(i);
                        num /= i;
                    } else break;
                }
            }
        }

        for (int i=0; i<v.size(); i++) {
            bw.write(String.valueOf(v.get(i)));
            if (i != v.size() - 1) bw.newLine();
        }

        bw.flush();

        br.close();
        bw.close();
    }
}