import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double totalPoint = 0.0; // (학점 × 과목평점)의 합
        double totalCredit = 0.0; // 학점 총합

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken(); // 과목명 무시
            double credit = Double.parseDouble(st.nextToken()); // 학점
            String grade = st.nextToken(); // 등급

            if (grade.equals("P")) continue; // P 등급 제외

            double point = getGradePoint(grade);
            totalPoint += credit * point;
            totalCredit += credit;
        }

        bw.write(String.valueOf(totalPoint / totalCredit));

        br.close();
        bw.close();
    }

    public static double getGradePoint(String grade) {
        switch (grade) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            default:
                return 0.0;
        }
    }
}