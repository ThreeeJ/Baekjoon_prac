import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A, B, C;
        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();

        System.out.println(A+B-C);

        String sAB = String.valueOf(A) + String.valueOf(B); // 숫자를 문자열로 변환 후 합치기
        int iAB = Integer.parseInt(sAB); // 문자열을 숫자로 바꾸기
        System.out.println(iAB-C);

        s.close();
    }
}