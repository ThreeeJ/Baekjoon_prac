import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String gradeS[] = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"};
        double gradeD[] = {4.3, 4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0};
        // float gradeF[] = {4.3f, 4.0f, 3.7f, 3.3f, 3.0f, 2.7f, 2.3f, 2.0f, 1.7f, 1.3f, 1.0f, 0.7f, 0.0f};

        int i;
        String grade = s.next();
        for (i=0; i<13; i++) {
            if (grade.equals(gradeS[i])) {
                break;
            }
        }

        System.out.printf("%.1f", gradeD[i]);

        s.close();
    }
}