import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        long arr[] = new long[N];

        long sum = 0; // 총 몇개가 나눠졌는지
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            sum += arr[i];
        }

        long roomNum = sum / N; // 각 방마다 몇개가 있어야 되는지에 대한 기준

        long cnt = 0; // 몇번 넘겼는지에 대한 변수
        for (int i=0; i<N-1; i++) {
            if (arr[i] > roomNum) {
                arr[i+1] += arr[i] - roomNum;
                cnt += arr[i] - roomNum;
            } else if (arr[i] < roomNum) {
                arr[i+1] -= roomNum - arr[i];
                cnt += roomNum - arr[i];
            } else { // arr[i] == roomNum
                continue;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();

        br.close();
        bw.close();
    }
}