import java.io.*;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Vector<String> v = new Vector<>();

        for (int i=0; i<N; i++) {
            v.add(br.readLine());
        }

        Set<String> set = new HashSet<>(v); // 중복 제거
        v = new Vector<>(set); // 다시 Vector로 감쌈

        v.sort(Comparator
                .comparingInt(String::length) // 1. 길이 기준 정렬
                .thenComparing(Comparator.naturalOrder())); // 2. 길이가 같으면 사전순


        for (int i=0; i<v.size(); i++) {
            bw.write(v.get(i)+"\n");
        }

        bw.flush();

        bw.flush();
        bw.close();
    }
}