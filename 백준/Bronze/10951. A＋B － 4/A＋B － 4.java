import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A, B;
        while (s.hasNextInt()) { // 입력이 있는 동안 반복
            A = s.nextInt();
            B = s.nextInt();
            System.out.println(A + B);
        }

        s.close();
    }
}