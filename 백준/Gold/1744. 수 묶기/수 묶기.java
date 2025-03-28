import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Vector;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Vector<Integer> plus = new Vector<>(); // 양수값을 담을 벡터 plus
        Vector<Integer> minus = new Vector<>(); // 음수값을 담을 벡터 minus

        for(int i=0; i<N; i++){ // 벡터에 삽입
            int num = Integer.parseInt(br.readLine());
            if (num > 0) {
                plus.add(num);
            } else {
                minus.add(num);
            }
        }

        int sumPlus = 0; // 양수의 합
        int sumMinus = 0; // 음수의 합

        Collections.sort(plus, Collections.reverseOrder()); // 벡터 내림차순 정렬
        Collections.sort(minus); // 벡터 오름차순 정렬

        while (!plus.isEmpty()) {
            int x = plus.remove(0);
            if (plus.isEmpty()) { // x가 마지막 남은 요소일 때
                sumPlus += x;
            } else if (x == 1 || plus.get(0) == 1) {
                int y = plus.remove(0);
                sumPlus += (x + y);
            } else {
                int y = plus.remove(0);
                sumPlus += (x * y);
            }
        }

        while (!minus.isEmpty()) {
            int x = minus.remove(0);
            if (minus.isEmpty()) { // x가 마지막 남은 요소일 때
                sumMinus += x;
            } else if (x == 0 || minus.get(0) == 0) {
                int y = minus.remove(0);
                sumMinus += (x * y);
            } else {
                int y = minus.remove(0);
                sumMinus += (x * y);
            }
        }

        bw.write(String.valueOf(sumPlus+sumMinus));
        bw.flush();

        br.close();
        bw.close();
    }
}