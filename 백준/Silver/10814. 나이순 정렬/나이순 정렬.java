import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static class People {

        private int age;
        private String name;
        private int index;

        public People(int age, String name, int index) {
            this.age = age;
            this.name = name;
            this.index = index;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public int getIndex() {
            return index;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        People[] people = new People[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            people[i] = new People(Integer.parseInt(st.nextToken()), st.nextToken(), i);
        }

        Arrays.sort(people, new Comparator<People>() {
            @Override
            public int compare(People p1, People p2) {
                if (p1.getAge() == p2.getAge()) {
                    return Integer.compare(p1.getIndex(), p2.getIndex()); // 입력 순서대로
                }
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });

        for (People p : people) {
            bw.write(p.getAge() + " " + p.getName());
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}