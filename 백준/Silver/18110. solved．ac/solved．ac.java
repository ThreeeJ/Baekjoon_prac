import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int except = (int)Math.round(n * 0.15);

        double sum = 0;
        for (int i = except; i < n-except; i++) {
            sum += arr[i];
        }

        int result = (int)Math.round(sum / (n - except * 2));

        bw.write(String.valueOf(result));

        br.close();
        bw.close();
    }
}