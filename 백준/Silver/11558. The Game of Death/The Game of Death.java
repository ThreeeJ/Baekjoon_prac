import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int t=0; t<T; t++) {
            int N = Integer.parseInt(br.readLine());
            int arr[] = new int[N+1];

            for (int i = 1; i <= N; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            boolean[] visited = new boolean[N + 1];
            int count = 1;
            int index = 1;
            visited[1] = true;

            while (arr[index] != N) {
                index = arr[index];
                count++;

                if (visited[index]) {
                    count = 0;
                    break;
                }

                visited[index] = true;
            }

            bw.write(count + "\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}