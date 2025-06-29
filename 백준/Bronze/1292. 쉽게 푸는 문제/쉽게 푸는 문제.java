import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int n = 1;
        int idx = 1;
        int sum = 0;
        while(idx <= B){
            for(int i = 0; i < n; i++){
                if(idx >= A && idx <= B) {
                    sum += n;
                }
                idx++;
            }
            n++;
        }

        bw.write(String.valueOf(sum));
        bw.flush();

        br.close();
        bw.close();
    }
}