import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        Vector<Integer> v = new Vector<>();
        for (int i=0; i<N.length(); i++) {
            v.add((int)N.charAt(i) - '0');
        }

        int cnt = 0;
        while (!v.isEmpty()) {
            int a = v.indexOf(1);

            if (a == -1) {
                if (v.lastElement() == 0) {
                    v.set(v.size()-1, 9); // 9로 바꾸기
                    int which = 1;
                    while (true) {
                        if (v.get(v.size()-1-which) == 0) {
                            v.set(v.size()-1-which, 9);
                        } else {
                            v.set(v.size()-1-which, v.get(v.size()-1-which)-1);
                            break;
                        }
                        which++;
                    }
                } else {
                    v.set(v.size()-1, v.lastElement()-1);
                }
            } else {
                v.remove(a); // 벡터에서는 a 인덱스를 제거하면 a 뒤에는 자동으로 앞으로 당겨짐
                while (!v.isEmpty() && v.get(0) == 0) { // v.get(0) == v.getFirst()
                    v.remove(0); // v.remove(0) == v.removeFirst()
                }
            }

            cnt++;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();

        br.close();
        bw.close();
    }
}