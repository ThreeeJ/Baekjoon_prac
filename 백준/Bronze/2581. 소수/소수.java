import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        boolean isPrime[] = new boolean[N+1];
        for (int i=2; i<N+1; i++) isPrime[i] = true; // 초기화

        for (int i=2; i*i<=N; i++) {
            if (isPrime[i]) {
                for (int j=i*i; j<=N; j+=i) { // i의 배수를 제거
                    isPrime[j] = false;
                }
            }
        }

        int sum = 0;
        int first = 0;
        boolean firstCheck = false;
        for (int i=M; i<=N; i++) {
            if (isPrime[i]) {
                if (!firstCheck) {
                    first = i;
                    firstCheck = true;
                }
                sum += i;
            }
        }

        if (firstCheck) {
            bw.write(String.valueOf(sum));
            bw.newLine();
            bw.write(String.valueOf(first));
        } else {
            bw.write(String.valueOf(-1));
        }

        bw.flush();

        br.close();
        bw.close();
    }
}